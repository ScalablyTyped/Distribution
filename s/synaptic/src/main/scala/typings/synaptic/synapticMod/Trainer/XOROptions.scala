package typings.synaptic.synapticMod.Trainer

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
    iterations: Int | Double = null,
    log: Int | Double = null,
    shuffle: js.UndefOr[Boolean] = js.undefined
  ): XOROptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2(cost))
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[XOROptions]
  }
}

