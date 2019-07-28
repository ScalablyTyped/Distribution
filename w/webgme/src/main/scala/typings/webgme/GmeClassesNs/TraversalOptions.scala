package typings.webgme.GmeClassesNs

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
    maxParallelLoad: Int | Double = null,
    order: TraversalOrder = null,
    stopOnError: js.UndefOr[Boolean] = js.undefined
  ): TraversalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeRoot)) __obj.updateDynamic("excludeRoot")(excludeRoot)
    if (maxParallelLoad != null) __obj.updateDynamic("maxParallelLoad")(maxParallelLoad.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (!js.isUndefined(stopOnError)) __obj.updateDynamic("stopOnError")(stopOnError)
    __obj.asInstanceOf[TraversalOptions]
  }
}

