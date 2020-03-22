package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[AnonBottom] = js.undefined
  var scaleLine: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    position: AnonBottom = null,
    scaleLine: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleLine)) __obj.updateDynamic("scaleLine")(scaleLine.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

