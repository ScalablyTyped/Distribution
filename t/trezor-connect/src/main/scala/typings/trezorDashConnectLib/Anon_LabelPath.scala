package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelPath
  extends trezorDashConnectLib.trezorDashConnectMod.Device {
  var label: java.lang.String
  var path: java.lang.String
  var `type`: trezorDashConnectLib.trezorDashConnectLibStrings.unreadable
}

object Anon_LabelPath {
  @scala.inline
  def apply(
    label: java.lang.String,
    path: java.lang.String,
    `type`: trezorDashConnectLib.trezorDashConnectLibStrings.unreadable
  ): Anon_LabelPath = {
    val __obj = js.Dynamic.literal(label = label, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_LabelPath]
  }
}

