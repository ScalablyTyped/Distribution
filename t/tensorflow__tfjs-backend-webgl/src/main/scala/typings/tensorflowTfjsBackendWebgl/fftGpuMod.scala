package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.imag
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.real
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/fft_gpu", "FFTProgram")
  @js.native
  class FFTProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(component: imag, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
    def this(component: real, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
