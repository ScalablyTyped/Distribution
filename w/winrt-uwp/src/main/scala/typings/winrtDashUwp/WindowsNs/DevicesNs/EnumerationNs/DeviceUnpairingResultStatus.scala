package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceUnpairingResultStatus extends js.Object

/** The result of the unpairing action. */
@JSGlobal("Windows.Devices.Enumeration.DeviceUnpairingResultStatus")
@js.native
object DeviceUnpairingResultStatus extends js.Object {
  /** The caller does not have sufficient permissions to unpair the device. */
  @js.native
  sealed trait accessDenied extends DeviceUnpairingResultStatus
  
  /** The device object was already unpaired. */
  @js.native
  sealed trait alreadyUnpaired extends DeviceUnpairingResultStatus
  
  /** An unknown failure occurred. */
  @js.native
  sealed trait failed extends DeviceUnpairingResultStatus
  
  /** The device object is currently in the middle of either a pairing or unpairing action. */
  @js.native
  sealed trait operationAlreadyInProgress extends DeviceUnpairingResultStatus
  
  /** The device object is successfully unpaired. */
  @js.native
  sealed trait unpaired extends DeviceUnpairingResultStatus
  
  /* 3 */ val accessDenied: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus.accessDenied with Double = js.native
  /* 1 */ val alreadyUnpaired: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus.alreadyUnpaired with Double = js.native
  /* 4 */ val failed: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus.failed with Double = js.native
  /* 2 */ val operationAlreadyInProgress: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus.operationAlreadyInProgress with Double = js.native
  /* 0 */ val unpaired: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus.unpaired with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceUnpairingResultStatus with Double] = js.native
}

