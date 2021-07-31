package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolantMod {
  
  @JSImport("three/src/math/Interpolant", "Interpolant")
  @js.native
  abstract class Interpolant protected () extends StObject {
    def this(parameterPositions: js.Any, sampleValues: js.Any, sampleSize: Double) = this()
    def this(parameterPositions: js.Any, sampleValues: js.Any, sampleSize: Double, resultBuffer: js.Any) = this()
    
    def evaluate(time: Double): js.Any = js.native
    
    var parameterPositions: js.Any = js.native
    
    var resultBuffer: js.Any = js.native
    
    var sampleValues: js.Any = js.native
    
    var valueSize: Double = js.native
  }
}
