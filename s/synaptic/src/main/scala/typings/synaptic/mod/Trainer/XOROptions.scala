package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XOROptions extends js.Object {
  var cost: js.UndefOr[CostFunction] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[Double] = js.undefined
  var shuffle: js.UndefOr[Boolean] = js.undefined
}

object XOROptions {
  @scala.inline
  def apply(
    cost: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double = null,
    iterations: js.UndefOr[Double] = js.undefined,
    log: js.UndefOr[Double] = js.undefined,
    shuffle: js.UndefOr[Boolean] = js.undefined
  ): XOROptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2(cost))
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XOROptions]
  }
}

