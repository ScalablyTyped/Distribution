package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of a UICC application record read operation. */
@js.native
trait MobileBroadbandUiccAppReadRecordResult extends js.Object {
  /** Gets the data returned by the application record read operation. Note that if Status is not Success, this value may be invalid or empty. */
  var data: IBuffer = js.native
  /** Gets a value which indicates whether the record read completed successfully. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
}

object MobileBroadbandUiccAppReadRecordResult {
  @scala.inline
  def apply(data: IBuffer, status: MobileBroadbandUiccAppOperationStatus): MobileBroadbandUiccAppReadRecordResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppReadRecordResult]
  }
  @scala.inline
  implicit class MobileBroadbandUiccAppReadRecordResultOps[Self <: MobileBroadbandUiccAppReadRecordResult] (val x: Self) extends AnyVal {
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
    def setData(value: IBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: MobileBroadbandUiccAppOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

