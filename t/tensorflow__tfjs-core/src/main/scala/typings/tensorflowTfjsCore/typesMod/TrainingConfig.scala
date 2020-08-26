package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingConfig extends js.Object {
  /** Loss function(s) for the model's output(s). */
  var loss: String | js.Array[String] | StringDictionary[String] = js.native
  var loss_weights: js.UndefOr[js.Array[Double] | StringDictionary[Double]] = js.native
  /** Metric function(s) for the model's output(s). */
  var metrics: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.native
  var sample_weight_mode: js.UndefOr[String] = js.native
  var weighted_metrics: js.UndefOr[js.Array[String]] = js.native
}

object TrainingConfig {
  @scala.inline
  def apply(loss: String | js.Array[String] | StringDictionary[String]): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any])
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
    def setLossVarargs(value: String*): Self = this.set("loss", js.Array(value :_*))
    @scala.inline
    def setLoss(value: String | js.Array[String] | StringDictionary[String]): Self = this.set("loss", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoss_weightsVarargs(value: Double*): Self = this.set("loss_weights", js.Array(value :_*))
    @scala.inline
    def setLoss_weights(value: js.Array[Double] | StringDictionary[Double]): Self = this.set("loss_weights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoss_weights: Self = this.set("loss_weights", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: String*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[String] | StringDictionary[String]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setSample_weight_mode(value: String): Self = this.set("sample_weight_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample_weight_mode: Self = this.set("sample_weight_mode", js.undefined)
    @scala.inline
    def setWeighted_metricsVarargs(value: String*): Self = this.set("weighted_metrics", js.Array(value :_*))
    @scala.inline
    def setWeighted_metrics(value: js.Array[String]): Self = this.set("weighted_metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeighted_metrics: Self = this.set("weighted_metrics", js.undefined)
  }
  
}

