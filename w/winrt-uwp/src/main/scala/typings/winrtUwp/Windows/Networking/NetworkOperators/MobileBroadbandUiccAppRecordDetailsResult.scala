package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about results of a UICC application record read operation initiated with MobileBroadbandUiccAppClass.GetRecordDetailsAsync . */
@js.native
trait MobileBroadbandUiccAppRecordDetailsResult extends js.Object {
  
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
  
  @scala.inline
  implicit class MobileBroadbandUiccAppRecordDetailsResultOps[Self <: MobileBroadbandUiccAppRecordDetailsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: UiccAppRecordKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAccessCondition(value: UiccAccessCondition): Self = this.set("readAccessCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCount(value: Double): Self = this.set("recordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordSize(value: Double): Self = this.set("recordSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: MobileBroadbandUiccAppOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteAccessCondition(value: UiccAccessCondition): Self = this.set("writeAccessCondition", value.asInstanceOf[js.Any])
  }
}
