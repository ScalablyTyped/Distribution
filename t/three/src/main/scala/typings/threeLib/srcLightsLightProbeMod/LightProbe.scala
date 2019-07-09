package typings
package threeLib.srcLightsLightProbeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/LightProbe", "LightProbe")
@js.native
class LightProbe ()
  extends threeLib.srcLightsLightMod.Light {
  def this(sh: threeLib.srcMathSphericalHarmonics3Mod.SphericalHarmonics3) = this()
  def this(sh: threeLib.srcMathSphericalHarmonics3Mod.SphericalHarmonics3, intensity: scala.Double) = this()
  var isLightProbe: threeLib.threeLibNumbers.`true` = js.native
  var sh: threeLib.srcMathSphericalHarmonics3Mod.SphericalHarmonics3 = js.native
}

