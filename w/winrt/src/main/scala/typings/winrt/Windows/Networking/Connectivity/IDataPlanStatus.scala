package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataPlanStatus extends js.Object {
  
  var dataLimitInMegabytes: Double = js.native
  
  var dataPlanUsage: DataPlanUsage = js.native
  
  var inboundBitsPerSecond: Double = js.native
  
  var maxTransferSizeInMegabytes: Double = js.native
  
  var nextBillingCycle: Date = js.native
  
  var outboundBitsPerSecond: Double = js.native
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
  
  @scala.inline
  implicit class IDataPlanStatusOps[Self <: IDataPlanStatus] (val x: Self) extends AnyVal {
    
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
    def setDataLimitInMegabytes(value: Double): Self = this.set("dataLimitInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPlanUsage(value: DataPlanUsage): Self = this.set("dataPlanUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundBitsPerSecond(value: Double): Self = this.set("inboundBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTransferSizeInMegabytes(value: Double): Self = this.set("maxTransferSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextBillingCycle(value: Date): Self = this.set("nextBillingCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundBitsPerSecond(value: Double): Self = this.set("outboundBitsPerSecond", value.asInstanceOf[js.Any])
  }
}
