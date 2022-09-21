package typings.three

import typings.three.lightProbeMod.LightProbe
import typings.three.threeBooleans.`true`
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hemisphereLightProbeMod {
  
  @JSImport("three/src/lights/HemisphereLightProbe", "HemisphereLightProbe")
  @js.native
  open class HemisphereLightProbe () extends LightProbe {
    def this(skyColor: ColorRepresentation) = this()
    def this(skyColor: Unit, groundColor: ColorRepresentation) = this()
    def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation) = this()
    def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: Unit, groundColor: ColorRepresentation, intensity: Double) = this()
    def this(skyColor: ColorRepresentation, groundColor: Unit, intensity: Double) = this()
    def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation, intensity: Double) = this()
    
    val isHemisphereLightProbe: `true` = js.native
  }
}
