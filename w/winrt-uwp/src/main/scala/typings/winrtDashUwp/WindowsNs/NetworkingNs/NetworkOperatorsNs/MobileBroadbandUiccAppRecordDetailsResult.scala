package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about results of a UICC application record read operation initiated with MobileBroadbandUiccAppClass.GetRecordDetailsAsync . */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult")
@js.native
abstract class MobileBroadbandUiccAppRecordDetailsResult () extends js.Object {
  /** Gets an enumeration value specifying what kind of record this is. */
  var kind: UiccAppRecordKind = js.native
  /** Gets a value specifying how read access to this record is determined. */
  var readAccessCondition: UiccAccessCondition = js.native
  /** Gets the count of this record in the list of records provided by this UICC application. */
  var recordCount: Double = js.native
  /** Gets the size in bytes of this record. */
  var recordSize: Double = js.native
  /** Gets the status of the operation to retrieve UICC application record details. If this value is not Success, then other properties might not contain valid values. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
  /** Gets a value specifying how write access to this record is determined. */
  var writeAccessCondition: UiccAccessCondition = js.native
}

