package typings.wordwrap.wordwrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mode: js.UndefOr[Mode] = js.undefined
  var start: Double
  var stop: Double
}

object Options {
  @scala.inline
  def apply(start: Double, stop: Double, mode: Mode = null): Options = {
    val __obj = js.Dynamic.literal(start = start, stop = stop)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[Options]
  }
}

