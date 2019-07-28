package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SpotLight")
@js.native
class SpotLight protected ()
  extends typings.three.srcLightsSpotLightMod.SpotLight {
  def this(
    color: js.UndefOr[typings.three.srcMathColorMod.Color | Double | String],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    exponent: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}

