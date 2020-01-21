package typings.tensorflowTfjsCore

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/clip_gpu", JSImport.Namespace)
@js.native
object clipGpuMod extends js.Object {
  @js.native
  class ClipProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    var maxLoc: WebGLUniformLocation = js.native
    var minLoc: WebGLUniformLocation = js.native
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
    def getCustomSetupFunc(min: Double, max: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

