package typings.three

import typings.three.interpolantMod.Interpolant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubicInterpolantMod {
  
  @JSImport("three/src/math/interpolants/CubicInterpolant", "CubicInterpolant")
  @js.native
  class CubicInterpolant protected () extends Interpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.Any) = this()
    
    def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
  }
}
