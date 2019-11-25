package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTrainingUnderscoreConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.SampleWeightMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatLossUnderscoreConfigMod.LossIdentifier
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod.OptimizerSerialization
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingConfig extends PyJsonDict {
  var loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier]
  var loss_weights: js.UndefOr[LossWeights] = js.undefined
  var metrics: js.UndefOr[js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier]] = js.undefined
  var optimizer_config: OptimizerSerialization
  var sample_weight_mode: js.UndefOr[SampleWeightMode] = js.undefined
  var weighted_metrics: js.UndefOr[js.Array[MetricsIdentifier]] = js.undefined
}

object TrainingConfig {
  @scala.inline
  def apply(
    loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier],
    optimizer_config: OptimizerSerialization,
    loss_weights: LossWeights = null,
    metrics: js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier] = null,
    sample_weight_mode: SampleWeightMode = null,
    weighted_metrics: js.Array[MetricsIdentifier] = null
  ): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer_config = optimizer_config.asInstanceOf[js.Any])
    if (loss_weights != null) __obj.updateDynamic("loss_weights")(loss_weights.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (sample_weight_mode != null) __obj.updateDynamic("sample_weight_mode")(sample_weight_mode.asInstanceOf[js.Any])
    if (weighted_metrics != null) __obj.updateDynamic("weighted_metrics")(weighted_metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingConfig]
  }
}

