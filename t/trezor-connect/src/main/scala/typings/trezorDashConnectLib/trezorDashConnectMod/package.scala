package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object trezorDashConnectMod {
  type Device = trezorDashConnectLib.Anon_Acquired | trezorDashConnectLib.Anon_Label | trezorDashConnectLib.Anon_LabelPath
  type DeviceFirmwareStatus = trezorDashConnectLib.trezorDashConnectLibStrings.valid | trezorDashConnectLib.trezorDashConnectLibStrings.outdated | trezorDashConnectLib.trezorDashConnectLibStrings.required
  type DeviceMode = trezorDashConnectLib.trezorDashConnectLibStrings.normal | trezorDashConnectLib.trezorDashConnectLibStrings.bootloader | trezorDashConnectLib.trezorDashConnectLibStrings.initialize | trezorDashConnectLib.trezorDashConnectLibStrings.seedless
  type DeviceStatus = trezorDashConnectLib.trezorDashConnectLibStrings.available | trezorDashConnectLib.trezorDashConnectLibStrings.occupied | trezorDashConnectLib.trezorDashConnectLibStrings.used
  type Output = RegularOutput | SendMaxOutput | OpReturnOutput
  type RequestLoginParams = CommonParams with (trezorDashConnectLib.Anon_Callback | LoginChallenge)
  type ResponseMessage[T] = Error | Success[T]
}
