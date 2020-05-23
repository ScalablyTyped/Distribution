package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of a UICC application record read operation. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppReadRecordResult")
@js.native
abstract class MobileBroadbandUiccAppReadRecordResult ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppReadRecordResult {
  /** Gets the data returned by the application record read operation. Note that if Status is not Success, this value may be invalid or empty. */
  /* CompleteClass */
  override var data: IBuffer = js.native
  /** Gets a value which indicates whether the record read completed successfully. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus = js.native
}

