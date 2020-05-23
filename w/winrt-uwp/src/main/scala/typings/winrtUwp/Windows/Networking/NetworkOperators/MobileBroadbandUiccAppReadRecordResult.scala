package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of a UICC application record read operation. */
trait MobileBroadbandUiccAppReadRecordResult extends js.Object {
  /** Gets the data returned by the application record read operation. Note that if Status is not Success, this value may be invalid or empty. */
  var data: IBuffer
  /** Gets a value which indicates whether the record read completed successfully. */
  var status: MobileBroadbandUiccAppOperationStatus
}

object MobileBroadbandUiccAppReadRecordResult {
  @scala.inline
  def apply(data: IBuffer, status: MobileBroadbandUiccAppOperationStatus): MobileBroadbandUiccAppReadRecordResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppReadRecordResult]
  }
}

