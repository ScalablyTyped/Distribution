package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SpotLight")
@js.native
class SpotLight protected ()
  extends typings.three.spotLightMod.SpotLight {
  def this(
    color: js.UndefOr[typings.three.colorMod.Color | Double | String],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    penumbra: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}

