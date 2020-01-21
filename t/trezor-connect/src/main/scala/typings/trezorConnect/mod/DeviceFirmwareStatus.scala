package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.trezorConnectStrings.valid
  - typings.trezorConnect.trezorConnectStrings.outdated
  - typings.trezorConnect.trezorConnectStrings.required
*/
trait DeviceFirmwareStatus extends js.Object

object DeviceFirmwareStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def outdated: typings.trezorConnect.trezorConnectStrings.outdated = this.cast("outdated")
  @scala.inline
  def required: typings.trezorConnect.trezorConnectStrings.required = this.cast("required")
  @scala.inline
  def valid: typings.trezorConnect.trezorConnectStrings.valid = this.cast("valid")
}

