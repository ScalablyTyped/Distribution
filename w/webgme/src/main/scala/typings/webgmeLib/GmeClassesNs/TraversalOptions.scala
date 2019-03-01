package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalOptions extends js.Object {
  var excludeRoot: js.UndefOr[scala.Boolean] = js.undefined
  var maxParallelLoad: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[TraversalOrder] = js.undefined
  var stopOnError: js.UndefOr[scala.Boolean] = js.undefined
}

object TraversalOptions {
  @scala.inline
  def apply(
    excludeRoot: js.UndefOr[scala.Boolean] = js.undefined,
    maxParallelLoad: scala.Int | scala.Double = null,
    order: TraversalOrder = null,
    stopOnError: js.UndefOr[scala.Boolean] = js.undefined
  ): TraversalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeRoot)) __obj.updateDynamic("excludeRoot")(excludeRoot)
    if (maxParallelLoad != null) __obj.updateDynamic("maxParallelLoad")(maxParallelLoad.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (!js.isUndefined(stopOnError)) __obj.updateDynamic("stopOnError")(stopOnError)
    __obj.asInstanceOf[TraversalOptions]
  }
}

