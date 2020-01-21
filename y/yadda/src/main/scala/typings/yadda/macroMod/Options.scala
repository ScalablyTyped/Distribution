package typings.yadda.macroMod

import typings.yadda.yaddaStrings.promise
import typings.yadda.yaddaStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mode: js.UndefOr[promise | sync] = js.undefined
}

object Options {
  @scala.inline
  def apply(mode: promise | sync = null): Options = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

