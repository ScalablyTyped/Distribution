package typings.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationHookOptions extends js.Object {
  var base: js.UndefOr[Path] = js.undefined
}

object LocationHookOptions {
  @scala.inline
  def apply(base: Path = null): LocationHookOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationHookOptions]
  }
}

