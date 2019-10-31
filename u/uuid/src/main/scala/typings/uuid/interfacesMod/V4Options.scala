package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V4Options extends js.Object {
  var random: js.UndefOr[InputBuffer] = js.undefined
  var rng: js.UndefOr[js.Function0[InputBuffer]] = js.undefined
}

object V4Options {
  @scala.inline
  def apply(random: InputBuffer = null, rng: () => InputBuffer = null): V4Options = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[V4Options]
  }
}

