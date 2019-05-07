package typings
package yandexDashMapsLib.yandexDashMapsMod

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

object ICircleOptions {
  @scala.inline
  def apply(
    circleOverlay: java.lang.String | (js.Function3[
      /* geometry */ IPixelCircleGeometry, 
      /* data */ js.Object, 
      /* options */ js.Object, 
      js.Promise[IOverlay]
    ]) = null,
    cursor: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    fillImageHref: java.lang.String = null,
    fillMethod: yandexDashMapsLib.yandexDashMapsLibStrings.stretch | yandexDashMapsLib.yandexDashMapsLibStrings.tile = null,
    fillOpacity: scala.Int | scala.Double = null,
    hasBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    hasHint: js.UndefOr[scala.Boolean] = js.undefined,
    hideIconOnBalloonOpen: js.UndefOr[scala.Boolean] = js.undefined,
    interactiveZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    interactivityModel: InteractivityModelKey = null,
    opacity: scala.Int | scala.Double = null,
    openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    pane: java.lang.String = null,
    strokeColor: js.Array[js.Array[java.lang.String]] | js.Array[java.lang.String] | java.lang.String = null,
    strokeOpacity: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double = null,
    strokeStyle: js.Array[js.Array[js.Array[java.lang.String]]] | js.Array[js.Array[js.Object]] | js.Array[java.lang.String] | js.Array[js.Object] | java.lang.String | js.Object = null,
    strokeWidth: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double = null,
    syncOverlayInit: js.UndefOr[scala.Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null,
    zIndexActive: scala.Int | scala.Double = null,
    zIndexDrag: scala.Int | scala.Double = null,
    zIndexHover: scala.Int | scala.Double = null
  ): ICircleOptions = {
    val __obj = js.Dynamic.literal()
    if (circleOverlay != null) __obj.updateDynamic("circleOverlay")(circleOverlay.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillImageHref != null) __obj.updateDynamic("fillImageHref")(fillImageHref)
    if (fillMethod != null) __obj.updateDynamic("fillMethod")(fillMethod.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon)
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint)
    if (!js.isUndefined(hideIconOnBalloonOpen)) __obj.updateDynamic("hideIconOnBalloonOpen")(hideIconOnBalloonOpen)
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex)
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick)
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon)
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint)
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(syncOverlayInit)) __obj.updateDynamic("syncOverlayInit")(syncOverlayInit)
    if (!js.isUndefined(useMapMarginInDragging)) __obj.updateDynamic("useMapMarginInDragging")(useMapMarginInDragging)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zIndexActive != null) __obj.updateDynamic("zIndexActive")(zIndexActive.asInstanceOf[js.Any])
    if (zIndexDrag != null) __obj.updateDynamic("zIndexDrag")(zIndexDrag.asInstanceOf[js.Any])
    if (zIndexHover != null) __obj.updateDynamic("zIndexHover")(zIndexHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICircleOptions]
  }
}

