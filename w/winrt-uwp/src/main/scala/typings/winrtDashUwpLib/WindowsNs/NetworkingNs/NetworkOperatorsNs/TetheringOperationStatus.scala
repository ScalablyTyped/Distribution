package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TetheringOperationStatus extends js.Object

/** Defines the values returned with a NetworkOperatorTetheringOperationResult object to indicate the status of a tethering operation. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringOperationStatus")
@js.native
object TetheringOperationStatus extends js.Object {
  /** The operation did not complete because the account does not currently support tethering operations. */
  @js.native
  sealed trait entitlementCheckFailure
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus
  
  /** The operation did not complete because the mobile operator could not be contacted to confirm tethering capabilities are provided for this account. */
  @js.native
  sealed trait entitlementCheckTimeout
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus
  
  /** The operation could not begin because the mobile broadband device is turned off. */
  @js.native
  sealed trait mobileBroadbandDeviceOff
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus
  
  /** The operation is still in progress. */
  @js.native
  sealed trait operationInProgress
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus
  
  /** The operation completed successfully. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus
  
  /** The status of the operation is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus
  
  /** The operation could not begin because the Wifi device is turned off. */
  @js.native
  sealed trait wiFiDeviceOff
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus
  
  val entitlementCheckFailure: entitlementCheckFailure with java.lang.String = js.native
  val entitlementCheckTimeout: entitlementCheckTimeout with java.lang.String = js.native
  val mobileBroadbandDeviceOff: mobileBroadbandDeviceOff with java.lang.String = js.native
  val operationInProgress: operationInProgress with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val wiFiDeviceOff: wiFiDeviceOff with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationStatus with java.lang.String
  ] = js.native
}

