package typings.yandexMaps

import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollapseOnBlur extends js.Object {
  var collapseOnBlur: js.UndefOr[Boolean] = js.undefined
  var expandOnClick: js.UndefOr[Boolean] = js.undefined
  var popupFloat: js.UndefOr[left | right] = js.undefined
}

object AnonCollapseOnBlur {
  @scala.inline
  def apply(
    collapseOnBlur: js.UndefOr[Boolean] = js.undefined,
    expandOnClick: js.UndefOr[Boolean] = js.undefined,
    popupFloat: left | right = null
  ): AnonCollapseOnBlur = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseOnBlur)) __obj.updateDynamic("collapseOnBlur")(collapseOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnClick)) __obj.updateDynamic("expandOnClick")(expandOnClick.asInstanceOf[js.Any])
    if (popupFloat != null) __obj.updateDynamic("popupFloat")(popupFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollapseOnBlur]
  }
}

