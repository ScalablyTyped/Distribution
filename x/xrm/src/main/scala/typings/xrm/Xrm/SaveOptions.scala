package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines save options to control how appointment, recurring appointment, or service activity records are processed.
  *
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data/save External Link: save(Client API reference)}
  */
@js.native
trait SaveOptions extends StObject {
  
  /**
    * Indicates whether to use the Book or Reschedule messages rather than the Create or Update messages.
    * Applicable to appointment, recurring appointment, or service activity records.
    */
  var UseSchedulingEngine: js.UndefOr[Boolean] = js.native
}
object SaveOptions {
  
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit class SaveOptionsMutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseSchedulingEngine(value: Boolean): Self = StObject.set(x, "UseSchedulingEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSchedulingEngineUndefined: Self = StObject.set(x, "UseSchedulingEngine", js.undefined)
  }
}
