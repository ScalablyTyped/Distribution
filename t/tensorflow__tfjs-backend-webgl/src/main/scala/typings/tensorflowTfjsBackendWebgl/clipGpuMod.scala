package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/clip_gpu", "ClipProgram")
  @js.native
  class ClipProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    
    def getCustomSetupFunc(min: Double, max: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var maxLoc: WebGLUniformLocation = js.native
    
    var minLoc: WebGLUniformLocation = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
