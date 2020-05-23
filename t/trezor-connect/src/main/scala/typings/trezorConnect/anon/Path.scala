package typings.trezorConnect.anon

import typings.trezorConnect.mod.Device
import typings.trezorConnect.trezorConnectStrings.unreadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends Device {
  var label: String
  var path: String
  var `type`: unreadable
}

object Path {
  @scala.inline
  def apply(label: String, path: String, `type`: unreadable): Path = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

