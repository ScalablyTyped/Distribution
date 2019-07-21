package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTrainingUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingConfig
  extends atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatTypesMod.PyJsonDict {
  var loss: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatLossUnderscoreConfigMod.LossIdentifier | (js.Array[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatLossUnderscoreConfigMod.LossIdentifier
  ]) | (org.scalablytyped.runtime.StringDictionary[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatLossUnderscoreConfigMod.LossIdentifier
  ])
  var loss_weights: js.UndefOr[LossWeights] = js.undefined
  var metrics: js.UndefOr[
    js.Array[MetricsIdentifier] | org.scalablytyped.runtime.StringDictionary[MetricsIdentifier]
  ] = js.undefined
  var optimizer_config: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod.OptimizerSerialization
  var sample_weight_mode: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.SampleWeightMode
  ] = js.undefined
  var weighted_metrics: js.UndefOr[js.Array[MetricsIdentifier]] = js.undefined
}

object TrainingConfig {
  @scala.inline
  def apply(
    loss: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatLossUnderscoreConfigMod.LossIdentifier | (js.Array[
      atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatLossUnderscoreConfigMod.LossIdentifier
    ]) | (org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatLossUnderscoreConfigMod.LossIdentifier
    ]),
    optimizer_config: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod.OptimizerSerialization,
    loss_weights: LossWeights = null,
    metrics: js.Array[MetricsIdentifier] | org.scalablytyped.runtime.StringDictionary[MetricsIdentifier] = null,
    sample_weight_mode: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.SampleWeightMode = null,
    weighted_metrics: js.Array[MetricsIdentifier] = null
  ): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer_config = optimizer_config.asInstanceOf[js.Any])
    if (loss_weights != null) __obj.updateDynamic("loss_weights")(loss_weights.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (sample_weight_mode != null) __obj.updateDynamic("sample_weight_mode")(sample_weight_mode)
    if (weighted_metrics != null) __obj.updateDynamic("weighted_metrics")(weighted_metrics)
    __obj.asInstanceOf[TrainingConfig]
  }
}

