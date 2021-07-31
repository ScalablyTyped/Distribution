package typings.winrtUwp.Windows.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerceptionTimestamp extends StObject {
  
  var predictionAmount: js.Any
  
  /* unmapped type */
  var targetTime: js.Any
}
object PerceptionTimestamp {
  
  @scala.inline
  def apply(predictionAmount: js.Any, targetTime: js.Any): PerceptionTimestamp = {
    val __obj = js.Dynamic.literal(predictionAmount = predictionAmount.asInstanceOf[js.Any], targetTime = targetTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionTimestamp]
  }
  
  @scala.inline
  implicit class PerceptionTimestampMutableBuilder[Self <: PerceptionTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredictionAmount(value: js.Any): Self = StObject.set(x, "predictionAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTime(value: js.Any): Self = StObject.set(x, "targetTime", value.asInstanceOf[js.Any])
  }
}
