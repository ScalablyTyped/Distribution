package typings.trezorConnect

import typings.trezorConnect.mod.Device
import typings.trezorConnect.trezorConnectStrings.unacquired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends Device {
  var label: String
  var path: String
  var `type`: unacquired
}

object AnonLabel {
  @scala.inline
  def apply(label: String, path: String, `type`: unacquired): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

