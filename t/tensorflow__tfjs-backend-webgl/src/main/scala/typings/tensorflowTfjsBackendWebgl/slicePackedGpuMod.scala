package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/slice_packed_gpu", JSImport.Namespace)
@js.native
object slicePackedGpuMod extends js.Object {
  @js.native
  class SlicePackedProgram protected () extends GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    @JSName("packedInputs")
    var packedInputs_SlicePackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_SlicePackedProgram: Boolean = js.native
    var rank: Double = js.native
    var startLoc: WebGLUniformLocation = js.native
    def getCustomSetupFunc(start: js.Array[Double]): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

