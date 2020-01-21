package typings.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.mod.Optimizer
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelCompileArgs extends js.Object {
  /**
    * Object function(s) or name(s) of object function(s).
    * If the model has multiple outputs, you can use a different loss
    * on each output by passing a dictionary or an Array of losses.
    * The loss value that will be minimized by the model will then be the sum
    * of all individual losses.
    */
  var loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn
  /**
    * List of metrics to be evaluated by the model during training and testing.
    * Typically you will use `metrics=['accuracy']`.
    * To specify different metrics for different outputs of a multi-output
    * model, you could also pass a dictionary.
    */
  var metrics: js.UndefOr[
    String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn])
  ] = js.undefined
  /**
    * An instance of `tf.train.Optimizer` or a string name for an Optimizer.
    */
  var optimizer: String | Optimizer
}

object ModelCompileArgs {
  @scala.inline
  def apply(
    loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn,
    optimizer: String | Optimizer,
    metrics: String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn]) = null
  ): ModelCompileArgs = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer = optimizer.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCompileArgs]
  }
}

