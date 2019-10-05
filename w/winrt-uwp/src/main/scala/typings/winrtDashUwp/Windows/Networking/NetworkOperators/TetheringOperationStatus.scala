package typings.winrtDashUwp.Windows.Networking.NetworkOperators

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
  sealed trait entitlementCheckFailure extends TetheringOperationStatus
  
  /** The operation did not complete because the mobile operator could not be contacted to confirm tethering capabilities are provided for this account. */
  @js.native
  sealed trait entitlementCheckTimeout extends TetheringOperationStatus
  
  /** The operation could not begin because the mobile broadband device is turned off. */
  @js.native
  sealed trait mobileBroadbandDeviceOff extends TetheringOperationStatus
  
  /** The operation is still in progress. */
  @js.native
  sealed trait operationInProgress extends TetheringOperationStatus
  
  /** The operation completed successfully. */
  @js.native
  sealed trait success extends TetheringOperationStatus
  
  /** The status of the operation is unknown. */
  @js.native
  sealed trait unknown extends TetheringOperationStatus
  
  /** The operation could not begin because the Wifi device is turned off. */
  @js.native
  sealed trait wiFiDeviceOff extends TetheringOperationStatus
  
  /* 5 */ val entitlementCheckFailure: typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.entitlementCheckFailure with Double = js.native
  /* 4 */ val entitlementCheckTimeout: typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.entitlementCheckTimeout with Double = js.native
  /* 2 */ val mobileBroadbandDeviceOff: typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.mobileBroadbandDeviceOff with Double = js.native
  /* 6 */ val operationInProgress: typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.operationInProgress with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.success with Double = js.native
  /* 1 */ val unknown: typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.unknown with Double = js.native
  /* 3 */ val wiFiDeviceOff: typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.wiFiDeviceOff with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TetheringOperationStatus with Double] = js.native
}

