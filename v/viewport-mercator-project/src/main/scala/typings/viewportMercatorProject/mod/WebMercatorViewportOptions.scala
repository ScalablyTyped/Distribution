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
    altitude: Int | Double = null,
    bearing: Int | Double = null,
    farZMultiplier: Int | Double = null,
    height: Int | Double = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    nearZMultiplier: Int | Double = null,
    pitch: Int | Double = null,
    width: Int | Double = null,
    zoom: Int | Double = null
  ): WebMercatorViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (farZMultiplier != null) __obj.updateDynamic("farZMultiplier")(farZMultiplier.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (nearZMultiplier != null) __obj.updateDynamic("nearZMultiplier")(nearZMultiplier.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMercatorViewportOptions]
  }
}

