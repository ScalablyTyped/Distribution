package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClusterPlacemarkOptions extends js.Object {
  var balloonContentLayout: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.`cluster#balloonTwoColumns` | yandexDashMapsLib.yandexDashMapsLibStrings.`cluster#balloonCarousel` | yandexDashMapsLib.yandexDashMapsLibStrings.`cluster#balloonAccordion` | java.lang.String | IClassConstructor[ILayout]
  ] = js.undefined
  var balloonContentLayoutHeight: js.UndefOr[scala.Double] = js.undefined
  var balloonContentLayoutWidth: js.UndefOr[scala.Double] = js.undefined
  var balloonItemContentLayout: js.UndefOr[ILayout | java.lang.String] = js.undefined
  var balloonPanelContentLayout: js.UndefOr[java.lang.String | IClassConstructor[ILayout]] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var disableClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  var hideIconOnBalloonOpen: js.UndefOr[scala.Boolean] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var iconContentLayout: js.UndefOr[java.lang.String | IClassConstructor[ILayout]] = js.undefined
  var iconLayout: js.UndefOr[java.lang.String | IClassConstructor[ILayout]] = js.undefined
  var iconShape: js.UndefOr[IGeometryJson] = js.undefined
  var icons: js.UndefOr[js.Array[yandexDashMapsLib.Anon_Href]] = js.undefined
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  var numbers: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var zIndexHover: js.UndefOr[scala.Double] = js.undefined
}

object IClusterPlacemarkOptions {
  @scala.inline
  def apply(
    balloonContentLayout: yandexDashMapsLib.yandexDashMapsLibStrings.`cluster#balloonTwoColumns` | yandexDashMapsLib.yandexDashMapsLibStrings.`cluster#balloonCarousel` | yandexDashMapsLib.yandexDashMapsLibStrings.`cluster#balloonAccordion` | java.lang.String | IClassConstructor[ILayout] = null,
    balloonContentLayoutHeight: scala.Int | scala.Double = null,
    balloonContentLayoutWidth: scala.Int | scala.Double = null,
    balloonItemContentLayout: ILayout | java.lang.String = null,
    balloonPanelContentLayout: java.lang.String | IClassConstructor[ILayout] = null,
    cursor: java.lang.String = null,
    disableClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    hideIconOnBalloonOpen: js.UndefOr[scala.Boolean] = js.undefined,
    iconColor: java.lang.String = null,
    iconContentLayout: java.lang.String | IClassConstructor[ILayout] = null,
    iconLayout: java.lang.String | IClassConstructor[ILayout] = null,
    iconShape: IGeometryJson = null,
    icons: js.Array[yandexDashMapsLib.Anon_Href] = null,
    interactivityModel: InteractivityModelKey = null,
    numbers: js.Array[scala.Double] = null,
    openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    zIndexHover: scala.Int | scala.Double = null
  ): IClusterPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    if (balloonContentLayout != null) __obj.updateDynamic("balloonContentLayout")(balloonContentLayout.asInstanceOf[js.Any])
    if (balloonContentLayoutHeight != null) __obj.updateDynamic("balloonContentLayoutHeight")(balloonContentLayoutHeight.asInstanceOf[js.Any])
    if (balloonContentLayoutWidth != null) __obj.updateDynamic("balloonContentLayoutWidth")(balloonContentLayoutWidth.asInstanceOf[js.Any])
    if (balloonItemContentLayout != null) __obj.updateDynamic("balloonItemContentLayout")(balloonItemContentLayout.asInstanceOf[js.Any])
    if (balloonPanelContentLayout != null) __obj.updateDynamic("balloonPanelContentLayout")(balloonPanelContentLayout.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(disableClickZoom)) __obj.updateDynamic("disableClickZoom")(disableClickZoom)
    if (!js.isUndefined(hideIconOnBalloonOpen)) __obj.updateDynamic("hideIconOnBalloonOpen")(hideIconOnBalloonOpen)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (iconContentLayout != null) __obj.updateDynamic("iconContentLayout")(iconContentLayout.asInstanceOf[js.Any])
    if (iconLayout != null) __obj.updateDynamic("iconLayout")(iconLayout.asInstanceOf[js.Any])
    if (iconShape != null) __obj.updateDynamic("iconShape")(iconShape)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (numbers != null) __obj.updateDynamic("numbers")(numbers)
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick)
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint)
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover)
    if (zIndexHover != null) __obj.updateDynamic("zIndexHover")(zIndexHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClusterPlacemarkOptions]
  }
}

