package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FromPixels_utils/from_pixels_gpu", JSImport.Namespace)
@js.native
object fromPixelsGpuMod extends js.Object {
  @js.native
  class FromPixelsProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
  }
  
}

