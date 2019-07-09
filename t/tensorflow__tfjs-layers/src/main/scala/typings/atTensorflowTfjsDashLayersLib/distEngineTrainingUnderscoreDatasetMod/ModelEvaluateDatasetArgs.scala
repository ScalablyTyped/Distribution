package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreDatasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelEvaluateDatasetArgs extends js.Object {
  /**
    * Number of batches to draw from the dataset object before ending the
    * evaluation.
    */
  var batches: js.UndefOr[scala.Double] = js.undefined
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
  ] = js.undefined
}

object ModelEvaluateDatasetArgs {
  @scala.inline
  def apply(
    batches: scala.Int | scala.Double = null,
    verbose: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity = null
  ): ModelEvaluateDatasetArgs = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ModelEvaluateDatasetArgs]
  }
}

