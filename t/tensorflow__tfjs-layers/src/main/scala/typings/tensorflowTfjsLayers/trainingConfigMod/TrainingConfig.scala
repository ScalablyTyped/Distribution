package typings.tensorflowTfjsLayers.trainingConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.SampleWeightMode
import typings.tensorflowTfjsLayers.lossConfigMod.LossIdentifier
import typings.tensorflowTfjsLayers.optimizerConfigMod.OptimizerSerialization
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingConfig extends PyJsonDict {
  var loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier] = js.native
  var loss_weights: js.UndefOr[LossWeights] = js.native
  var metrics: js.UndefOr[js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier]] = js.native
  var optimizer_config: OptimizerSerialization = js.native
  var sample_weight_mode: js.UndefOr[SampleWeightMode] = js.native
  var weighted_metrics: js.UndefOr[js.Array[MetricsIdentifier]] = js.native
}

object TrainingConfig {
  @scala.inline
  def apply(
    loss: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier],
    optimizer_config: OptimizerSerialization
  ): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer_config = optimizer_config.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingConfig]
  }
  @scala.inline
  implicit class TrainingConfigOps[Self <: TrainingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLossVarargs(value: LossIdentifier*): Self = this.set("loss", js.Array(value :_*))
    @scala.inline
    def setLoss(value: LossIdentifier | js.Array[LossIdentifier] | StringDictionary[LossIdentifier]): Self = this.set("loss", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimizer_config(value: OptimizerSerialization): Self = this.set("optimizer_config", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoss_weightsVarargs(value: Double*): Self = this.set("loss_weights", js.Array(value :_*))
    @scala.inline
    def setLoss_weights(value: LossWeights): Self = this.set("loss_weights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoss_weights: Self = this.set("loss_weights", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: MetricsIdentifier*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[MetricsIdentifier] | StringDictionary[MetricsIdentifier]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setSample_weight_mode(value: SampleWeightMode): Self = this.set("sample_weight_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample_weight_mode: Self = this.set("sample_weight_mode", js.undefined)
    @scala.inline
    def setWeighted_metricsVarargs(value: MetricsIdentifier*): Self = this.set("weighted_metrics", js.Array(value :_*))
    @scala.inline
    def setWeighted_metrics(value: js.Array[MetricsIdentifier]): Self = this.set("weighted_metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeighted_metrics: Self = this.set("weighted_metrics", js.undefined)
  }
  
}

