package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandUiccAppOperationStatus extends js.Object

/** Describes the status of an operation on a UICC application. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus")
@js.native
object MobileBroadbandUiccAppOperationStatus extends js.Object {
  /** Operation failed due to an access condition not being met. */
  @js.native
  sealed trait accessConditionNotHeld extends MobileBroadbandUiccAppOperationStatus
  
  /** Operation failed due to an invalid UICC file path being specified. */
  @js.native
  sealed trait invalidUiccFilePath extends MobileBroadbandUiccAppOperationStatus
  
  /** Successful completion. */
  @js.native
  sealed trait success extends MobileBroadbandUiccAppOperationStatus
  
  /** Operation failed because the UICC was busy. */
  @js.native
  sealed trait uiccBusy extends MobileBroadbandUiccAppOperationStatus
  
  /* 2 */ val accessConditionNotHeld: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus.accessConditionNotHeld with Double = js.native
  /* 1 */ val invalidUiccFilePath: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus.invalidUiccFilePath with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus.success with Double = js.native
  /* 3 */ val uiccBusy: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus.uiccBusy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandUiccAppOperationStatus with Double] = js.native
}

