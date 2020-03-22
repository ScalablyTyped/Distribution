package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RngOptions extends V4Options {
  var rng: js.UndefOr[js.Function0[InputBuffer]] = js.undefined
}

object RngOptions {
  @scala.inline
  def apply(rng: () => InputBuffer = null): RngOptions = {
    val __obj = js.Dynamic.literal()
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[RngOptions]
  }
}

