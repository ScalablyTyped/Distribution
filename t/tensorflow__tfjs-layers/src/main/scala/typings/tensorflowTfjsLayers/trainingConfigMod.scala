package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.SampleWeightMode
import typings.tensorflowTfjsLayers.lossConfigMod.LossIdentifier
import typings.tensorflowTfjsLayers.optimizerConfigMod.OptimizerSerialization
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trainingConfigMod {
  
  type LossWeights = js.Array[Double] | StringDictionary[Double]
  
  type MetricsIdentifier = String
  
  trait TrainingConfig
    extends StObject
       with PyJsonDict {
    
    var loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier]
    
    var loss_weights: js.UndefOr[LossWeights] = js.undefined
    
    var metrics: js.UndefOr[js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier]] = js.undefined
    
    var optimizer_config: OptimizerSerialization
    
    var sample_weight_mode: js.UndefOr[SampleWeightMode] = js.undefined
    
    var weighted_metrics: js.UndefOr[js.Array[MetricsIdentifier]] = js.undefined
  }
  object TrainingConfig {
    
    inline def apply(
      loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier],
      optimizer_config: OptimizerSerialization
    ): TrainingConfig = {
      val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer_config = optimizer_config.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrainingConfig]
    }
    
    extension [Self <: TrainingConfig](x: Self) {
      
      inline def setLoss(value: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier]): Self = StObject.set(x, "loss", value.asInstanceOf[js.Any])
      
      inline def setLossVarargs(value: LossIdentifier*): Self = StObject.set(x, "loss", js.Array(value*))
      
      inline def setLoss_weights(value: LossWeights): Self = StObject.set(x, "loss_weights", value.asInstanceOf[js.Any])
      
      inline def setLoss_weightsUndefined: Self = StObject.set(x, "loss_weights", js.undefined)
      
      inline def setLoss_weightsVarargs(value: Double*): Self = StObject.set(x, "loss_weights", js.Array(value*))
      
      inline def setMetrics(value: js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setMetricsVarargs(value: MetricsIdentifier*): Self = StObject.set(x, "metrics", js.Array(value*))
      
      inline def setOptimizer_config(value: OptimizerSerialization): Self = StObject.set(x, "optimizer_config", value.asInstanceOf[js.Any])
      
      inline def setSample_weight_mode(value: SampleWeightMode): Self = StObject.set(x, "sample_weight_mode", value.asInstanceOf[js.Any])
      
      inline def setSample_weight_modeUndefined: Self = StObject.set(x, "sample_weight_mode", js.undefined)
      
      inline def setWeighted_metrics(value: js.Array[MetricsIdentifier]): Self = StObject.set(x, "weighted_metrics", value.asInstanceOf[js.Any])
      
      inline def setWeighted_metricsUndefined: Self = StObject.set(x, "weighted_metrics", js.undefined)
      
      inline def setWeighted_metricsVarargs(value: MetricsIdentifier*): Self = StObject.set(x, "weighted_metrics", js.Array(value*))
    }
  }
}
