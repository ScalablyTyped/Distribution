package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPlanStatus extends js.Object {
  var dataLimitInMegabytes: Double
  var dataPlanUsage: DataPlanUsage
  var inboundBitsPerSecond: Double
  var maxTransferSizeInMegabytes: Double
  var nextBillingCycle: Date
  var outboundBitsPerSecond: Double
}

object IDataPlanStatus {
  @scala.inline
  def apply(
    dataLimitInMegabytes: Double,
    dataPlanUsage: DataPlanUsage,
    inboundBitsPerSecond: Double,
    maxTransferSizeInMegabytes: Double,
    nextBillingCycle: Date,
    outboundBitsPerSecond: Double
  ): IDataPlanStatus = {
    val __obj = js.Dynamic.literal(dataLimitInMegabytes = dataLimitInMegabytes.asInstanceOf[js.Any], dataPlanUsage = dataPlanUsage.asInstanceOf[js.Any], inboundBitsPerSecond = inboundBitsPerSecond.asInstanceOf[js.Any], maxTransferSizeInMegabytes = maxTransferSizeInMegabytes.asInstanceOf[js.Any], nextBillingCycle = nextBillingCycle.asInstanceOf[js.Any], outboundBitsPerSecond = outboundBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanStatus]
  }
}

