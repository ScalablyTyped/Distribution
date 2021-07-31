package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataPlanStatus extends StObject {
  
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
  
  @scala.inline
  implicit class IDataPlanStatusMutableBuilder[Self <: IDataPlanStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLimitInMegabytes(value: Double): Self = StObject.set(x, "dataLimitInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPlanUsage(value: DataPlanUsage): Self = StObject.set(x, "dataPlanUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundBitsPerSecond(value: Double): Self = StObject.set(x, "inboundBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTransferSizeInMegabytes(value: Double): Self = StObject.set(x, "maxTransferSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextBillingCycle(value: Date): Self = StObject.set(x, "nextBillingCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundBitsPerSecond(value: Double): Self = StObject.set(x, "outboundBitsPerSecond", value.asInstanceOf[js.Any])
  }
}
