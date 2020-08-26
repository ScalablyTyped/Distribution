package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/multinomial_gpu", JSImport.Namespace)
@js.native
object multinomialGpuMod extends js.Object {
  @js.native
  class MultinomialProgram protected () extends GPGPUProgram {
    def this(batchSize: Double, numOutcomes: Double, numSamples: Double) = this()
    var seedLoc: WebGLUniformLocation = js.native
    def getCustomSetupFunc(seed: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

