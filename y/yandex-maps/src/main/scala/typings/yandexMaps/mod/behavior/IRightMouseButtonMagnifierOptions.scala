package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRightMouseButtonMagnifierOptions extends js.Object {
  var actionCursor: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object IRightMouseButtonMagnifierOptions {
  @scala.inline
  def apply(actionCursor: String = null, duration: js.UndefOr[Double] = js.undefined): IRightMouseButtonMagnifierOptions = {
    val __obj = js.Dynamic.literal()
    if (actionCursor != null) __obj.updateDynamic("actionCursor")(actionCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRightMouseButtonMagnifierOptions]
  }
}

