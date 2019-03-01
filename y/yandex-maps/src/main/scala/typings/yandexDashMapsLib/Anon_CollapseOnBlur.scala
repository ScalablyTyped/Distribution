package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollapseOnBlur extends js.Object {
  var collapseOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  var expandOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var popupFloat: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
  ] = js.undefined
}

object Anon_CollapseOnBlur {
  @scala.inline
  def apply(
    collapseOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    popupFloat: yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right = null
  ): Anon_CollapseOnBlur = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseOnBlur)) __obj.updateDynamic("collapseOnBlur")(collapseOnBlur)
    if (!js.isUndefined(expandOnClick)) __obj.updateDynamic("expandOnClick")(expandOnClick)
    if (popupFloat != null) __obj.updateDynamic("popupFloat")(popupFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CollapseOnBlur]
  }
}

