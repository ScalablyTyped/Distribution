package typings.three.srcLightsLightProbeMod

import typings.three.srcLightsLightMod.Light
import typings.three.srcMathSphericalHarmonics3Mod.SphericalHarmonics3
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/LightProbe", "LightProbe")
@js.native
class LightProbe () extends Light {
  def this(sh: SphericalHarmonics3) = this()
  def this(sh: SphericalHarmonics3, intensity: Double) = this()
  var isLightProbe: `true` = js.native
  var sh: SphericalHarmonics3 = js.native
}

