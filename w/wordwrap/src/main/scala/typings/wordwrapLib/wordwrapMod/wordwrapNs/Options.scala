package typings
package wordwrapLib.wordwrapMod.wordwrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mode: js.UndefOr[Mode] = js.undefined
  var start: scala.Double
  var stop: scala.Double
}

object Options {
  @scala.inline
  def apply(start: scala.Double, stop: scala.Double, mode: Mode = null): Options = {
    val __obj = js.Dynamic.literal(start = start, stop = stop)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[Options]
  }
}

