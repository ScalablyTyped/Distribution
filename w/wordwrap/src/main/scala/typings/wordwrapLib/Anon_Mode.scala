package typings
package wordwrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: js.UndefOr[wordwrapLib.wordwrapMod.wordwrapNs.Mode] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: wordwrapLib.wordwrapMod.wordwrapNs.Mode = null): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[Anon_Mode]
  }
}

