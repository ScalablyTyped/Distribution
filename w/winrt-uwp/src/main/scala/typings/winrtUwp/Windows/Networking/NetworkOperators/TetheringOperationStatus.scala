package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TetheringOperationStatus with Double] = js.native
  /* 5 */ @js.native
  object entitlementCheckFailure extends TopLevel[entitlementCheckFailure with Double]
  
  /* 4 */ @js.native
  object entitlementCheckTimeout extends TopLevel[entitlementCheckTimeout with Double]
  
  /* 2 */ @js.native
  object mobileBroadbandDeviceOff extends TopLevel[mobileBroadbandDeviceOff with Double]
  
  /* 6 */ @js.native
  object operationInProgress extends TopLevel[operationInProgress with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 3 */ @js.native
  object wiFiDeviceOff extends TopLevel[wiFiDeviceOff with Double]
  
}

