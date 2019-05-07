package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapOptions extends js.Object {
  var autoFitToViewport: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.ifNull | yandexDashMapsLib.yandexDashMapsLibStrings.always
  ] = js.undefined
  var avoidFractionalZoom: js.UndefOr[scala.Boolean] = js.undefined
  var exitFullscreenByEsc: js.UndefOr[scala.Boolean] = js.undefined
  var fullscreenZIndex: js.UndefOr[scala.Double] = js.undefined
  var mapAutoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var maxAnimationZoomDifference: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var nativeFullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var restrictMapArea: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMapOpenBlock: js.UndefOr[scala.Boolean] = js.undefined
  var suppressObsoleteBrowserNotifier: js.UndefOr[scala.Boolean] = js.undefined
  var yandexMapAutoSwitch: js.UndefOr[scala.Boolean] = js.undefined
  var yandexMapDisablePoiInteractivity: js.UndefOr[scala.Boolean] = js.undefined
}

object IMapOptions {
  @scala.inline
  def apply(
    autoFitToViewport: yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.ifNull | yandexDashMapsLib.yandexDashMapsLibStrings.always = null,
    avoidFractionalZoom: js.UndefOr[scala.Boolean] = js.undefined,
    exitFullscreenByEsc: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenZIndex: scala.Int | scala.Double = null,
    mapAutoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    maxAnimationZoomDifference: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    nativeFullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    projection: IProjection = null,
    restrictMapArea: js.UndefOr[scala.Boolean] = js.undefined,
    suppressMapOpenBlock: js.UndefOr[scala.Boolean] = js.undefined,
    suppressObsoleteBrowserNotifier: js.UndefOr[scala.Boolean] = js.undefined,
    yandexMapAutoSwitch: js.UndefOr[scala.Boolean] = js.undefined,
    yandexMapDisablePoiInteractivity: js.UndefOr[scala.Boolean] = js.undefined
  ): IMapOptions = {
    val __obj = js.Dynamic.literal()
    if (autoFitToViewport != null) __obj.updateDynamic("autoFitToViewport")(autoFitToViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidFractionalZoom)) __obj.updateDynamic("avoidFractionalZoom")(avoidFractionalZoom)
    if (!js.isUndefined(exitFullscreenByEsc)) __obj.updateDynamic("exitFullscreenByEsc")(exitFullscreenByEsc)
    if (fullscreenZIndex != null) __obj.updateDynamic("fullscreenZIndex")(fullscreenZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(mapAutoFocus)) __obj.updateDynamic("mapAutoFocus")(mapAutoFocus)
    if (maxAnimationZoomDifference != null) __obj.updateDynamic("maxAnimationZoomDifference")(maxAnimationZoomDifference.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeFullscreen)) __obj.updateDynamic("nativeFullscreen")(nativeFullscreen)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(restrictMapArea)) __obj.updateDynamic("restrictMapArea")(restrictMapArea)
    if (!js.isUndefined(suppressMapOpenBlock)) __obj.updateDynamic("suppressMapOpenBlock")(suppressMapOpenBlock)
    if (!js.isUndefined(suppressObsoleteBrowserNotifier)) __obj.updateDynamic("suppressObsoleteBrowserNotifier")(suppressObsoleteBrowserNotifier)
    if (!js.isUndefined(yandexMapAutoSwitch)) __obj.updateDynamic("yandexMapAutoSwitch")(yandexMapAutoSwitch)
    if (!js.isUndefined(yandexMapDisablePoiInteractivity)) __obj.updateDynamic("yandexMapDisablePoiInteractivity")(yandexMapDisablePoiInteractivity)
    __obj.asInstanceOf[IMapOptions]
  }
}

