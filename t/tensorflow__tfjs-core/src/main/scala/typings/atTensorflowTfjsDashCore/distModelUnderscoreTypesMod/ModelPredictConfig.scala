package typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPredictConfig extends js.Object {
  /**
    * Optional. Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  /**
    * Optional. Verbosity mode. Defaults to false.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object ModelPredictConfig {
  @scala.inline
  def apply(batchSize: Int | Double = null, verbose: js.UndefOr[Boolean] = js.undefined): ModelPredictConfig = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ModelPredictConfig]
  }
}

