package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the values returned with a NetworkOperatorTetheringOperationResult object to indicate the status of a tethering operation. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringOperationStatus")
@js.native
object TetheringOperationStatus extends js.Object {
  /* 5 */ val entitlementCheckFailure: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.entitlementCheckFailure with Double = js.native
  /* 4 */ val entitlementCheckTimeout: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.entitlementCheckTimeout with Double = js.native
  /* 2 */ val mobileBroadbandDeviceOff: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.mobileBroadbandDeviceOff with Double = js.native
  /* 6 */ val operationInProgress: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.operationInProgress with Double = js.native
  /* 0 */ val success: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.success with Double = js.native
  /* 1 */ val unknown: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.unknown with Double = js.native
  /* 3 */ val wiFiDeviceOff: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.wiFiDeviceOff with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus with Double
  ] = js.native
}

