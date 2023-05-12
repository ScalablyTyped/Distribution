package typings.three.buildThreeDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "LightProbe")
@js.native
/**
  * Creates a new LightProbe.
  * @param sh An instance of {@link THREE.SphericalHarmonics3 | SphericalHarmonics3}. Default `new THREE.SphericalHarmonics3()``.
  * @param intensity Numeric value of the light probe's intensity. Expects a `Float`. Default `1`.
  */
open class LightProbe ()
  extends typings.three.srcThreeMod.LightProbe {
  def this(sh: typings.three.srcMathSphericalHarmonics3Mod.SphericalHarmonics3) = this()
  def this(sh: Unit, intensity: Double) = this()
  def this(sh: typings.three.srcMathSphericalHarmonics3Mod.SphericalHarmonics3, intensity: Double) = this()
}
