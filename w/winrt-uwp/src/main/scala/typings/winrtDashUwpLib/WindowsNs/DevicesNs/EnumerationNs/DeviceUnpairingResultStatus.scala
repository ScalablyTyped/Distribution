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
  
  val accessDenied: accessDenied with java.lang.String = js.native
  val alreadyUnpaired: alreadyUnpaired with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val operationAlreadyInProgress: operationAlreadyInProgress with java.lang.String = js.native
  val unpaired: unpaired with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceUnpairingResultStatus with java.lang.String
  ] = js.native
}

