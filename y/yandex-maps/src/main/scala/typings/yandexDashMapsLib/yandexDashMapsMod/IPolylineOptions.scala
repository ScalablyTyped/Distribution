package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolylineOptions extends js.Object {
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var hasBalloon: js.UndefOr[scala.Boolean] = js.undefined
  var hasHint: js.UndefOr[scala.Boolean] = js.undefined
  var interactiveZIndex: js.UndefOr[scala.Boolean] = js.undefined
  var interactivityModel: js.UndefOr[java.lang.String] = js.undefined
  var lineStringOverlay: js.UndefOr[js.Function0[js.Object | java.lang.String]] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[scala.Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var strokeStyle: js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object | js.Array[js.Object]] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var syncOverlayInit: js.UndefOr[scala.Boolean] = js.undefined
  var useMapMarginInDragging: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zIndexActive: js.UndefOr[scala.Double] = js.undefined
  var zIndexDrag: js.UndefOr[scala.Double] = js.undefined
  var zIndexHover: js.UndefOr[scala.Double] = js.undefined
}

object IPolylineOptions {
  @scala.inline
  def apply(
    cursor: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hasBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    hasHint: js.UndefOr[scala.Boolean] = js.undefined,
    interactiveZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    interactivityModel: java.lang.String = null,
    lineStringOverlay: () => js.Object | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    pane: java.lang.String = null,
    strokeColor: java.lang.String | js.Array[java.lang.String] = null,
    strokeOpacity: scala.Double | js.Array[scala.Double] = null,
    strokeStyle: java.lang.String | js.Array[java.lang.String] | js.Object | js.Array[js.Object] = null,
    strokeWidth: scala.Double | js.Array[scala.Double] = null,
    syncOverlayInit: js.UndefOr[scala.Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null,
    zIndexActive: scala.Int | scala.Double = null,
    zIndexDrag: scala.Int | scala.Double = null,
    zIndexHover: scala.Int | scala.Double = null
  ): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon)
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint)
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex)
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel)
    if (lineStringOverlay != null) __obj.updateDynamic("lineStringOverlay")(js.Any.fromFunction0(lineStringOverlay))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick)
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon)
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint)
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover)
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
    __obj.asInstanceOf[IPolylineOptions]
  }
}

