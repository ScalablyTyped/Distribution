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
  def apply(fromDeviceId: js.Function1[java.lang.String, js.Any]): IPrintExtensionContextStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromDeviceId")(fromDeviceId)
    __obj.asInstanceOf[IPrintExtensionContextStatic]
  }
}

