package typings
package viewportDashMercatorDashProjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: scala.Double
  var bearing: scala.Double
  var center: js.UndefOr[
    viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ
  ] = js.undefined
  var flipY: js.UndefOr[scala.Boolean] = js.undefined
  var height: scala.Double
  var pitch: scala.Double
}

object Anon_Altitude {
  @scala.inline
  def apply(
    altitude: scala.Double,
    bearing: scala.Double,
    height: scala.Double,
    pitch: scala.Double,
    center: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.CoordinatesZ = null,
    flipY: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Altitude = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altitude")(altitude)
    __obj.updateDynamic("bearing")(bearing)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("pitch")(pitch)
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    __obj.asInstanceOf[Anon_Altitude]
  }
}

