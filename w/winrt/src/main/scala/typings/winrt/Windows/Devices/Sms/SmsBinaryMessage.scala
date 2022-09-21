package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsBinaryMessage
  extends StObject
     with ISmsBinaryMessage
object SmsBinaryMessage {
  
  inline def apply(
    format: SmsDataFormat,
    getData: () => js.typedarray.Uint8Array,
    id: Double,
    messageClass: SmsMessageClass,
    setData: js.typedarray.Uint8Array => Unit
  ): SmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[SmsBinaryMessage]
  }
}
