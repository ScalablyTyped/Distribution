package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICircleOptions extends js.Object {
  var circleOverlay: js.UndefOr[
    java.lang.String | (js.Function3[
      /* geometry */ IPixelCircleGeometry, 
      /* data */ js.Object, 
      /* options */ js.Object, 
      js.Promise[IOverlay]
    ])
  ] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillImageHref: js.UndefOr[java.lang.String] = js.undefined
  var fillMethod: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.stretch | yandexDashMapsLib.yandexDashMapsLibStrings.tile
  ] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  var hasBalloon: js.UndefOr[scala.Boolean] = js.undefined
  var hasHint: js.UndefOr[scala.Boolean] = js.undefined
  var hideIconOnBalloonOpen: js.UndefOr[scala.Boolean] = js.undefined
  var interactiveZIndex: js.UndefOr[scala.Boolean] = js.undefined
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[scala.Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var strokeColor: js.UndefOr[
    js.Array[js.Array[java.lang.String]] | js.Array[java.lang.String] | java.lang.String
  ] = js.undefined
  var strokeOpacity: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[
    js.Array[js.Array[js.Array[java.lang.String]]] | js.Array[js.Array[js.Object]] | js.Array[java.lang.String] | js.Array[js.Object] | java.lang.String | js.Object
  ] = js.undefined
  var strokeWidth: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double] = js.undefined
  var syncOverlayInit: js.UndefOr[scala.Boolean] = js.undefined
  var useMapMarginInDragging: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zIndexActive: js.UndefOr[scala.Double] = js.undefined
  var zIndexDrag: js.UndefOr[scala.Double] = js.undefined
  var zIndexHover: js.UndefOr[scala.Double] = js.undefined
}

