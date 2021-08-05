package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataProviderRequest extends StObject {
  
  var deadline: Date
  
  var formatId: String
  
  def getDeferral(): DataProviderDeferral
  
  def setData(value: js.Any): Unit
}
object IDataProviderRequest {
  
  inline def apply(deadline: Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: js.Any => Unit): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[IDataProviderRequest]
  }
  
  extension [Self <: IDataProviderRequest](x: Self) {
    
    inline def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFormatId(value: String): Self = StObject.set(x, "formatId", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => DataProviderDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setSetData(value: js.Any => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
