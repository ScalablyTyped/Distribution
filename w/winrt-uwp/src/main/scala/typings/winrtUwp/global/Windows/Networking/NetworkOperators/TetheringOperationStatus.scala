package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the values returned with a NetworkOperatorTetheringOperationResult object to indicate the status of a tethering operation. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringOperationStatus")
@js.native
object TetheringOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus & Double
  ] = js.native
  
  /* 5 */ val entitlementCheckFailure: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.entitlementCheckFailure & Double = js.native
  
  /* 4 */ val entitlementCheckTimeout: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.entitlementCheckTimeout & Double = js.native
  
  /* 2 */ val mobileBroadbandDeviceOff: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.mobileBroadbandDeviceOff & Double = js.native
  
  /* 6 */ val operationInProgress: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.operationInProgress & Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.success & Double = js.native
  
  /* 1 */ val unknown: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.unknown & Double = js.native
  
  /* 3 */ val wiFiDeviceOff: typings.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationStatus.wiFiDeviceOff & Double = js.native
}
