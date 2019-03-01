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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_LabelPath]
  }
}

