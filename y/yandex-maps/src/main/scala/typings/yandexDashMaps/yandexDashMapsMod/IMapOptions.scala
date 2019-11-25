package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsStrings.always
import typings.yandexDashMaps.yandexDashMapsStrings.ifNull
import typings.yandexDashMaps.yandexDashMapsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapOptions extends js.Object {
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.undefined
  var avoidFractionalZoom: js.UndefOr[Boolean] = js.undefined
  var exitFullscreenByEsc: js.UndefOr[Boolean] = js.undefined
  var fullscreenZIndex: js.UndefOr[Double] = js.undefined
  var mapAutoFocus: js.UndefOr[Boolean] = js.undefined
  var maxAnimationZoomDifference: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var nativeFullscreen: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var restrictMapArea: js.UndefOr[Boolean] = js.undefined
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined
  var suppressObsoleteBrowserNotifier: js.UndefOr[Boolean] = js.undefined
  var yandexMapAutoSwitch: js.UndefOr[Boolean] = js.undefined
  var yandexMapDisablePoiInteractivity: js.UndefOr[Boolean] = js.undefined
}

object IMapOptions {
  @scala.inline
  def apply(
    autoFitToViewport: none | ifNull | always = null,
    avoidFractionalZoom: js.UndefOr[Boolean] = js.undefined,
    exitFullscreenByEsc: js.UndefOr[Boolean] = js.undefined,
    fullscreenZIndex: Int | Double = null,
    mapAutoFocus: js.UndefOr[Boolean] = js.undefined,
    maxAnimationZoomDifference: Int | Double = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    nativeFullscreen: js.UndefOr[Boolean] = js.undefined,
    projection: IProjection = null,
    restrictMapArea: js.UndefOr[Boolean] = js.undefined,
    suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined,
    suppressObsoleteBrowserNotifier: js.UndefOr[Boolean] = js.undefined,
    yandexMapAutoSwitch: js.UndefOr[Boolean] = js.undefined,
    yandexMapDisablePoiInteractivity: js.UndefOr[Boolean] = js.undefined
  ): IMapOptions = {
    val __obj = js.Dynamic.literal()
    if (autoFitToViewport != null) __obj.updateDynamic("autoFitToViewport")(autoFitToViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidFractionalZoom)) __obj.updateDynamic("avoidFractionalZoom")(avoidFractionalZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(exitFullscreenByEsc)) __obj.updateDynamic("exitFullscreenByEsc")(exitFullscreenByEsc.asInstanceOf[js.Any])
    if (fullscreenZIndex != null) __obj.updateDynamic("fullscreenZIndex")(fullscreenZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(mapAutoFocus)) __obj.updateDynamic("mapAutoFocus")(mapAutoFocus.asInstanceOf[js.Any])
    if (maxAnimationZoomDifference != null) __obj.updateDynamic("maxAnimationZoomDifference")(maxAnimationZoomDifference.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeFullscreen)) __obj.updateDynamic("nativeFullscreen")(nativeFullscreen.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictMapArea)) __obj.updateDynamic("restrictMapArea")(restrictMapArea.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMapOpenBlock)) __obj.updateDynamic("suppressMapOpenBlock")(suppressMapOpenBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressObsoleteBrowserNotifier)) __obj.updateDynamic("suppressObsoleteBrowserNotifier")(suppressObsoleteBrowserNotifier.asInstanceOf[js.Any])
    if (!js.isUndefined(yandexMapAutoSwitch)) __obj.updateDynamic("yandexMapAutoSwitch")(yandexMapAutoSwitch.asInstanceOf[js.Any])
    if (!js.isUndefined(yandexMapDisablePoiInteractivity)) __obj.updateDynamic("yandexMapDisablePoiInteractivity")(yandexMapDisablePoiInteractivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapOptions]
  }
}

