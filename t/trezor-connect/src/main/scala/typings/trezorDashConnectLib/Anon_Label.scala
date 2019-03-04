package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label
  extends trezorDashConnectLib.trezorDashConnectMod.Device {
  var label: java.lang.String
  var path: java.lang.String
  var `type`: trezorDashConnectLib.trezorDashConnectLibStrings.unacquired
}

object Anon_Label {
  @scala.inline
  def apply(
    label: java.lang.String,
    path: java.lang.String,
    `type`: trezorDashConnectLib.trezorDashConnectLibStrings.unacquired
  ): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Label]
  }
}

