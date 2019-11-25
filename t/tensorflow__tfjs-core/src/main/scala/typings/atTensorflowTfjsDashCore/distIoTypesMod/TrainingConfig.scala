package typings.atTensorflowTfjsDashCore.distIoTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingConfig extends js.Object {
  /** Loss function(s) for the model's output(s). */
  var loss: String | js.Array[String] | StringDictionary[String]
  var loss_weights: js.UndefOr[js.Array[Double] | StringDictionary[Double]] = js.undefined
  /** Metric function(s) for the model's output(s). */
  var metrics: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.undefined
  var sample_weight_mode: js.UndefOr[String] = js.undefined
  var weighted_metrics: js.UndefOr[js.Array[String]] = js.undefined
}

object TrainingConfig {
  @scala.inline
  def apply(
    loss: String | js.Array[String] | StringDictionary[String],
    loss_weights: js.Array[Double] | StringDictionary[Double] = null,
    metrics: js.Array[String] | StringDictionary[String] = null,
    sample_weight_mode: String = null,
    weighted_metrics: js.Array[String] = null
  ): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any])
    if (loss_weights != null) __obj.updateDynamic("loss_weights")(loss_weights.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (sample_weight_mode != null) __obj.updateDynamic("sample_weight_mode")(sample_weight_mode.asInstanceOf[js.Any])
    if (weighted_metrics != null) __obj.updateDynamic("weighted_metrics")(weighted_metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingConfig]
  }
}

