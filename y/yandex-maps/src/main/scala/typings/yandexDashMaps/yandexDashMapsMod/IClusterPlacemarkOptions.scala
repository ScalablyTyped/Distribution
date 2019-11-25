package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_Href
import typings.yandexDashMaps.yandexDashMapsStrings.`cluster#balloonAccordion`
import typings.yandexDashMaps.yandexDashMapsStrings.`cluster#balloonCarousel`
import typings.yandexDashMaps.yandexDashMapsStrings.`cluster#balloonTwoColumns`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClusterPlacemarkOptions extends js.Object {
  var balloonContentLayout: js.UndefOr[
    `cluster#balloonTwoColumns` | `cluster#balloonCarousel` | `cluster#balloonAccordion` | String | IClassConstructor[ILayout]
  ] = js.undefined
  var balloonContentLayoutHeight: js.UndefOr[Double] = js.undefined
  var balloonContentLayoutWidth: js.UndefOr[Double] = js.undefined
  var balloonItemContentLayout: js.UndefOr[ILayout | String] = js.undefined
  var balloonPanelContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var disableClickZoom: js.UndefOr[Boolean] = js.undefined
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var iconShape: js.UndefOr[IGeometryJson] = js.undefined
  var icons: js.UndefOr[js.Array[Anon_Href]] = js.undefined
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  var numbers: js.UndefOr[js.Array[Double]] = js.undefined
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  var zIndexHover: js.UndefOr[Double] = js.undefined
}

object IClusterPlacemarkOptions {
  @scala.inline
  def apply(
    balloonContentLayout: `cluster#balloonTwoColumns` | `cluster#balloonCarousel` | `cluster#balloonAccordion` | String | IClassConstructor[ILayout] = null,
    balloonContentLayoutHeight: Int | Double = null,
    balloonContentLayoutWidth: Int | Double = null,
    balloonItemContentLayout: ILayout | String = null,
    balloonPanelContentLayout: String | IClassConstructor[ILayout] = null,
    cursor: String = null,
    disableClickZoom: js.UndefOr[Boolean] = js.undefined,
    hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined,
    iconColor: String = null,
    iconContentLayout: String | IClassConstructor[ILayout] = null,
    iconLayout: String | IClassConstructor[ILayout] = null,
    iconShape: IGeometryJson = null,
    icons: js.Array[Anon_Href] = null,
    interactivityModel: InteractivityModelKey = null,
    numbers: js.Array[Double] = null,
    openBalloonOnClick: js.UndefOr[Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[Boolean] = js.undefined,
    zIndexHover: Int | Double = null
  ): IClusterPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    if (balloonContentLayout != null) __obj.updateDynamic("balloonContentLayout")(balloonContentLayout.asInstanceOf[js.Any])
    if (balloonContentLayoutHeight != null) __obj.updateDynamic("balloonContentLayoutHeight")(balloonContentLayoutHeight.asInstanceOf[js.Any])
    if (balloonContentLayoutWidth != null) __obj.updateDynamic("balloonContentLayoutWidth")(balloonContentLayoutWidth.asInstanceOf[js.Any])
    if (balloonItemContentLayout != null) __obj.updateDynamic("balloonItemContentLayout")(balloonItemContentLayout.asInstanceOf[js.Any])
    if (balloonPanelContentLayout != null) __obj.updateDynamic("balloonPanelContentLayout")(balloonPanelContentLayout.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClickZoom)) __obj.updateDynamic("disableClickZoom")(disableClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIconOnBalloonOpen)) __obj.updateDynamic("hideIconOnBalloonOpen")(hideIconOnBalloonOpen.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconContentLayout != null) __obj.updateDynamic("iconContentLayout")(iconContentLayout.asInstanceOf[js.Any])
    if (iconLayout != null) __obj.updateDynamic("iconLayout")(iconLayout.asInstanceOf[js.Any])
    if (iconShape != null) __obj.updateDynamic("iconShape")(iconShape.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (numbers != null) __obj.updateDynamic("numbers")(numbers.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint.asInstanceOf[js.Any])
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover.asInstanceOf[js.Any])
    if (zIndexHover != null) __obj.updateDynamic("zIndexHover")(zIndexHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClusterPlacemarkOptions]
  }
}

