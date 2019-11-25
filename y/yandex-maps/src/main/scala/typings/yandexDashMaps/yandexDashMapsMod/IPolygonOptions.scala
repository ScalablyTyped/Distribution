package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsStrings.stretch
import typings.yandexDashMaps.yandexDashMapsStrings.tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolygonOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillImageHref: js.UndefOr[String] = js.undefined
  var fillMethod: js.UndefOr[stretch | tile] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  var hasHint: js.UndefOr[Boolean] = js.undefined
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  var interactivityModel: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var polygonOverlay: js.UndefOr[String] = js.undefined
  var strokeColor: js.UndefOr[String | js.Array[String]] = js.undefined
  var strokeOpacity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var strokeStyle: js.UndefOr[String | (js.Array[js.Object | String]) | js.Object] = js.undefined
  var strokeWidth: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zIndexActive: js.UndefOr[Double] = js.undefined
  var zIndexDrag: js.UndefOr[Double] = js.undefined
  var zIndexHover: js.UndefOr[Double] = js.undefined
}

object IPolygonOptions {
  @scala.inline
  def apply(
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillImageHref: String = null,
    fillMethod: stretch | tile = null,
    fillOpacity: Int | Double = null,
    hasBalloon: js.UndefOr[Boolean] = js.undefined,
    hasHint: js.UndefOr[Boolean] = js.undefined,
    interactiveZIndex: js.UndefOr[Boolean] = js.undefined,
    interactivityModel: String = null,
    opacity: Int | Double = null,
    openBalloonOnClick: js.UndefOr[Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[Boolean] = js.undefined,
    outline: js.UndefOr[Boolean] = js.undefined,
    pane: String = null,
    polygonOverlay: String = null,
    strokeColor: String | js.Array[String] = null,
    strokeOpacity: Double | js.Array[Double] = null,
    strokeStyle: String | (js.Array[js.Object | String]) | js.Object = null,
    strokeWidth: Double | js.Array[Double] = null,
    syncOverlayInit: js.UndefOr[Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zIndexActive: Int | Double = null,
    zIndexDrag: Int | Double = null,
    zIndexHover: Int | Double = null
  ): IPolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillImageHref != null) __obj.updateDynamic("fillImageHref")(fillImageHref.asInstanceOf[js.Any])
    if (fillMethod != null) __obj.updateDynamic("fillMethod")(fillMethod.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint.asInstanceOf[js.Any])
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex.asInstanceOf[js.Any])
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint.asInstanceOf[js.Any])
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (polygonOverlay != null) __obj.updateDynamic("polygonOverlay")(polygonOverlay.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(syncOverlayInit)) __obj.updateDynamic("syncOverlayInit")(syncOverlayInit.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMarginInDragging)) __obj.updateDynamic("useMapMarginInDragging")(useMapMarginInDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zIndexActive != null) __obj.updateDynamic("zIndexActive")(zIndexActive.asInstanceOf[js.Any])
    if (zIndexDrag != null) __obj.updateDynamic("zIndexDrag")(zIndexDrag.asInstanceOf[js.Any])
    if (zIndexHover != null) __obj.updateDynamic("zIndexHover")(zIndexHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolygonOptions]
  }
}

