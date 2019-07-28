package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlacemarkOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  var hasHint: js.UndefOr[Boolean] = js.undefined
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  var iconOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var iconShape: js.UndefOr[IGeometryJson | Null] = js.undefined
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  var interactivityModel: js.UndefOr[String] = js.undefined
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var pointOverlay: js.UndefOr[String] = js.undefined
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zIndexActive: js.UndefOr[Double] = js.undefined
  var zIndexDrag: js.UndefOr[Double] = js.undefined
  var zIndexHover: js.UndefOr[Double] = js.undefined
}

object IPlacemarkOptions {
  @scala.inline
  def apply(
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hasBalloon: js.UndefOr[Boolean] = js.undefined,
    hasHint: js.UndefOr[Boolean] = js.undefined,
    hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined,
    iconOffset: js.Array[Double] = null,
    iconShape: IGeometryJson = null,
    interactiveZIndex: js.UndefOr[Boolean] = js.undefined,
    interactivityModel: String = null,
    openBalloonOnClick: js.UndefOr[Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[Boolean] = js.undefined,
    pane: String = null,
    pointOverlay: String = null,
    syncOverlayInit: js.UndefOr[Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zIndexActive: Int | Double = null,
    zIndexDrag: Int | Double = null,
    zIndexHover: Int | Double = null
  ): IPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon)
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint)
    if (!js.isUndefined(hideIconOnBalloonOpen)) __obj.updateDynamic("hideIconOnBalloonOpen")(hideIconOnBalloonOpen)
    if (iconOffset != null) __obj.updateDynamic("iconOffset")(iconOffset)
    if (iconShape != null) __obj.updateDynamic("iconShape")(iconShape)
    if (!js.isUndefined(interactiveZIndex)) __obj.updateDynamic("interactiveZIndex")(interactiveZIndex)
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel)
    if (!js.isUndefined(openBalloonOnClick)) __obj.updateDynamic("openBalloonOnClick")(openBalloonOnClick)
    if (!js.isUndefined(openEmptyBalloon)) __obj.updateDynamic("openEmptyBalloon")(openEmptyBalloon)
    if (!js.isUndefined(openEmptyHint)) __obj.updateDynamic("openEmptyHint")(openEmptyHint)
    if (!js.isUndefined(openHintOnHover)) __obj.updateDynamic("openHintOnHover")(openHintOnHover)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (pointOverlay != null) __obj.updateDynamic("pointOverlay")(pointOverlay)
    if (!js.isUndefined(syncOverlayInit)) __obj.updateDynamic("syncOverlayInit")(syncOverlayInit)
    if (!js.isUndefined(useMapMarginInDragging)) __obj.updateDynamic("useMapMarginInDragging")(useMapMarginInDragging)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zIndexActive != null) __obj.updateDynamic("zIndexActive")(zIndexActive.asInstanceOf[js.Any])
    if (zIndexDrag != null) __obj.updateDynamic("zIndexDrag")(zIndexDrag.asInstanceOf[js.Any])
    if (zIndexHover != null) __obj.updateDynamic("zIndexHover")(zIndexHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlacemarkOptions]
  }
}

