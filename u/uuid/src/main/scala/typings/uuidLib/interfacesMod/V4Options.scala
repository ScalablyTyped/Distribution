package typings
package uuidLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V4Options extends js.Object {
  var random: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var rng: js.UndefOr[js.Function0[js.Array[scala.Double]]] = js.undefined
}

object V4Options {
  @scala.inline
  def apply(random: js.Array[scala.Double] = null, rng: () => js.Array[scala.Double] = null): V4Options = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(random)
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[V4Options]
  }
}

