package typings.trezorConnect

import typings.trezorConnect.mod.Device
import typings.trezorConnect.trezorConnectStrings.unreadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelPath extends Device {
  var label: String
  var path: String
  var `type`: unreadable
}

object AnonLabelPath {
  @scala.inline
  def apply(label: String, path: String, `type`: unreadable): AnonLabelPath = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelPath]
  }
}

