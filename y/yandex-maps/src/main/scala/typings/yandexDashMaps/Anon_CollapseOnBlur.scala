package typings.yandexDashMaps

import typings.yandexDashMaps.yandexDashMapsStrings.left
import typings.yandexDashMaps.yandexDashMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollapseOnBlur extends js.Object {
  var collapseOnBlur: js.UndefOr[Boolean] = js.undefined
  var expandOnClick: js.UndefOr[Boolean] = js.undefined
  var popupFloat: js.UndefOr[left | right] = js.undefined
}

object Anon_CollapseOnBlur {
  @scala.inline
  def apply(
    collapseOnBlur: js.UndefOr[Boolean] = js.undefined,
    expandOnClick: js.UndefOr[Boolean] = js.undefined,
    popupFloat: left | right = null
  ): Anon_CollapseOnBlur = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseOnBlur)) __obj.updateDynamic("collapseOnBlur")(collapseOnBlur)
    if (!js.isUndefined(expandOnClick)) __obj.updateDynamic("expandOnClick")(expandOnClick)
    if (popupFloat != null) __obj.updateDynamic("popupFloat")(popupFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CollapseOnBlur]
  }
}

