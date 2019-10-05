package typings.yandexDashMaps.yandexDashMapsMod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILeftMouseButtonMagnifierOptions extends js.Object {
  var actionCursor: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object ILeftMouseButtonMagnifierOptions {
  @scala.inline
  def apply(actionCursor: String = null, cursor: String = null, duration: Int | Double = null): ILeftMouseButtonMagnifierOptions = {
    val __obj = js.Dynamic.literal()
    if (actionCursor != null) __obj.updateDynamic("actionCursor")(actionCursor)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILeftMouseButtonMagnifierOptions]
  }
}

