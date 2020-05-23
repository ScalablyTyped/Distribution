package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolylineOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  var hasHint: js.UndefOr[Boolean] = js.undefined
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  var interactivityModel: js.UndefOr[String] = js.undefined
  var lineStringOverlay: js.UndefOr[js.Function0[js.Object | String]] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
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

object IPolylineOptions {
  @scala.inline
  def apply(
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hasBalloon: js.UndefOr[Boolean] = js.undefined,
    hasHint: js.UndefOr[Boolean] = js.undefined,
    interactiveZIndex: js.UndefOr[Boolean] = js.undefined,
    interactivityModel: String = null,
    lineStringOverlay: () => js.Object | String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    openBalloonOnClick: js.UndefOr[Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[Boolean] = js.undefined,
    pane: String = null,
    strokeColor: String | js.Array[String] = null,
    strokeOpacity: Double | js.Array[Double] = null,
    strokeStyle: String | (js.Array[js.Object | String]) | js.Object = null,
    strokeWidth: Double | js.Array[Double] = null,
    syncOverlayInit: js.UndefOr[Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zIndexActive: js.UndefOr[Double] = js.undefined,
    zIndexDrag: js.UndefOr[Double] = js.undefined,
    zIndexHover: js.UndefOr[Double] = js.undefined
  ): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex.get.asInstanceOf[js.Any])
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (lineStringOverlay != null) __obj.updateDynamic("lineStringOverlay")(js.Any.fromFunction0(lineStringOverlay))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[IPolylineOptions]
  }
}

