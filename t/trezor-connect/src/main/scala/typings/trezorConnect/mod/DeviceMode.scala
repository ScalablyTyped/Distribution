package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.trezorConnectStrings.normal
  - typings.trezorConnect.trezorConnectStrings.bootloader
  - typings.trezorConnect.trezorConnectStrings.initialize
  - typings.trezorConnect.trezorConnectStrings.seedless
*/
trait DeviceMode extends js.Object
object DeviceMode {
  
  @scala.inline
  def bootloader: typings.trezorConnect.trezorConnectStrings.bootloader = "bootloader".asInstanceOf[typings.trezorConnect.trezorConnectStrings.bootloader]
  
  @scala.inline
  def initialize: typings.trezorConnect.trezorConnectStrings.initialize = "initialize".asInstanceOf[typings.trezorConnect.trezorConnectStrings.initialize]
  
  @scala.inline
  def normal: typings.trezorConnect.trezorConnectStrings.normal = "normal".asInstanceOf[typings.trezorConnect.trezorConnectStrings.normal]
  
  @scala.inline
  def seedless: typings.trezorConnect.trezorConnectStrings.seedless = "seedless".asInstanceOf[typings.trezorConnect.trezorConnectStrings.seedless]
}
