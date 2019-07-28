package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOrientationOption extends js.Object {
  var axis: js.UndefOr[String] = js.undefined
  var item: js.UndefOr[String] = js.undefined
}

object TimelineOrientationOption {
  @scala.inline
  def apply(axis: String = null, item: String = null): TimelineOrientationOption = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[TimelineOrientationOption]
  }
}

