package typings.yandexMaps

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.ISelectableControlLayout
import typings.yandexMaps.yandexMapsStrings.selectable
import typings.yandexMaps.yandexMapsStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayout extends js.Object {
  var layout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  var selectableLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  var separatorLayout: js.UndefOr[String | IClassConstructor[ISelectableControlLayout]] = js.undefined
  var `type`: js.UndefOr[selectable | separator] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonLayout {
  @scala.inline
  def apply(
    layout: String | IClassConstructor[ISelectableControlLayout] = null,
    selectOnClick: js.UndefOr[Boolean] = js.undefined,
    selectableLayout: String | IClassConstructor[ISelectableControlLayout] = null,
    separatorLayout: String | IClassConstructor[ISelectableControlLayout] = null,
    `type`: selectable | separator = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonLayout = {
    val __obj = js.Dynamic.literal()
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick.asInstanceOf[js.Any])
    if (selectableLayout != null) __obj.updateDynamic("selectableLayout")(selectableLayout.asInstanceOf[js.Any])
    if (separatorLayout != null) __obj.updateDynamic("separatorLayout")(separatorLayout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayout]
  }
}

