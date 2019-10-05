package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity.DataPlanStatus")
@js.native
class DataPlanStatus () extends IDataPlanStatus {
  /* CompleteClass */
  override var dataLimitInMegabytes: Double = js.native
  /* CompleteClass */
  override var dataPlanUsage: DataPlanUsage = js.native
  /* CompleteClass */
  override var inboundBitsPerSecond: Double = js.native
  /* CompleteClass */
  override var maxTransferSizeInMegabytes: Double = js.native
  /* CompleteClass */
  override var nextBillingCycle: Date = js.native
  /* CompleteClass */
  override var outboundBitsPerSecond: Double = js.native
}

