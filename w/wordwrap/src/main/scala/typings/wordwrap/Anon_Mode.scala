package typings.wordwrap

import typings.wordwrap.wordwrapMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: js.UndefOr[Mode] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: Mode = null): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mode]
  }
}

