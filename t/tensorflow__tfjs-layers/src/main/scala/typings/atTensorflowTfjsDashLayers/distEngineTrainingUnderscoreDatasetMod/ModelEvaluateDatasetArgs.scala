package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreDatasetMod

import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelEvaluateDatasetArgs extends js.Object {
  /**
    * Number of batches to draw from the dataset object before ending the
    * evaluation.
    */
  var batches: js.UndefOr[Double] = js.undefined
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[ModelLoggingVerbosity] = js.undefined
}

object ModelEvaluateDatasetArgs {
  @scala.inline
  def apply(batches: Int | Double = null, verbose: ModelLoggingVerbosity = null): ModelEvaluateDatasetArgs = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelEvaluateDatasetArgs]
  }
}

