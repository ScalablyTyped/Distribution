package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundTripTimeStatistics extends StObject {
  
  var max: Double
  
  var min: Double
  
  var sum: Double
  
  var variance: Double
}
object RoundTripTimeStatistics {
  
  inline def apply(max: Double, min: Double, sum: Double, variance: Double): RoundTripTimeStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundTripTimeStatistics]
  }
  
  extension [Self <: RoundTripTimeStatistics](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
  }
}
