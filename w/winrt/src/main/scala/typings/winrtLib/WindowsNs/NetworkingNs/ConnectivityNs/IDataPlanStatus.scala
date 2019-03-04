package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPlanStatus extends js.Object {
  var dataLimitInMegabytes: scala.Double
  var dataPlanUsage: DataPlanUsage
  var inboundBitsPerSecond: scala.Double
  var maxTransferSizeInMegabytes: scala.Double
  var nextBillingCycle: stdLib.Date
  var outboundBitsPerSecond: scala.Double
}

object IDataPlanStatus {
  @scala.inline
  def apply(
    dataLimitInMegabytes: scala.Double,
    dataPlanUsage: DataPlanUsage,
    inboundBitsPerSecond: scala.Double,
    maxTransferSizeInMegabytes: scala.Double,
    nextBillingCycle: stdLib.Date,
    outboundBitsPerSecond: scala.Double
  ): IDataPlanStatus = {
    val __obj = js.Dynamic.literal(dataLimitInMegabytes = dataLimitInMegabytes, dataPlanUsage = dataPlanUsage, inboundBitsPerSecond = inboundBitsPerSecond, maxTransferSizeInMegabytes = maxTransferSizeInMegabytes, nextBillingCycle = nextBillingCycle, outboundBitsPerSecond = outboundBitsPerSecond)
  
    __obj.asInstanceOf[IDataPlanStatus]
  }
}

