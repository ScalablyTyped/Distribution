package typings
package atTensorflowTfjsDashLayersLib.distModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPredictArgs extends js.Object {
  /**
    * Optional. Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. Verbosity mode. Defaults to false.
    */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object ModelPredictArgs {
  @scala.inline
  def apply(batchSize: scala.Int | scala.Double = null, verbose: js.UndefOr[scala.Boolean] = js.undefined): ModelPredictArgs = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ModelPredictArgs]
  }
}

