package typings.three

import typings.three.colorMod.Color
import typings.three.lightProbeMod.LightProbe
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/AmbientLightProbe", JSImport.Namespace)
@js.native
object ambientLightProbeMod extends js.Object {
  @js.native
  class AmbientLightProbe () extends LightProbe {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    val isAmbientLightProbe: `true` = js.native
  }
  
}

