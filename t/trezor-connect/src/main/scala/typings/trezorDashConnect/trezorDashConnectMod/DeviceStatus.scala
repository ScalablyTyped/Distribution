package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorDashConnect.trezorDashConnectStrings.available
  - typings.trezorDashConnect.trezorDashConnectStrings.occupied
  - typings.trezorDashConnect.trezorDashConnectStrings.used
*/
trait DeviceStatus extends js.Object

object DeviceStatus {
  @scala.inline
  def available: typings.trezorDashConnect.trezorDashConnectStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def occupied: typings.trezorDashConnect.trezorDashConnectStrings.occupied = this.cast("occupied")
  @scala.inline
  def used: typings.trezorDashConnect.trezorDashConnectStrings.used = this.cast("used")
}

