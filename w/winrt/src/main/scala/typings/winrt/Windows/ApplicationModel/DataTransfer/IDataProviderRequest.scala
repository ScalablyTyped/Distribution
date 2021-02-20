package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataProviderRequest extends StObject {
  
  var deadline: Date = js.native
  
  var formatId: String = js.native
  
  def getDeferral(): DataProviderDeferral = js.native
  
  def setData(value: js.Any): Unit = js.native
}
object IDataProviderRequest {
  
  @scala.inline
  def apply(deadline: Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: js.Any => Unit): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[IDataProviderRequest]
  }
  
  @scala.inline
  implicit class IDataProviderRequestMutableBuilder[Self <: IDataProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatId(value: String): Self = StObject.set(x, "formatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => DataProviderDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: js.Any => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
