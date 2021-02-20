package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoundTripTimeStatistics extends StObject {
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var sum: Double = js.native
  
  var variance: Double = js.native
}
object RoundTripTimeStatistics {
  
  @scala.inline
  def apply(max: Double, min: Double, sum: Double, variance: Double): RoundTripTimeStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundTripTimeStatistics]
  }
  
  @scala.inline
  implicit class RoundTripTimeStatisticsMutableBuilder[Self <: RoundTripTimeStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
  }
}
