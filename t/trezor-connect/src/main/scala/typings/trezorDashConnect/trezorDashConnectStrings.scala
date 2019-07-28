package typings.trezorDashConnect

import typings.trezorDashConnect.trezorDashConnectMod.DeviceFirmwareStatus
import typings.trezorDashConnect.trezorDashConnectMod.DeviceMode
import typings.trezorDashConnect.trezorDashConnectMod.DeviceStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object trezorDashConnectStrings {
  @js.native
  sealed trait acquired extends js.Object
  
  @js.native
  sealed trait available extends DeviceStatus
  
  @js.native
  sealed trait bootloader extends DeviceMode
  
  @js.native
  sealed trait initialize extends DeviceMode
  
  @js.native
  sealed trait normal extends DeviceMode
  
  @js.native
  sealed trait occupied extends DeviceStatus
  
  @js.native
  sealed trait opreturn extends js.Object
  
  @js.native
  sealed trait outdated extends DeviceFirmwareStatus
  
  @js.native
  sealed trait required extends DeviceFirmwareStatus
  
  @js.native
  sealed trait seedless extends DeviceMode
  
  @js.native
  sealed trait `send-max` extends js.Object
  
  @js.native
  sealed trait unacquired extends js.Object
  
  @js.native
  sealed trait unreadable extends js.Object
  
  @js.native
  sealed trait used extends DeviceStatus
  
  @js.native
  sealed trait valid extends DeviceFirmwareStatus
  
  @scala.inline
  def acquired: acquired = "acquired".asInstanceOf[acquired]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def bootloader: bootloader = "bootloader".asInstanceOf[bootloader]
  @scala.inline
  def initialize: initialize = "initialize".asInstanceOf[initialize]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def occupied: occupied = "occupied".asInstanceOf[occupied]
  @scala.inline
  def opreturn: opreturn = "opreturn".asInstanceOf[opreturn]
  @scala.inline
  def outdated: outdated = "outdated".asInstanceOf[outdated]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  @scala.inline
  def seedless: seedless = "seedless".asInstanceOf[seedless]
  @scala.inline
  def `send-max`: `send-max` = "send-max".asInstanceOf[`send-max`]
  @scala.inline
  def unacquired: unacquired = "unacquired".asInstanceOf[unacquired]
  @scala.inline
  def unreadable: unreadable = "unreadable".asInstanceOf[unreadable]
  @scala.inline
  def used: used = "used".asInstanceOf[used]
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
}

