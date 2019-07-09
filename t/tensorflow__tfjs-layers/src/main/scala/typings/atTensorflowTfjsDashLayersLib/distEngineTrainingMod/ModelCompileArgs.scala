package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingMod

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
  var loss: java.lang.String | (js.Array[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | java.lang.String]) | (org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | java.lang.String]) | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn
  /**
    * List of metrics to be evaluated by the model during training and testing.
    * Typically you will use `metrics=['accuracy']`.
    * To specify different metrics for different outputs of a multi-output
    * model, you could also pass a dictionary.
    */
  var metrics: js.UndefOr[
    java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | (js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]) | (org.scalablytyped.runtime.StringDictionary[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn])
  ] = js.undefined
  /**
    * An instance of `tf.train.Optimizer` or a string name for an Optimizer.
    */
  var optimizer: java.lang.String | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Optimizer
}

object ModelCompileArgs {
  @scala.inline
  def apply(
    loss: java.lang.String | (js.Array[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | java.lang.String]) | (org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | java.lang.String]) | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn,
    optimizer: java.lang.String | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Optimizer,
    metrics: java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | (js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]) | (org.scalablytyped.runtime.StringDictionary[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]) = null
  ): ModelCompileArgs = {
    val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer = optimizer.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCompileArgs]
  }
}

