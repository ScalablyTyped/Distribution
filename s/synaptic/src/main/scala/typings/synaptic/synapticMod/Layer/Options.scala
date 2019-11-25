package typings.synaptic.synapticMod.Layer

import typings.synaptic.synapticMod.Neuron.SquashingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[js.Any] = js.undefined
  var squash: js.UndefOr[SquashingFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bias: Int | Double = null,
    label: js.Any = null,
    squash: (/* x */ Double, /* derivate */ Boolean) => Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (squash != null) __obj.updateDynamic("squash")(js.Any.fromFunction2(squash))
    __obj.asInstanceOf[Options]
  }
}

