package typings.three

import typings.three.srcLightsLightMod.Light
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsAmbientLightMod {
  
  @JSImport("three/src/lights/AmbientLight", "AmbientLight")
  @js.native
  /**
    * Creates a new {@link AmbientLight}.
    * @param color Numeric value of the RGB component of the color. Default `0xffffff`
    * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`
    */
  open class AmbientLight () extends Light[Unit] {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link AmbientLight}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isAmbientLight: `true` = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `AmbientLight`
      */
    @JSName("type")
    val type_AmbientLight: String | typings.three.threeStrings.AmbientLight = js.native
  }
}
