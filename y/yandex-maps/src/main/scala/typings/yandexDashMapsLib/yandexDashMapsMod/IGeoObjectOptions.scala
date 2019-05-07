package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoObjectOptions extends ICircleOptions {
  var iconCaptionMaxWidth: js.UndefOr[scala.Double] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var iconContentLayout: js.UndefOr[java.lang.String | IClassConstructor[ILayout]] = js.undefined
  var iconContentOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconContentPadding: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconContentSize: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconImageClipRect: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var iconImageHref: js.UndefOr[java.lang.String] = js.undefined
  var iconImageOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconImageShape: js.UndefOr[IShape | scala.Null] = js.undefined
  var iconImageSize: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconLayout: js.UndefOr[java.lang.String | IClassConstructor[ILayout]] = js.undefined
  var iconMaxHeight: js.UndefOr[scala.Double] = js.undefined
  var iconMaxWidth: js.UndefOr[scala.Double] = js.undefined
  var iconOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconShadow: js.UndefOr[scala.Boolean] = js.undefined
  var iconShadowImageClipRect: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var iconShadowImageHref: js.UndefOr[java.lang.String] = js.undefined
  var iconShadowImageOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconShadowImageSize: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconShadowLayout: js.UndefOr[java.lang.String | IClassConstructor[ILayout]] = js.undefined
  var iconShadowOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineStringOverlay: js.UndefOr[OverlayKey] = js.undefined
  var pointOverlay: js.UndefOr[OverlayKey] = js.undefined
  var polygonOverlay: js.UndefOr[OverlayKey] = js.undefined
  var preset: js.UndefOr[java.lang.String] = js.undefined
  var rectangleOverlay: js.UndefOr[OverlayKey] = js.undefined
  var setMapCursorInDragging: js.UndefOr[scala.Boolean] = js.undefined
}

object IGeoObjectOptions {
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
    iconCaptionMaxWidth: scala.Int | scala.Double = null,
    iconColor: java.lang.String = null,
    iconContentLayout: java.lang.String | IClassConstructor[ILayout] = null,
    iconContentOffset: js.Array[scala.Double] = null,
    iconContentPadding: js.Array[scala.Double] = null,
    iconContentSize: js.Array[scala.Double] = null,
    iconImageClipRect: js.Array[js.Array[scala.Double]] = null,
    iconImageHref: java.lang.String = null,
    iconImageOffset: js.Array[scala.Double] = null,
    iconImageShape: IShape = null,
    iconImageSize: js.Array[scala.Double] = null,
    iconLayout: java.lang.String | IClassConstructor[ILayout] = null,
    iconMaxHeight: scala.Int | scala.Double = null,
    iconMaxWidth: scala.Int | scala.Double = null,
    iconOffset: js.Array[scala.Double] = null,
    iconShadow: js.UndefOr[scala.Boolean] = js.undefined,
    iconShadowImageClipRect: js.Array[js.Array[scala.Double]] = null,
    iconShadowImageHref: java.lang.String = null,
    iconShadowImageOffset: js.Array[scala.Double] = null,
    iconShadowImageSize: js.Array[scala.Double] = null,
    iconShadowLayout: java.lang.String | IClassConstructor[ILayout] = null,
    iconShadowOffset: js.Array[scala.Double] = null,
    interactiveZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    interactivityModel: InteractivityModelKey = null,
    lineStringOverlay: OverlayKey = null,
    opacity: scala.Int | scala.Double = null,
    openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    pane: java.lang.String = null,
    pointOverlay: OverlayKey = null,
    polygonOverlay: OverlayKey = null,
    preset: java.lang.String = null,
    rectangleOverlay: OverlayKey = null,
    setMapCursorInDragging: js.UndefOr[scala.Boolean] = js.undefined,
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
  ): IGeoObjectOptions = {
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
    if (iconCaptionMaxWidth != null) __obj.updateDynamic("iconCaptionMaxWidth")(iconCaptionMaxWidth.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (iconContentLayout != null) __obj.updateDynamic("iconContentLayout")(iconContentLayout.asInstanceOf[js.Any])
    if (iconContentOffset != null) __obj.updateDynamic("iconContentOffset")(iconContentOffset)
    if (iconContentPadding != null) __obj.updateDynamic("iconContentPadding")(iconContentPadding)
    if (iconContentSize != null) __obj.updateDynamic("iconContentSize")(iconContentSize)
    if (iconImageClipRect != null) __obj.updateDynamic("iconImageClipRect")(iconImageClipRect)
    if (iconImageHref != null) __obj.updateDynamic("iconImageHref")(iconImageHref)
    if (iconImageOffset != null) __obj.updateDynamic("iconImageOffset")(iconImageOffset)
    if (iconImageShape != null) __obj.updateDynamic("iconImageShape")(iconImageShape)
    if (iconImageSize != null) __obj.updateDynamic("iconImageSize")(iconImageSize)
    if (iconLayout != null) __obj.updateDynamic("iconLayout")(iconLayout.asInstanceOf[js.Any])
    if (iconMaxHeight != null) __obj.updateDynamic("iconMaxHeight")(iconMaxHeight.asInstanceOf[js.Any])
    if (iconMaxWidth != null) __obj.updateDynamic("iconMaxWidth")(iconMaxWidth.asInstanceOf[js.Any])
    if (iconOffset != null) __obj.updateDynamic("iconOffset")(iconOffset)
    if (!js.isUndefined(iconShadow)) __obj.updateDynamic("iconShadow")(iconShadow)
    if (iconShadowImageClipRect != null) __obj.updateDynamic("iconShadowImageClipRect")(iconShadowImageClipRect)
    if (iconShadowImageHref != null) __obj.updateDynamic("iconShadowImageHref")(iconShadowImageHref)
    if (iconShadowImageOffset != null) __obj.updateDynamic("iconShadowImageOffset")(iconShadowImageOffset)
    if (iconShadowImageSize != null) __obj.updateDynamic("iconShadowImageSize")(iconShadowImageSize)
    if (iconShadowLayout != null) __obj.updateDynamic("iconShadowLayout")(iconShadowLayout.asInstanceOf[js.Any])
    if (iconShadowOffset != null) __obj.updateDynamic("iconShadowOffset")(iconShadowOffset)
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex)
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (lineStringOverlay != null) __obj.updateDynamic("lineStringOverlay")(lineStringOverlay.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick)
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon)
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint)
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (pointOverlay != null) __obj.updateDynamic("pointOverlay")(pointOverlay.asInstanceOf[js.Any])
    if (polygonOverlay != null) __obj.updateDynamic("polygonOverlay")(polygonOverlay.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (rectangleOverlay != null) __obj.updateDynamic("rectangleOverlay")(rectangleOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(setMapCursorInDragging)) __obj.updateDynamic("setMapCursorInDragging")(setMapCursorInDragging)
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
    __obj.asInstanceOf[IGeoObjectOptions]
  }
}

