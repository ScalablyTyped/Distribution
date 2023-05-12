package typings.three

import typings.three.srcLightsLightMod.Light
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsRectAreaLightMod {
  
  @JSImport("three/src/lights/RectAreaLight", "RectAreaLight")
  @js.native
  /**
    * Creates a new {@link RectAreaLight}.
    * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
    * @param intensity The light's intensity, or brightness. Expects a `Float`. Default `1`
    * @param width Width of the light. Expects a `Float`. Default `10`
    * @param height Height of the light. Expects a `Float`. Default `10`
    */
  open class RectAreaLight () extends Light[Unit] {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    def this(color: Unit, intensity: Double, width: Double) = this()
    def this(color: Unit, intensity: Unit, width: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, width: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, width: Double) = this()
    def this(color: Unit, intensity: Double, width: Double, height: Double) = this()
    def this(color: Unit, intensity: Double, width: Unit, height: Double) = this()
    def this(color: Unit, intensity: Unit, width: Double, height: Double) = this()
    def this(color: Unit, intensity: Unit, width: Unit, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, width: Double, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, width: Unit, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, width: Double, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, width: Unit, height: Double) = this()
    
    /**
      * The height of the light.
      * @remarks Expects a `Float`
      * @defaultValue `10`
      */
    var height: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link RectAreaLight}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isRectAreaLight: `true` = js.native
    
    /**
      * The light's power.
      * @remarks Changing the power will also change the light's intensity.
      * In **{@link WebGLRenderer.physicallyCorrectLights | physically correct} rendering mode** — power is the luminous power of the light measured in lumens (lm).
      * @remarks Expects a `Float`
      */
    var power: Double = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `RectAreaLight`
      */
    @JSName("type")
    val type_RectAreaLight: String | typings.three.threeStrings.RectAreaLight = js.native
    
    /**
      * The width of the light.
      * @remarks Expects a `Float`
      * @defaultValue `10`
      */
    var width: Double = js.native
  }
}
