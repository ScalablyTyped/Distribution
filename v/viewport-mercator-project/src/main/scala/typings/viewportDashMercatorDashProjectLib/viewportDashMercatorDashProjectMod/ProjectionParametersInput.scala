package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionParametersInput extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var farZMultiplier: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var nearZMultiplier: js.UndefOr[scala.Double] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var width: scala.Double
}

object ProjectionParametersInput {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    altitude: scala.Int | scala.Double = null,
    farZMultiplier: scala.Int | scala.Double = null,
    nearZMultiplier: scala.Int | scala.Double = null,
    pitch: scala.Int | scala.Double = null
  ): ProjectionParametersInput = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (farZMultiplier != null) __obj.updateDynamic("farZMultiplier")(farZMultiplier.asInstanceOf[js.Any])
    if (nearZMultiplier != null) __obj.updateDynamic("nearZMultiplier")(nearZMultiplier.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParametersInput]
  }
}

