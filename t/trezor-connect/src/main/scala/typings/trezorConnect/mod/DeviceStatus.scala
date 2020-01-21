package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.trezorConnectStrings.available
  - typings.trezorConnect.trezorConnectStrings.occupied
  - typings.trezorConnect.trezorConnectStrings.used
*/
trait DeviceStatus extends js.Object

object DeviceStatus {
  @scala.inline
  def available: typings.trezorConnect.trezorConnectStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def occupied: typings.trezorConnect.trezorConnectStrings.occupied = this.cast("occupied")
  @scala.inline
  def used: typings.trezorConnect.trezorConnectStrings.used = this.cast("used")
}

