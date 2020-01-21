package typings.wordwrap

import typings.wordwrap.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: js.UndefOr[Mode] = js.undefined
}

object AnonMode {
  @scala.inline
  def apply(mode: Mode = null): AnonMode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

