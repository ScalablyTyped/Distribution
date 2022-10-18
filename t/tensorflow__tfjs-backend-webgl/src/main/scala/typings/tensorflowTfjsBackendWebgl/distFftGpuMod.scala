package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.imag
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.real
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFftGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/fft_gpu", "FFTProgram")
  @js.native
  open class FFTProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(component: real | imag, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
