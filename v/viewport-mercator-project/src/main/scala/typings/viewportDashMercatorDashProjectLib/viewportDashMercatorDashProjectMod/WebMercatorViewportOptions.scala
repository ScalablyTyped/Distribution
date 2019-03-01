package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMercatorViewportOptions extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var bearing: js.UndefOr[scala.Double] = js.undefined
  var farZMultiplier: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object WebMercatorViewportOptions {
  @scala.inline
  def apply(
    altitude: scala.Int | scala.Double = null,
    bearing: scala.Int | scala.Double = null,
    farZMultiplier: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    pitch: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): WebMercatorViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (farZMultiplier != null) __obj.updateDynamic("farZMultiplier")(farZMultiplier.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMercatorViewportOptions]
  }
}

