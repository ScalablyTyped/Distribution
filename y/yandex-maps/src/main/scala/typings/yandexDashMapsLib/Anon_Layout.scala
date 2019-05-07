package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Layout extends js.Object {
  var layout: js.UndefOr[
    java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISelectableControlLayout]
  ] = js.undefined
  var selectOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var selectableLayout: js.UndefOr[
    java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISelectableControlLayout]
  ] = js.undefined
  var separatorLayout: js.UndefOr[
    java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISelectableControlLayout]
  ] = js.undefined
  var `type`: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.selectable | yandexDashMapsLib.yandexDashMapsLibStrings.separator
  ] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Layout {
  @scala.inline
  def apply(
    layout: java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISelectableControlLayout] = null,
    selectOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    selectableLayout: java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISelectableControlLayout] = null,
    separatorLayout: java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISelectableControlLayout] = null,
    `type`: yandexDashMapsLib.yandexDashMapsLibStrings.selectable | yandexDashMapsLib.yandexDashMapsLibStrings.separator = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Layout = {
    val __obj = js.Dynamic.literal()
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick)
    if (selectableLayout != null) __obj.updateDynamic("selectableLayout")(selectableLayout.asInstanceOf[js.Any])
    if (separatorLayout != null) __obj.updateDynamic("separatorLayout")(separatorLayout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_Layout]
  }
}

