package typings.three

import typings.three.srcLightsLightProbeMod.LightProbe
import typings.three.srcMathColorMod.Color
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/AmbientLightProbe", JSImport.Namespace)
@js.native
object srcLightsAmbientLightProbeMod extends js.Object {
  @js.native
  class AmbientLightProbe () extends LightProbe {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    var isAmbientLightProbe: `true` = js.native
  }
  
}

