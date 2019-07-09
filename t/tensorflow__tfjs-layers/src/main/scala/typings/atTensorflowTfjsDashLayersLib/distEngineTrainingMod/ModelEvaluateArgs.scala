package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelEvaluateArgs extends js.Object {
  /**
    * Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Tensor of weights to weight the contribution of different samples to the
    * loss and metrics.
    */
  var sampleWeight: js.UndefOr[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.undefined
  /**
    * integer: total number of steps (batches of samples)
    * before declaring the evaluation round finished. Ignored with the default
    * value of `undefined`.
    */
  var steps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
  ] = js.undefined
}

object ModelEvaluateArgs {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    sampleWeight: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = null,
    steps: scala.Int | scala.Double = null,
    verbose: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity = null
  ): ModelEvaluateArgs = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (sampleWeight != null) __obj.updateDynamic("sampleWeight")(sampleWeight)
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ModelEvaluateArgs]
  }
}

