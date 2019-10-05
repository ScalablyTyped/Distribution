package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Interpolant", JSImport.Namespace)
@js.native
object srcMathInterpolantMod extends js.Object {
  @js.native
  abstract class Interpolant protected () extends js.Object {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.Any) = this()
    var parameterPositions: js.Any = js.native
    var resultBuffer: js.Any = js.native
    var samplesValues: js.Any = js.native
    var valueSize: Double = js.native
    def evaluate(time: Double): js.Any = js.native
  }
  
}

