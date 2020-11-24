package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/clip_packed_gpu", JSImport.Namespace)
@js.native
object clipPackedGpuMod extends js.Object {
  
  @js.native
  class ClipPackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    
    def getCustomSetupFunc(min: Double, max: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var maxLoc: WebGLUniformLocation = js.native
    
    var minLoc: WebGLUniformLocation = js.native
    
    @JSName("packedInputs")
    var packedInputs_ClipPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ClipPackedProgram: Boolean = js.native
  }
}
