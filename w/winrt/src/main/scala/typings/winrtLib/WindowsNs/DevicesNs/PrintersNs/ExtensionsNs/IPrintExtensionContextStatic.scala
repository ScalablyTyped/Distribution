package typings
package winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintExtensionContextStatic extends js.Object {
  def fromDeviceId(deviceId: java.lang.String): js.Any
}

object IPrintExtensionContextStatic {
  @scala.inline
  def apply(fromDeviceId: java.lang.String => js.Any): IPrintExtensionContextStatic = {
    val __obj = js.Dynamic.literal(fromDeviceId = js.Any.fromFunction1(fromDeviceId))
  
    __obj.asInstanceOf[IPrintExtensionContextStatic]
  }
}

