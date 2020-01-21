package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionParametersInput extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var farZMultiplier: js.UndefOr[Double] = js.undefined
  var height: Double
  var nearZMultiplier: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var width: Double
}

object ProjectionParametersInput {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    altitude: Int | Double = null,
    farZMultiplier: Int | Double = null,
    nearZMultiplier: Int | Double = null,
    pitch: Int | Double = null
  ): ProjectionParametersInput = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (farZMultiplier != null) __obj.updateDynamic("farZMultiplier")(farZMultiplier.asInstanceOf[js.Any])
    if (nearZMultiplier != null) __obj.updateDynamic("nearZMultiplier")(nearZMultiplier.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParametersInput]
  }
}

