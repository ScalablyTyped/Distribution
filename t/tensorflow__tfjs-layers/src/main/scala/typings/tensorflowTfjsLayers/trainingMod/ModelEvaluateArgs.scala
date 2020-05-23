package typings.tensorflowTfjsLayers.trainingMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelEvaluateArgs extends js.Object {
  /**
    * Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  /**
    * Tensor of weights to weight the contribution of different samples to the
    * loss and metrics.
    */
  var sampleWeight: js.UndefOr[Tensor[Rank]] = js.undefined
  /**
    * integer: total number of steps (batches of samples)
    * before declaring the evaluation round finished. Ignored with the default
    * value of `undefined`.
    */
  var steps: js.UndefOr[Double] = js.undefined
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[ModelLoggingVerbosity] = js.undefined
}

object ModelEvaluateArgs {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[Double] = js.undefined,
    sampleWeight: Tensor[Rank] = null,
    steps: js.UndefOr[Double] = js.undefined,
    verbose: ModelLoggingVerbosity = null
  ): ModelEvaluateArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (sampleWeight != null) __obj.updateDynamic("sampleWeight")(sampleWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelEvaluateArgs]
  }
}

