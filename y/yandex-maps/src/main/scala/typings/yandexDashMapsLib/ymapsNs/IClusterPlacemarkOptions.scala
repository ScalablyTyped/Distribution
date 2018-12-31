package typings
package yandexDashMapsLib.ymapsNs

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

