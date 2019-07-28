package typings.viewportDashMercatorDashProject

import typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.CoordinatesZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: Double
  var bearing: Double
  var center: js.UndefOr[CoordinatesZ] = js.undefined
  var flipY: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var pitch: Double
}

object Anon_Altitude {
  @scala.inline
  def apply(
    altitude: Double,
    bearing: Double,
    height: Double,
    pitch: Double,
    center: CoordinatesZ = null,
    flipY: js.UndefOr[Boolean] = js.undefined
  ): Anon_Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude, bearing = bearing, height = height, pitch = pitch)
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    __obj.asInstanceOf[Anon_Altitude]
  }
}

