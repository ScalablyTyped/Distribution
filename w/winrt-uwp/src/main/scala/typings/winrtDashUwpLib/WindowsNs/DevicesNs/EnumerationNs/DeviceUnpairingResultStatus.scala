package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

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
  sealed trait accessDenied
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus
  
  /** The device object was already unpaired. */
  @js.native
  sealed trait alreadyUnpaired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus
  
  /** An unknown failure occurred. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus
  
  /** The device object is currently in the middle of either a pairing or unpairing action. */
  @js.native
  sealed trait operationAlreadyInProgress
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus
  
  /** The device object is successfully unpaired. */
  @js.native
  sealed trait unpaired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus
  
  /* 3 */ val accessDenied: accessDenied with scala.Double = js.native
  /* 1 */ val alreadyUnpaired: alreadyUnpaired with scala.Double = js.native
  /* 4 */ val failed: failed with scala.Double = js.native
  /* 2 */ val operationAlreadyInProgress: operationAlreadyInProgress with scala.Double = js.native
  /* 0 */ val unpaired: unpaired with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus with scala.Double
  ] = js.native
}

