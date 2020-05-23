package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportProps extends FlyToViewportProps {
  var bearing: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
}

object ViewportProps {
  @scala.inline
  def apply(
    height: Double,
    latitude: Double,
    longitude: Double,
    width: Double,
    zoom: Double,
    bearing: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProps]
  }
}

