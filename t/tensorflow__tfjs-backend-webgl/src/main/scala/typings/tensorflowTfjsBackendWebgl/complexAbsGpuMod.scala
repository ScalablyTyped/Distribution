package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexAbsGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/complex_abs_gpu", "ComplexAbsProgram")
  @js.native
  class ComplexAbsProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(shape: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
