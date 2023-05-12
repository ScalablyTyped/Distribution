package typings.three

import typings.three.srcLightsLightMod.Light
import typings.three.srcLightsPointLightShadowMod.PointLightShadow
import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsPointLightMod {
  
  @JSImport("three/src/lights/PointLight", "PointLight")
  @js.native
  /**
    * Creates a new PointLight.
    * @param color Hexadecimal color of the light. Default is 0xffffff (white). Expects a `Integer`
    * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`
    * @param distance Maximum range of the light. Default is 0 (no limit).
    * @param decay The amount the light dims along the distance of the light. Expects a `Float`. Default `2`
    */
  open class PointLight () extends Light[PointLightShadow] {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    def this(color: Unit, intensity: Double, distance: Double) = this()
    def this(color: Unit, intensity: Unit, distance: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, distance: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, distance: Double) = this()
    def this(color: Unit, intensity: Double, distance: Double, decay: Double) = this()
    def this(color: Unit, intensity: Double, distance: Unit, decay: Double) = this()
    def this(color: Unit, intensity: Unit, distance: Double, decay: Double) = this()
    def this(color: Unit, intensity: Unit, distance: Unit, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, distance: Double, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, distance: Unit, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, distance: Double, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, distance: Unit, decay: Double) = this()
    
    /**
      * The amount the light dims along the distance of the light.
      * In **{@link WebGLRenderer.physicallyCorrectLights | physically correct} rendering mode** — the default value **should not** be changed.
      * @remarks Expects a `Float`
      * @defaultValue `2`
      */
    var decay: Double = js.native
    
    /**
      * When **Default mode** — When distance is zero, light does not attenuate. When distance is non-zero,
      * light will attenuate linearly from maximum intensity at the light's position down to zero at this distance from the light.
      *
      * When **{@link WebGLRenderer.physicallyCorrectLights | Physically correct} rendering mode** — When distance is zero,
      * light will attenuate according to inverse-square law to infinite distance.
      * When distance is non-zero, light will attenuate according to inverse-square law until near the distance cutoff,
      * where it will then attenuate quickly and smoothly to 0. Inherently, cutoffs are not physically correct.
      *
      * @defaultValue `0.0`
      * @remarks Expects a `Float`
      */
    var distance: Double = js.native
    
    /**
      * The light's power.
      * When **{@link WebGLRenderer.physicallyCorrectLights | physically correct} rendering mode** — power is the luminous power of the light measured in lumens (lm).
      * @remarks Changing the power will also change the light's intensity.
      * @remarks Expects a `Float`
      */
    var power: Double = js.native
    
    /**
      * @default 'PointLight'
      */
    @JSName("type")
    var type_PointLight: String = js.native
  }
}
