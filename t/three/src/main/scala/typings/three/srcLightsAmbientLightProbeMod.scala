package typings.three

import typings.three.srcLightsLightProbeMod.LightProbe
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsAmbientLightProbeMod {
  
  @JSImport("three/src/lights/AmbientLightProbe", "AmbientLightProbe")
  @js.native
  /**
    * Creates a new {@link AmbientLightProbe}.
    * @param color An instance of Color, string representing a color or a number representing a color.
    * @param intensity Numeric value of the light probe's intensity. Expects a `Float`. Default `1`
    */
  open class AmbientLightProbe () extends LightProbe {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link AmbientLightProbe}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isAmbientLightProbe: `true` = js.native
  }
}
