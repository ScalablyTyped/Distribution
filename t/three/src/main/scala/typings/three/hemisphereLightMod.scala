package typings.three

import typings.three.colorMod.Color
import typings.three.lightMod.Light
import typings.three.threeBooleans.`true`
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hemisphereLightMod {
  
  @JSImport("three/src/lights/HemisphereLight", "HemisphereLight")
  @js.native
  /**
    * @param skyColor
    * @param groundColor
    * @param [intensity=1]
    */
  open class HemisphereLight () extends Light {
    def this(skyColor: ColorRepresentation) = this()
    def this(skyColor: Unit, groundColor: ColorRepresentation) = this()
    def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation) = this()
    def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: Unit, groundColor: ColorRepresentation, intensity: Double) = this()
    def this(skyColor: ColorRepresentation, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation, intensity: Double) = this()
    
    var groundColor: Color = js.native
    
    val isHemisphereLight: `true` = js.native
  }
}
