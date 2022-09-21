package typings.three

import typings.three.lightProbeMod.LightProbe
import typings.three.threeBooleans.`true`
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ambientLightProbeMod {
  
  @JSImport("three/src/lights/AmbientLightProbe", "AmbientLightProbe")
  @js.native
  open class AmbientLightProbe () extends LightProbe {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    val isAmbientLightProbe: `true` = js.native
  }
}
