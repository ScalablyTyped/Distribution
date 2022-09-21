package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object of this type is passed to the DataProviderHandler delegate. */
trait DataProviderRequest extends StObject {
  
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: js.Date
  
  /** Specifies the format id. */
  var formatId: String
  
  /**
    * Returns a DataProviderDeferral object.
    * @return An data provider deferral object.
    */
  def getDeferral(): DataProviderDeferral
  
  /**
    * Sets the content of the DataPackage to be shared with a target app.
    * @param value The object associated with a particular format in the DataPackage .
    */
  def setData(value: Any): Unit
}
object DataProviderRequest {
  
  inline def apply(deadline: js.Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: Any => Unit): DataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[DataProviderRequest]
  }
  
  extension [Self <: DataProviderRequest](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFormatId(value: String): Self = StObject.set(x, "formatId", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => DataProviderDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setSetData(value: Any => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
