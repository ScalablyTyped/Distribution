package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintExtensionContextStatic extends js.Object {
  def fromDeviceId(deviceId: String): js.Any
}

object IPrintExtensionContextStatic {
  @scala.inline
  def apply(fromDeviceId: String => js.Any): IPrintExtensionContextStatic = {
    val __obj = js.Dynamic.literal(fromDeviceId = js.Any.fromFunction1(fromDeviceId))
  
    __obj.asInstanceOf[IPrintExtensionContextStatic]
  }
}

