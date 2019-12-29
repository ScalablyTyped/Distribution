package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandUiccAppOperationStatus with Double] = js.native
  /* 2 */ @js.native
  object accessConditionNotHeld extends TopLevel[accessConditionNotHeld with Double]
  
  /* 1 */ @js.native
  object invalidUiccFilePath extends TopLevel[invalidUiccFilePath with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 3 */ @js.native
  object uiccBusy extends TopLevel[uiccBusy with Double]
  
}

