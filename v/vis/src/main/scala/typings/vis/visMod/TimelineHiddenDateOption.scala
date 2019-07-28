package typings.vis.visMod

import typings.vis.visStrings.daily
import typings.vis.visStrings.monthly
import typings.vis.visStrings.weekly
import typings.vis.visStrings.yearly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineHiddenDateOption extends js.Object {
  var end: DateType
  var repeat: js.UndefOr[daily | weekly | monthly | yearly] = js.undefined
  var start: DateType
}

object TimelineHiddenDateOption {
  @scala.inline
  def apply(end: DateType, start: DateType, repeat: daily | weekly | monthly | yearly = null): TimelineHiddenDateOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineHiddenDateOption]
  }
}

