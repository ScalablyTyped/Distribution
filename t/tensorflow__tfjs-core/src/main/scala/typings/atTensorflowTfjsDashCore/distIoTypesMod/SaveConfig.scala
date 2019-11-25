package typings.atTensorflowTfjsDashCore.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveConfig extends js.Object {
  /**
    * Whether the optimizer will be saved (if exists).
    *
    * Default: `false`.
    */
  var includeOptimizer: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to save only the trainable weights of the model, ignoring the
    * non-trainable ones.
    */
  var trainableOnly: js.UndefOr[Boolean] = js.undefined
}

object SaveConfig {
  @scala.inline
  def apply(
    includeOptimizer: js.UndefOr[Boolean] = js.undefined,
    trainableOnly: js.UndefOr[Boolean] = js.undefined
  ): SaveConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeOptimizer)) __obj.updateDynamic("includeOptimizer")(includeOptimizer.asInstanceOf[js.Any])
    if (!js.isUndefined(trainableOnly)) __obj.updateDynamic("trainableOnly")(trainableOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveConfig]
  }
}

