package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.stretch
import typings.yandexMaps.yandexMapsStrings.tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoObjectOptions extends ICircleOptions {
  var iconCaptionMaxWidth: js.UndefOr[Double] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var iconContentOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var iconContentPadding: js.UndefOr[js.Array[Double]] = js.undefined
  var iconContentSize: js.UndefOr[js.Array[Double]] = js.undefined
  var iconImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var iconImageHref: js.UndefOr[String] = js.undefined
  var iconImageOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var iconImageShape: js.UndefOr[IShape | Null] = js.undefined
  var iconImageSize: js.UndefOr[js.Array[Double]] = js.undefined
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var iconMaxHeight: js.UndefOr[Double] = js.undefined
  var iconMaxWidth: js.UndefOr[Double] = js.undefined
  var iconOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var iconShadow: js.UndefOr[Boolean] = js.undefined
  var iconShadowImageClipRect: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var iconShadowImageHref: js.UndefOr[String] = js.undefined
  var iconShadowImageOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var iconShadowImageSize: js.UndefOr[js.Array[Double]] = js.undefined
  var iconShadowLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var iconShadowOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var lineStringOverlay: js.UndefOr[OverlayKey] = js.undefined
  var pointOverlay: js.UndefOr[OverlayKey] = js.undefined
  var polygonOverlay: js.UndefOr[OverlayKey] = js.undefined
  var preset: js.UndefOr[String] = js.undefined
  var rectangleOverlay: js.UndefOr[OverlayKey] = js.undefined
  var setMapCursorInDragging: js.UndefOr[Boolean] = js.undefined
}

