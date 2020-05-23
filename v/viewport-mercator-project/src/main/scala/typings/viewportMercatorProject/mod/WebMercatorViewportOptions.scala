package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMercatorViewportOptions extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var bearing: js.UndefOr[Double] = js.undefined
  var farZMultiplier: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var nearZMultiplier: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object WebMercatorViewportOptions {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Double] = js.undefined,
    bearing: js.UndefOr[Double] = js.undefined,
    farZMultiplier: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    nearZMultiplier: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): WebMercatorViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(farZMultiplier)) __obj.updateDynamic("farZMultiplier")(farZMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nearZMultiplier)) __obj.updateDynamic("nearZMultiplier")(nearZMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMercatorViewportOptions]
  }
}

