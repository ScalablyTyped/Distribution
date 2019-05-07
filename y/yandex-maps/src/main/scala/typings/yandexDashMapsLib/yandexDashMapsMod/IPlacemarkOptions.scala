package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlacemarkOptions extends js.Object {
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var hasBalloon: js.UndefOr[scala.Boolean] = js.undefined
  var hasHint: js.UndefOr[scala.Boolean] = js.undefined
  var hideIconOnBalloonOpen: js.UndefOr[scala.Boolean] = js.undefined
  var iconOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var iconShape: js.UndefOr[IGeometryJson | scala.Null] = js.undefined
  var interactiveZIndex: js.UndefOr[scala.Boolean] = js.undefined
  var interactivityModel: js.UndefOr[java.lang.String] = js.undefined
  var openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var openEmptyBalloon: js.UndefOr[scala.Boolean] = js.undefined
  var openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined
  var openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var pointOverlay: js.UndefOr[java.lang.String] = js.undefined
  var syncOverlayInit: js.UndefOr[scala.Boolean] = js.undefined
  var useMapMarginInDragging: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zIndexActive: js.UndefOr[scala.Double] = js.undefined
  var zIndexDrag: js.UndefOr[scala.Double] = js.undefined
  var zIndexHover: js.UndefOr[scala.Double] = js.undefined
}

object IPlacemarkOptions {
  @scala.inline
  def apply(
    cursor: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hasBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    hasHint: js.UndefOr[scala.Boolean] = js.undefined,
    hideIconOnBalloonOpen: js.UndefOr[scala.Boolean] = js.undefined,
    iconOffset: js.Array[scala.Double] = null,
    iconShape: IGeometryJson = null,
    interactiveZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    interactivityModel: java.lang.String = null,
    openBalloonOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    openEmptyHint: js.UndefOr[scala.Boolean] = js.undefined,
    openHintOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    pane: java.lang.String = null,
    pointOverlay: java.lang.String = null,
    syncOverlayInit: js.UndefOr[scala.Boolean] = js.undefined,
    useMapMarginInDragging: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null,
    zIndexActive: scala.Int | scala.Double = null,
    zIndexDrag: scala.Int | scala.Double = null,
    zIndexHover: scala.Int | scala.Double = null
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

