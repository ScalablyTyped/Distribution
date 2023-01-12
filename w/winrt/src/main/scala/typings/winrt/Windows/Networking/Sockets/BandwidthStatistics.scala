package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandwidthStatistics extends StObject {
  
  var inboundBandwidthPeaked: Boolean
  
  var inboundBitsPerSecond: Double
  
  var inboundBitsPerSecondInstability: Double
  
  var outboundBandwidthPeaked: Boolean
  
  var outboundBitsPerSecond: Double
  
  var outboundBitsPerSecondInstability: Double
}
object BandwidthStatistics {
  
  inline def apply(
    inboundBandwidthPeaked: Boolean,
    inboundBitsPerSecond: Double,
    inboundBitsPerSecondInstability: Double,
    outboundBandwidthPeaked: Boolean,
    outboundBitsPerSecond: Double,
    outboundBitsPerSecondInstability: Double
  ): BandwidthStatistics = {
    val __obj = js.Dynamic.literal(inboundBandwidthPeaked = inboundBandwidthPeaked.asInstanceOf[js.Any], inboundBitsPerSecond = inboundBitsPerSecond.asInstanceOf[js.Any], inboundBitsPerSecondInstability = inboundBitsPerSecondInstability.asInstanceOf[js.Any], outboundBandwidthPeaked = outboundBandwidthPeaked.asInstanceOf[js.Any], outboundBitsPerSecond = outboundBitsPerSecond.asInstanceOf[js.Any], outboundBitsPerSecondInstability = outboundBitsPerSecondInstability.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BandwidthStatistics] (val x: Self) extends AnyVal {
    
    inline def setInboundBandwidthPeaked(value: Boolean): Self = StObject.set(x, "inboundBandwidthPeaked", value.asInstanceOf[js.Any])
    
    inline def setInboundBitsPerSecond(value: Double): Self = StObject.set(x, "inboundBitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setInboundBitsPerSecondInstability(value: Double): Self = StObject.set(x, "inboundBitsPerSecondInstability", value.asInstanceOf[js.Any])
    
    inline def setOutboundBandwidthPeaked(value: Boolean): Self = StObject.set(x, "outboundBandwidthPeaked", value.asInstanceOf[js.Any])
    
    inline def setOutboundBitsPerSecond(value: Double): Self = StObject.set(x, "outboundBitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setOutboundBitsPerSecondInstability(value: Double): Self = StObject.set(x, "outboundBitsPerSecondInstability", value.asInstanceOf[js.Any])
  }
}
