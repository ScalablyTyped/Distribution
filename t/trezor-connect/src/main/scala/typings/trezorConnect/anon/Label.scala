package typings.trezorConnect.anon

import typings.trezorConnect.mod.Device
import typings.trezorConnect.trezorConnectStrings.unacquired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends Device {
  var label: String
  var path: String
  var `type`: unacquired
}

object Label {
  @scala.inline
  def apply(label: String, path: String, `type`: unacquired): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

