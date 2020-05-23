package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about results of a UICC application record read operation initiated with MobileBroadbandUiccAppClass.GetRecordDetailsAsync . */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult")
@js.native
abstract class MobileBroadbandUiccAppRecordDetailsResult ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult {
  /** Gets an enumeration value specifying what kind of record this is. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.Networking.NetworkOperators.UiccAppRecordKind = js.native
  /** Gets a value specifying how read access to this record is determined. */
  /* CompleteClass */
  override var readAccessCondition: typings.winrtUwp.Windows.Networking.NetworkOperators.UiccAccessCondition = js.native
  /** Gets the count of this record in the list of records provided by this UICC application. */
  /* CompleteClass */
  override var recordCount: Double = js.native
  /** Gets the size in bytes of this record. */
  /* CompleteClass */
  override var recordSize: Double = js.native
  /** Gets the status of the operation to retrieve UICC application record details. If this value is not Success, then other properties might not contain valid values. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus = js.native
  /** Gets a value specifying how write access to this record is determined. */
  /* CompleteClass */
  override var writeAccessCondition: typings.winrtUwp.Windows.Networking.NetworkOperators.UiccAccessCondition = js.native
}

