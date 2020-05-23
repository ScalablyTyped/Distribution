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
    altitude: js.UndefOr[Double] = js.undefined,
    farZMultiplier: js.UndefOr[Double] = js.undefined,
    nearZMultiplier: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined
  ): ProjectionParametersInput = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(farZMultiplier)) __obj.updateDynamic("farZMultiplier")(farZMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nearZMultiplier)) __obj.updateDynamic("nearZMultiplier")(nearZMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParametersInput]
  }
}

