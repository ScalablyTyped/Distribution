package typings
package yaddaLib.libMacroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mode: js.UndefOr[yaddaLib.yaddaLibStrings.promise | yaddaLib.yaddaLibStrings.sync] = js.undefined
}

object Options {
  @scala.inline
  def apply(mode: yaddaLib.yaddaLibStrings.promise | yaddaLib.yaddaLibStrings.sync = null): Options = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

