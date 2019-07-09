package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingConfig extends js.Object {
  /** Loss function(s) for the model's output(s). */
  var loss: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var loss_weights: js.UndefOr[
    js.Array[scala.Double] | org.scalablytyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  /** Metric function(s) for the model's output(s). */
  var metrics: js.UndefOr[
    js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var sample_weight_mode: js.UndefOr[java.lang.String] = js.undefined
  var weighted_metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TrainingConfig {
  @scala.inline
  def apply(
    loss: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String],
    loss_weights: js.Array[scala.Double] | org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    metrics: js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    sample_weight_mode: java.lang.String = null,
    weighted_metrics: js.Array[java.lang.String] = null
  ): TrainingConfig = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any])
    if (loss_weights != null) __obj.updateDynamic("loss_weights")(loss_weights.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (sample_weight_mode != null) __obj.updateDynamic("sample_weight_mode")(sample_weight_mode)
    if (weighted_metrics != null) __obj.updateDynamic("weighted_metrics")(weighted_metrics)
    __obj.asInstanceOf[TrainingConfig]
  }
}

