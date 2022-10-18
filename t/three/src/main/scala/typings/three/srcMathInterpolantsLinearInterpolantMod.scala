package typings.three

import typings.three.srcMathInterpolantMod.Interpolant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathInterpolantsLinearInterpolantMod {
  
  @JSImport("three/src/math/interpolants/LinearInterpolant", "LinearInterpolant")
  @js.native
  open class LinearInterpolant protected () extends Interpolant {
    def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double) = this()
    def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double, resultBuffer: Any) = this()
    
    def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): Any = js.native
  }
}
