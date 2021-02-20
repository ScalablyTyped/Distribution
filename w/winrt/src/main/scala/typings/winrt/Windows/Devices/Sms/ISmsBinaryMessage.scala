package typings.winrt.Windows.Devices.Sms

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsBinaryMessage extends ISmsMessage {
  
  var format: SmsDataFormat = js.native
  
  def getData(): Uint8Array = js.native
  
  def setData(value: Uint8Array): Unit = js.native
}
object ISmsBinaryMessage {
  
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: () => Uint8Array,
    id: Double,
    messageClass: SmsMessageClass,
    setData: Uint8Array => Unit
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
  
  @scala.inline
  implicit class ISmsBinaryMessageMutableBuilder[Self <: ISmsBinaryMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: SmsDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: () => Uint8Array): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: Uint8Array => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
