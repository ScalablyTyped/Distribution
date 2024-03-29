package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataProviderRequest extends StObject {
  
  var deadline: js.Date
  
  var formatId: String
  
  def getDeferral(): DataProviderDeferral
  
  def setData(value: Any): Unit
}
object IDataProviderRequest {
  
  inline def apply(deadline: js.Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: Any => Unit): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[IDataProviderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataProviderRequest] (val x: Self) extends AnyVal {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFormatId(value: String): Self = StObject.set(x, "formatId", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => DataProviderDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setSetData(value: Any => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
