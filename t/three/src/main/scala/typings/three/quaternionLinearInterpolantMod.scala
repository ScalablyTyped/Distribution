package typings.three

import typings.three.interpolantMod.Interpolant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quaternionLinearInterpolantMod {
  
  @JSImport("three/src/math/interpolants/QuaternionLinearInterpolant", "QuaternionLinearInterpolant")
  @js.native
  open class QuaternionLinearInterpolant protected () extends Interpolant {
    def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double) = this()
    def this(parameterPositions: Any, samplesValues: Any, sampleSize: Double, resultBuffer: Any) = this()
    
    def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): Any = js.native
  }
}
