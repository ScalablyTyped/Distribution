package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.CoordinatesZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Altitude extends js.Object {
  var altitude: Double
  var bearing: Double
  var center: js.UndefOr[CoordinatesZ] = js.undefined
  var flipY: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var pitch: Double
}

object Altitude {
  @scala.inline
  def apply(
    altitude: Double,
    bearing: Double,
    height: Double,
    pitch: Double,
    center: CoordinatesZ = null,
    flipY: js.UndefOr[Boolean] = js.undefined
  ): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
}

