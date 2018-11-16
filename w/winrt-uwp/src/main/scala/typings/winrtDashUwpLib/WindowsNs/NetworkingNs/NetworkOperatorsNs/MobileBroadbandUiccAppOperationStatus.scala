package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait accessConditionNotHeld
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus
  
  /** Operation failed due to an invalid UICC file path being specified. */
  @js.native
  sealed trait invalidUiccFilePath
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus
  
  /** Successful completion. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus
  
  /** Operation failed because the UICC was busy. */
  @js.native
  sealed trait uiccBusy
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus
  
  val accessConditionNotHeld: accessConditionNotHeld with java.lang.String = js.native
  val invalidUiccFilePath: invalidUiccFilePath with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val uiccBusy: uiccBusy with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandUiccAppOperationStatus with java.lang.String
  ] = js.native
}

