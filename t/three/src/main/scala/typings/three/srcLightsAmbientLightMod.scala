package typings.three

import typings.three.srcLightsLightMod.Light
import typings.three.srcUtilsMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsAmbientLightMod {
  
  @JSImport("three/src/lights/AmbientLight", "AmbientLight")
  @js.native
  /**
    * This creates a Ambientlight with a color.
    * @param color Numeric value of the RGB component of the color or a Color instance.
    * @param [intensity=1]
    */
  open class AmbientLight () extends Light {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    val isAmbientLight: `true` = js.native
  }
}
