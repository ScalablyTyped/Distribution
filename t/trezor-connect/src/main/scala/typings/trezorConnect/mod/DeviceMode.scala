package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.trezorConnectStrings.normal
  - typings.trezorConnect.trezorConnectStrings.bootloader
  - typings.trezorConnect.trezorConnectStrings.initialize
  - typings.trezorConnect.trezorConnectStrings.seedless
*/
trait DeviceMode extends js.Object

object DeviceMode {
  @scala.inline
  def bootloader: typings.trezorConnect.trezorConnectStrings.bootloader = this.cast("bootloader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialize: typings.trezorConnect.trezorConnectStrings.initialize = this.cast("initialize")
  @scala.inline
  def normal: typings.trezorConnect.trezorConnectStrings.normal = this.cast("normal")
  @scala.inline
  def seedless: typings.trezorConnect.trezorConnectStrings.seedless = this.cast("seedless")
}

