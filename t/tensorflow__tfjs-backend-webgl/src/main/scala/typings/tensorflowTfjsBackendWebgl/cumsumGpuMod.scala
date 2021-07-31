package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cumsumGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/cumsum_gpu", "CumSumProgram")
  @js.native
  class CumSumProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(shape: js.Array[Double], exclusive: Boolean, reverse: Boolean) = this()
    
    def getCustomSetupFunc(index: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var index: WebGLUniformLocation = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
