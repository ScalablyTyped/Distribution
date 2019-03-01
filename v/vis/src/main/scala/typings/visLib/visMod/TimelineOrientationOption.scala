package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOrientationOption extends js.Object {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var item: js.UndefOr[java.lang.String] = js.undefined
}

object TimelineOrientationOption {
  @scala.inline
  def apply(axis: java.lang.String = null, item: java.lang.String = null): TimelineOrientationOption = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[TimelineOrientationOption]
  }
}

