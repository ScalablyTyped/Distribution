package typings.viewportMercatorProject

import typings.viewportMercatorProject.mod.CoordinatesZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitude extends js.Object {
  var altitude: Double
  var bearing: Double
  var center: js.UndefOr[CoordinatesZ] = js.undefined
  var flipY: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var pitch: Double
}

object AnonAltitude {
  @scala.inline
  def apply(
    altitude: Double,
    bearing: Double,
    height: Double,
    pitch: Double,
    center: CoordinatesZ = null,
    flipY: js.UndefOr[Boolean] = js.undefined
  ): AnonAltitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitude]
  }
}

