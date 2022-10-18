package typings.tensorflowTfjsCore.distIoTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingConfig extends StObject {
  
  /** Loss function(s) for the model's output(s). */
  var loss: String | js.Array[String] | StringDictionary[String]
  
  var loss_weights: js.UndefOr[js.Array[Double] | StringDictionary[Double]] = js.undefined
  
  /** Metric function(s) for the model's output(s). */
  var metrics: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.undefined
  
  var sample_weight_mode: js.UndefOr[String] = js.undefined
  
  var weighted_metrics: js.UndefOr[js.Array[String]] = js.undefined
}
object TrainingConfig {
  
  inline def apply(loss: String | js.Array[String] | StringDictionary[String]): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingConfig]
  }
  
  extension [Self <: TrainingConfig](x: Self) {
    
    inline def setLoss(value: String | js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "loss", value.asInstanceOf[js.Any])
    
    inline def setLossVarargs(value: String*): Self = StObject.set(x, "loss", js.Array(value*))
    
    inline def setLoss_weights(value: js.Array[Double] | StringDictionary[Double]): Self = StObject.set(x, "loss_weights", value.asInstanceOf[js.Any])
    
    inline def setLoss_weightsUndefined: Self = StObject.set(x, "loss_weights", js.undefined)
    
    inline def setLoss_weightsVarargs(value: Double*): Self = StObject.set(x, "loss_weights", js.Array(value*))
    
    inline def setMetrics(value: js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setSample_weight_mode(value: String): Self = StObject.set(x, "sample_weight_mode", value.asInstanceOf[js.Any])
    
    inline def setSample_weight_modeUndefined: Self = StObject.set(x, "sample_weight_mode", js.undefined)
    
    inline def setWeighted_metrics(value: js.Array[String]): Self = StObject.set(x, "weighted_metrics", value.asInstanceOf[js.Any])
    
    inline def setWeighted_metricsUndefined: Self = StObject.set(x, "weighted_metrics", js.undefined)
    
    inline def setWeighted_metricsVarargs(value: String*): Self = StObject.set(x, "weighted_metrics", js.Array(value*))
  }
}
