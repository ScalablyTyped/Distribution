package typings.atTensorflowTfjsDashLayers.distEngineTrainingMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
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
    batchSize: Int | Double = null,
    sampleWeight: Tensor[Rank] = null,
    steps: Int | Double = null,
    verbose: ModelLoggingVerbosity = null
  ): ModelEvaluateArgs = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (sampleWeight != null) __obj.updateDynamic("sampleWeight")(sampleWeight)
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ModelEvaluateArgs]
  }
}

