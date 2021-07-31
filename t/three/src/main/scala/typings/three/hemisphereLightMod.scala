package typings.three

import typings.three.colorMod.Color
import typings.three.lightMod.Light
import typings.three.threeBooleans.`true`
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
  class HemisphereLight () extends Light {
    def this(skyColor: String) = this()
    def this(skyColor: Double) = this()
    def this(skyColor: Color) = this()
    def this(skyColor: String, groundColor: String) = this()
    def this(skyColor: String, groundColor: Double) = this()
    def this(skyColor: String, groundColor: Color) = this()
    def this(skyColor: Double, groundColor: String) = this()
    def this(skyColor: Double, groundColor: Double) = this()
    def this(skyColor: Double, groundColor: Color) = this()
    def this(skyColor: Unit, groundColor: String) = this()
    def this(skyColor: Unit, groundColor: Double) = this()
    def this(skyColor: Unit, groundColor: Color) = this()
    def this(skyColor: Color, groundColor: String) = this()
    def this(skyColor: Color, groundColor: Double) = this()
    def this(skyColor: Color, groundColor: Color) = this()
    def this(skyColor: String, groundColor: String, intensity: Double) = this()
    def this(skyColor: String, groundColor: Double, intensity: Double) = this()
    def this(skyColor: String, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: String, groundColor: Color, intensity: Double) = this()
    def this(skyColor: Double, groundColor: String, intensity: Double) = this()
    def this(skyColor: Double, groundColor: Double, intensity: Double) = this()
    def this(skyColor: Double, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: Double, groundColor: Color, intensity: Double) = this()
    def this(skyColor: Unit, groundColor: String, intensity: Double) = this()
    def this(skyColor: Unit, groundColor: Double, intensity: Double) = this()
    def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: Unit, groundColor: Color, intensity: Double) = this()
    def this(skyColor: Color, groundColor: String, intensity: Double) = this()
    def this(skyColor: Color, groundColor: Double, intensity: Double) = this()
    def this(skyColor: Color, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: Color, groundColor: Color, intensity: Double) = this()
    
    var groundColor: Color = js.native
    
    val isHemisphereLight: `true` = js.native
  }
}
