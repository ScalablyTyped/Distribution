package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERGOptions extends js.Object {
  var cost: js.UndefOr[CostFunction] = js.undefined
  var error: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
}

object ERGOptions {
  @scala.inline
  def apply(
    cost: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double = null,
    error: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined,
    log: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined
  ): ERGOptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2(cost))
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERGOptions]
  }
}