object IGeoObjectOptions {
  @scala.inline
  def apply(
    circleOverlay: String | (js.Function3[
      /* geometry */ IPixelCircleGeometry, 
      /* data */ js.Object, 
      /* options */ js.Object, 
      js.Promise[IOverlay]
    ]) = null,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillImageHref: String = null,
    fillMethod: stretch | tile = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    hasBalloon: js.UndefOr[Boolean] = js.undefined,
    hasHint: js.UndefOr[Boolean] = js.undefined,
    hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined,
    iconCaptionMaxWidth: js.UndefOr[Double] = js.undefined,
    iconColor: String = null,
    iconContentLayout: String | IClassConstructor[ILayout] = null,
    iconContentOffset: js.Array[Double] = null,
    iconContentPadding: js.Array[Double] = null,
    iconContentSize: js.Array[Double] = null,
    iconImageClipRect: js.Array[js.Array[Double]] = null,
    iconImageHref: String = null,
    iconImageOffset: js.Array[Double] = null,
    iconImageShape: js.UndefOr[Null | IShape] = js.undefined,
    iconImageSize: js.Array[Double] = null,
    iconLayout: String | IClassConstructor[ILayout] = null,
    iconMaxHeight: js.UndefOr[Double] = js.undefined,
    iconMaxWidth: js.UndefOr[Double] = js.undefined,
    iconOffset: js.Array[Double] = null,
    iconShadow: js.UndefOr[Boolean] = js.undefined,
    iconShadowImageClipRect: js.Array[js.Array[Double]] = null,
    iconShadowImageHref: String = null,
    iconShadowImageOffset: js.Array[Double] = null,
    iconShadowImageSize: js.Array[Double] = null,
    iconShadowLayout: String | IClassConstructor[ILayout] = null,
    iconShadowOffset: js.Array[Double] = null,
    interactiveZIndex: js.UndefOr[Boolean] = js.undefined,
    interactivityModel: InteractivityModelKey = null,
    lineStringOverlay: OverlayKey = null,
    opacity: js.UndefOr[Double] = js.undefined,
    openBalloonOnClick: js.UndefOr[Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[Boolean] = js.undefined,
    outline: js.UndefOr[Boolean] = js.undefined,
    pane: String = null,
    pointOverlay: OverlayKey = null,
    polygonOverlay: OverlayKey = null,
    preset: String = null,
    rectangleOverlay: OverlayKey = null,
    setMapCursorInDragging: js.UndefOr[Boolean] = js.undefined,
    strokeColor: (js.Array[js.Array[String] | String]) | String = null,
    strokeOpacity: (js.Array[js.Array[Double] | Double]) | Double = null,
    strokeStyle: (js.Array[(js.Array[js.Array[String] | js.Object]) | js.Object | String]) | String | js.Object = null,
    strokeWidth: (js.Array[js.Array[Double] | Double]) | Double = null,
    syncOverlayInit: js.UndefOr[Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zIndexActive: js.UndefOr[Double] = js.undefined,
    zIndexDrag: js.UndefOr[Double] = js.undefined,
    zIndexHover: js.UndefOr[Double] = js.undefined
  ): IGeoObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (circleOverlay != null) __obj.updateDynamic("circleOverlay")(circleOverlay.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillImageHref != null) __obj.updateDynamic("fillImageHref")(fillImageHref.asInstanceOf[js.Any])
    if (fillMethod != null) __obj.updateDynamic("fillMethod")(fillMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIconOnBalloonOpen)) __obj.updateDynamic("hideIconOnBalloonOpen")(hideIconOnBalloonOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconCaptionMaxWidth)) __obj.updateDynamic("iconCaptionMaxWidth")(iconCaptionMaxWidth.get.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconContentLayout != null) __obj.updateDynamic("iconContentLayout")(iconContentLayout.asInstanceOf[js.Any])
    if (iconContentOffset != null) __obj.updateDynamic("iconContentOffset")(iconContentOffset.asInstanceOf[js.Any])
    if (iconContentPadding != null) __obj.updateDynamic("iconContentPadding")(iconContentPadding.asInstanceOf[js.Any])
    if (iconContentSize != null) __obj.updateDynamic("iconContentSize")(iconContentSize.asInstanceOf[js.Any])
    if (iconImageClipRect != null) __obj.updateDynamic("iconImageClipRect")(iconImageClipRect.asInstanceOf[js.Any])
    if (iconImageHref != null) __obj.updateDynamic("iconImageHref")(iconImageHref.asInstanceOf[js.Any])
    if (iconImageOffset != null) __obj.updateDynamic("iconImageOffset")(iconImageOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(iconImageShape)) __obj.updateDynamic("iconImageShape")(iconImageShape.asInstanceOf[js.Any])
    if (iconImageSize != null) __obj.updateDynamic("iconImageSize")(iconImageSize.asInstanceOf[js.Any])
    if (iconLayout != null) __obj.updateDynamic("iconLayout")(iconLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(iconMaxHeight)) __obj.updateDynamic("iconMaxHeight")(iconMaxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconMaxWidth)) __obj.updateDynamic("iconMaxWidth")(iconMaxWidth.get.asInstanceOf[js.Any])
    if (iconOffset != null) __obj.updateDynamic("iconOffset")(iconOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(iconShadow)) __obj.updateDynamic("iconShadow")(iconShadow.get.asInstanceOf[js.Any])
    if (iconShadowImageClipRect != null) __obj.updateDynamic("iconShadowImageClipRect")(iconShadowImageClipRect.asInstanceOf[js.Any])
    if (iconShadowImageHref != null) __obj.updateDynamic("iconShadowImageHref")(iconShadowImageHref.asInstanceOf[js.Any])
    if (iconShadowImageOffset != null) __obj.updateDynamic("iconShadowImageOffset")(iconShadowImageOffset.asInstanceOf[js.Any])
    if (iconShadowImageSize != null) __obj.updateDynamic("iconShadowImageSize")(iconShadowImageSize.asInstanceOf[js.Any])
    if (iconShadowLayout != null) __obj.updateDynamic("iconShadowLayout")(iconShadowLayout.asInstanceOf[js.Any])
    if (iconShadowOffset != null) __obj.updateDynamic("iconShadowOffset")(iconShadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex.get.asInstanceOf[js.Any])
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (lineStringOverlay != null) __obj.updateDynamic("lineStringOverlay")(lineStringOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (pointOverlay != null) __obj.updateDynamic("pointOverlay")(pointOverlay.asInstanceOf[js.Any])
    if (polygonOverlay != null) __obj.updateDynamic("polygonOverlay")(polygonOverlay.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (rectangleOverlay != null) __obj.updateDynamic("rectangleOverlay")(rectangleOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(setMapCursorInDragging)) __obj.updateDynamic("setMapCursorInDragging")(setMapCursorInDragging.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(syncOverlayInit)) __obj.updateDynamic("syncOverlayInit")(syncOverlayInit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMarginInDragging)) __obj.updateDynamic("useMapMarginInDragging")(useMapMarginInDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexActive)) __obj.updateDynamic("zIndexActive")(zIndexActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexDrag)) __obj.updateDynamic("zIndexDrag")(zIndexDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexHover)) __obj.updateDynamic("zIndexHover")(zIndexHover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoObjectOptions]
  }
}

