package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorDashConnect.trezorDashConnectStrings.normal
  - typings.trezorDashConnect.trezorDashConnectStrings.bootloader
  - typings.trezorDashConnect.trezorDashConnectStrings.initialize
  - typings.trezorDashConnect.trezorDashConnectStrings.seedless
*/
trait DeviceMode extends js.Object

object DeviceMode {
  @scala.inline
  def bootloader: typings.trezorDashConnect.trezorDashConnectStrings.bootloader = this.cast("bootloader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialize: typings.trezorDashConnect.trezorDashConnectStrings.initialize = this.cast("initialize")
  @scala.inline
  def normal: typings.trezorDashConnect.trezorDashConnectStrings.normal = this.cast("normal")
  @scala.inline
  def seedless: typings.trezorDashConnect.trezorDashConnectStrings.seedless = this.cast("seedless")
}

