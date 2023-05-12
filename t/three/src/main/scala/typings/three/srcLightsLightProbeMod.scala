package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcLightsLightMod.Light
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.srcMathSphericalHarmonics3Mod.SphericalHarmonics3
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsLightProbeMod {
  
  @JSImport("three/src/lights/LightProbe", "LightProbe")
  @js.native
  /**
    * Creates a new LightProbe.
    * @param sh An instance of {@link THREE.SphericalHarmonics3 | SphericalHarmonics3}. Default `new THREE.SphericalHarmonics3()``.
    * @param intensity Numeric value of the light probe's intensity. Expects a `Float`. Default `1`.
    */
  open class LightProbe ()
    extends Light[js.UndefOr[LightShadow[Camera]]] {
    def this(sh: SphericalHarmonics3) = this()
    def this(sh: Unit, intensity: Double) = this()
    def this(sh: SphericalHarmonics3, intensity: Double) = this()
    
    /** @internal */
    def fromJSON(json: js.Object): LightProbe = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link DirectionalLight}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLightProbe: `true` = js.native
    
    /**
      * A light probe uses spherical harmonics to encode lighting information.
      * @defaultValue `new THREE.SphericalHarmonics3()`
      */
    var sh: SphericalHarmonics3 = js.native
  }
}
