package typings.trezorDashConnect

import typings.trezorDashConnect.trezorDashConnectMod.Device
import typings.trezorDashConnect.trezorDashConnectStrings.unacquired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends Device {
  var label: String
  var path: String
  var `type`: unacquired
}

object Anon_Label {
  @scala.inline
  def apply(label: String, path: String, `type`: unacquired): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

