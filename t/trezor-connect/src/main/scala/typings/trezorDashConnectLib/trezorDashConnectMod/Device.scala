package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var features: js.UndefOr[Features] = js.native
  var firmware: js.UndefOr[DeviceFirmwareStatus] = js.native
  var firmwareRelease: js.UndefOr[FirmwareRelease] = js.native
  var label: js.UndefOr[java.lang.String] = js.native
  var mode: js.UndefOr[DeviceMode] = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  var state: js.UndefOr[java.lang.String | scala.Null] = js.native
  var status: js.UndefOr[DeviceStatus] = js.native
  var `type`: js.UndefOr[
    trezorDashConnectLib.trezorDashConnectLibStrings.acquired | trezorDashConnectLib.trezorDashConnectLibStrings.unacquired | trezorDashConnectLib.trezorDashConnectLibStrings.unreadable
  ] = js.native
}

