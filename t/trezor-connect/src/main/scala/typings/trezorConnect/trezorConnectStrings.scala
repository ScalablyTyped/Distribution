package typings.trezorConnect

import typings.trezorConnect.mod.DeviceFirmwareStatus
import typings.trezorConnect.mod.DeviceMode
import typings.trezorConnect.mod.DeviceStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trezorConnectStrings {
  
  @js.native
  sealed trait acquired extends StObject
  @scala.inline
  def acquired: acquired = "acquired".asInstanceOf[acquired]
  
  @js.native
  sealed trait available extends DeviceStatus
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait bootloader extends DeviceMode
  @scala.inline
  def bootloader: bootloader = "bootloader".asInstanceOf[bootloader]
  
  @js.native
  sealed trait initialize extends DeviceMode
  @scala.inline
  def initialize: initialize = "initialize".asInstanceOf[initialize]
  
  @js.native
  sealed trait normal extends DeviceMode
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait occupied extends DeviceStatus
  @scala.inline
  def occupied: occupied = "occupied".asInstanceOf[occupied]
  
  @js.native
  sealed trait opreturn extends StObject
  @scala.inline
  def opreturn: opreturn = "opreturn".asInstanceOf[opreturn]
  
  @js.native
  sealed trait outdated extends DeviceFirmwareStatus
  @scala.inline
  def outdated: outdated = "outdated".asInstanceOf[outdated]
  
  @js.native
  sealed trait required extends DeviceFirmwareStatus
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait seedless extends DeviceMode
  @scala.inline
  def seedless: seedless = "seedless".asInstanceOf[seedless]
  
  @js.native
  sealed trait `send-max` extends StObject
  @scala.inline
  def `send-max`: `send-max` = "send-max".asInstanceOf[`send-max`]
  
  @js.native
  sealed trait unacquired extends StObject
  @scala.inline
  def unacquired: unacquired = "unacquired".asInstanceOf[unacquired]
  
  @js.native
  sealed trait unreadable extends StObject
  @scala.inline
  def unreadable: unreadable = "unreadable".asInstanceOf[unreadable]
  
  @js.native
  sealed trait used extends DeviceStatus
  @scala.inline
  def used: used = "used".asInstanceOf[used]
  
  @js.native
  sealed trait valid extends DeviceFirmwareStatus
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
}
