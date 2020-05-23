package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about results of a UICC application record read operation initiated with MobileBroadbandUiccAppClass.GetRecordDetailsAsync . */
trait MobileBroadbandUiccAppRecordDetailsResult extends js.Object {
  /** Gets an enumeration value specifying what kind of record this is. */
  var kind: UiccAppRecordKind
  /** Gets a value specifying how read access to this record is determined. */
  var readAccessCondition: UiccAccessCondition
  /** Gets the count of this record in the list of records provided by this UICC application. */
  var recordCount: Double
  /** Gets the size in bytes of this record. */
  var recordSize: Double
  /** Gets the status of the operation to retrieve UICC application record details. If this value is not Success, then other properties might not contain valid values. */
  var status: MobileBroadbandUiccAppOperationStatus
  /** Gets a value specifying how write access to this record is determined. */
  var writeAccessCondition: UiccAccessCondition
}

object MobileBroadbandUiccAppRecordDetailsResult {
  @scala.inline
  def apply(
    kind: UiccAppRecordKind,
    readAccessCondition: UiccAccessCondition,
    recordCount: Double,
    recordSize: Double,
    status: MobileBroadbandUiccAppOperationStatus,
    writeAccessCondition: UiccAccessCondition
  ): MobileBroadbandUiccAppRecordDetailsResult = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], readAccessCondition = readAccessCondition.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any], recordSize = recordSize.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], writeAccessCondition = writeAccessCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppRecordDetailsResult]
  }
}

