package typings.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Optimizer
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelCompileArgs extends js.Object {
  /**
    * Object function(s) or name(s) of object function(s).
    * If the model has multiple outputs, you can use a different loss
    * on each output by passing a dictionary or an Array of losses.
    * The loss value that will be minimized by the model will then be the sum
    * of all individual losses.
    */
  var loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn = js.native
  /**
    * List of metrics to be evaluated by the model during training and testing.
    * Typically you will use `metrics=['accuracy']`.
    * To specify different metrics for different outputs of a multi-output
    * model, you could also pass a dictionary.
    */
  var metrics: js.UndefOr[
    String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn])
  ] = js.native
  /**
    * An instance of `tf.train.Optimizer` or a string name for an Optimizer.
    */
  var optimizer: String | Optimizer = js.native
}

object ModelCompileArgs {
  @scala.inline
  def apply(
    loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn,
    optimizer: String | Optimizer
  ): ModelCompileArgs = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer = optimizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCompileArgs]
  }
  @scala.inline
  implicit class ModelCompileArgsOps[Self <: ModelCompileArgs] (val x: Self) extends AnyVal {
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
    def setLossFunction2(value: (/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank]) => Tensor[Rank]): Self = this.set("loss", js.Any.fromFunction2(value))
    @scala.inline
    def setLossVarargs(value: (LossOrMetricFn | String)*): Self = this.set("loss", js.Array(value :_*))
    @scala.inline
    def setLoss(
      value: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn
    ): Self = this.set("loss", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimizer(value: String | Optimizer): Self = this.set("optimizer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricsVarargs(value: (String | LossOrMetricFn)*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetricsFunction2(value: (/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank]) => Tensor[Rank]): Self = this.set("metrics", js.Any.fromFunction2(value))
    @scala.inline
    def setMetrics(
      value: String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn])
    ): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
  }
  
}

