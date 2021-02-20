package typings.winrt.Windows.Devices.Sms

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmsBinaryMessage extends ISmsBinaryMessage
object SmsBinaryMessage {
  
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: () => Uint8Array,
    id: Double,
    messageClass: SmsMessageClass,
    setData: Uint8Array => Unit
  ): SmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[SmsBinaryMessage]
  }
}
