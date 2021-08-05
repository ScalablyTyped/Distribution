package typings.winrtUwp.Windows.Networking.Connectivity

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the current status information for the data plan associated with a connection. */
trait DataPlanStatus extends StObject {
  
  /** Gets a value indicating the maximum data transfer allowance for a connection within each billing cycle, as defined by the data plan. */
  var dataLimitInMegabytes: Double
  
  /** Gets a DataPlanUsage object that indicates the amount of data transferred over the connection, in megabytes, and the last time this value was refreshed. */
  var dataPlanUsage: DataPlanUsage
  
  /** Gets a value indicating the nominal rate of the inbound data transfer occurring on the connection. */
  var inboundBitsPerSecond: Double
  
  /** Gets a value indicates the maximum size of a transfer that is allowed without user consent on a metered network. */
  var maxTransferSizeInMegabytes: Double
  
  /** Gets a value indicating the date and time of the next billing cycle. */
  var nextBillingCycle: Date
  
  /** Gets a value indicating the nominal rate of the outbound data transfer. */
  var outboundBitsPerSecond: Double
}
object DataPlanStatus {
  
  inline def apply(
    dataLimitInMegabytes: Double,
    dataPlanUsage: DataPlanUsage,
    inboundBitsPerSecond: Double,
    maxTransferSizeInMegabytes: Double,
    nextBillingCycle: Date,
    outboundBitsPerSecond: Double
  ): DataPlanStatus = {
    val __obj = js.Dynamic.literal(dataLimitInMegabytes = dataLimitInMegabytes.asInstanceOf[js.Any], dataPlanUsage = dataPlanUsage.asInstanceOf[js.Any], inboundBitsPerSecond = inboundBitsPerSecond.asInstanceOf[js.Any], maxTransferSizeInMegabytes = maxTransferSizeInMegabytes.asInstanceOf[js.Any], nextBillingCycle = nextBillingCycle.asInstanceOf[js.Any], outboundBitsPerSecond = outboundBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPlanStatus]
  }
  
  extension [Self <: DataPlanStatus](x: Self) {
    
    inline def setDataLimitInMegabytes(value: Double): Self = StObject.set(x, "dataLimitInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setDataPlanUsage(value: DataPlanUsage): Self = StObject.set(x, "dataPlanUsage", value.asInstanceOf[js.Any])
    
    inline def setInboundBitsPerSecond(value: Double): Self = StObject.set(x, "inboundBitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setMaxTransferSizeInMegabytes(value: Double): Self = StObject.set(x, "maxTransferSizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setNextBillingCycle(value: Date): Self = StObject.set(x, "nextBillingCycle", value.asInstanceOf[js.Any])
    
    inline def setOutboundBitsPerSecond(value: Double): Self = StObject.set(x, "outboundBitsPerSecond", value.asInstanceOf[js.Any])
  }
}
