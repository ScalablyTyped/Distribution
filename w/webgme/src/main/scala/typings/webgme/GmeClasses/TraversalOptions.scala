package typings.webgme.GmeClasses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalOptions extends js.Object {
  var excludeRoot: js.UndefOr[Boolean] = js.undefined
  var maxParallelLoad: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[TraversalOrder] = js.undefined
  var stopOnError: js.UndefOr[Boolean] = js.undefined
}

object TraversalOptions {
  @scala.inline
  def apply(
    excludeRoot: js.UndefOr[Boolean] = js.undefined,
    maxParallelLoad: js.UndefOr[Double] = js.undefined,
    order: TraversalOrder = null,
    stopOnError: js.UndefOr[Boolean] = js.undefined
  ): TraversalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeRoot)) __obj.updateDynamic("excludeRoot")(excludeRoot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxParallelLoad)) __obj.updateDynamic("maxParallelLoad")(maxParallelLoad.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnError)) __obj.updateDynamic("stopOnError")(stopOnError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalOptions]
  }
}

