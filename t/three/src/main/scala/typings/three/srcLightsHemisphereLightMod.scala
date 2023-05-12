package typings.three

import typings.three.srcLightsLightMod.Light
import typings.three.srcMathColorMod.Color
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsHemisphereLightMod {
  
  @JSImport("three/src/lights/HemisphereLight", "HemisphereLight")
  @js.native
  /**
    * Creates a new {@link HemisphereLight}.
    * @param skyColor Hexadecimal color of the sky. Expects a `Integer`. Default `0xffffff` _(white)_.
    * @param groundColor Hexadecimal color of the ground. Expects a `Integer`. Default `0xffffff` _(white)_.
    * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`.
    */
  open class HemisphereLight () extends Light[Unit] {
    def this(skyColor: ColorRepresentation) = this()
    def this(skyColor: Unit, groundColor: ColorRepresentation) = this()
    def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation) = this()
    def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: Unit, groundColor: ColorRepresentation, intensity: Double) = this()
    def this(skyColor: ColorRepresentation, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation, intensity: Double) = this()
    
    /**
      * The light's ground color, as passed in the constructor.
      * @defaultValue `new THREE.Color()` set to white _(0xffffff)_.
      */
    var groundColor: Color = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link HemisphereLight}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isHemisphereLight: `true` = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `HemisphereLight`
      */
    @JSName("type")
    val type_HemisphereLight: String | typings.three.threeStrings.HemisphereLight = js.native
  }
}
