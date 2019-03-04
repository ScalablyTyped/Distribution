package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineHiddenDateOption extends js.Object {
  var end: DateType
  var repeat: js.UndefOr[
    visLib.visLibStrings.daily | visLib.visLibStrings.weekly | visLib.visLibStrings.monthly | visLib.visLibStrings.yearly
  ] = js.undefined
  var start: DateType
}

object TimelineHiddenDateOption {
  @scala.inline
  def apply(
    end: DateType,
    start: DateType,
    repeat: visLib.visLibStrings.daily | visLib.visLibStrings.weekly | visLib.visLibStrings.monthly | visLib.visLibStrings.yearly = null
  ): TimelineHiddenDateOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineHiddenDateOption]
  }
}

