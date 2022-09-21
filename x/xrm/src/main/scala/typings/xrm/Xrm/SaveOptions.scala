package typings.xrm.Xrm

import typings.xrm.XrmEnum.SaveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines save options for saving the record.
  *
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data/save External Link: save(Client API reference)}
  */
trait SaveOptions extends StObject {
  
  /**
    * Indicates whether to use the Book or Reschedule messages rather than the Create or Update messages.
    * Applicable to appointment, recurring appointment, or service activity records.
    * @remarks This property is not supported in Unified Interface.
    */
  var UseSchedulingEngine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify a value indicating how the save event was initiated.
    * @remarks For a list of supported values, see the return value of the getSaveMode method.
    * @remarks Note that setting the saveMode does not actually take the corresponding action; it is just to provide information to the OnSave event handlers about the reason for the save operation.
    */
  var saveMode: SaveMode
}
object SaveOptions {
  
  inline def apply(saveMode: SaveMode): SaveOptions = {
    val __obj = js.Dynamic.literal(saveMode = saveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveOptions]
  }
  
  extension [Self <: SaveOptions](x: Self) {
    
    inline def setSaveMode(value: SaveMode): Self = StObject.set(x, "saveMode", value.asInstanceOf[js.Any])
    
    inline def setUseSchedulingEngine(value: Boolean): Self = StObject.set(x, "UseSchedulingEngine", value.asInstanceOf[js.Any])
    
    inline def setUseSchedulingEngineUndefined: Self = StObject.set(x, "UseSchedulingEngine", js.undefined)
  }
}
