package typings.three

import typings.three.interpolantMod.Interpolant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/interpolants/LinearInterpolant", JSImport.Namespace)
@js.native
object linearInterpolantMod extends js.Object {
  @js.native
  class LinearInterpolant protected () extends Interpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.Any) = this()
    def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
  }
  
}

