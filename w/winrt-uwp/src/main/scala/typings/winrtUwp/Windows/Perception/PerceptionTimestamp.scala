package typings.winrtUwp.Windows.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerceptionTimestamp extends StObject {
  
  var predictionAmount: Any
  
  /* unmapped type */
  var targetTime: Any
}
object PerceptionTimestamp {
  
  inline def apply(predictionAmount: Any, targetTime: Any): PerceptionTimestamp = {
    val __obj = js.Dynamic.literal(predictionAmount = predictionAmount.asInstanceOf[js.Any], targetTime = targetTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerceptionTimestamp] (val x: Self) extends AnyVal {
    
    inline def setPredictionAmount(value: Any): Self = StObject.set(x, "predictionAmount", value.asInstanceOf[js.Any])
    
    inline def setTargetTime(value: Any): Self = StObject.set(x, "targetTime", value.asInstanceOf[js.Any])
  }
}
