package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/flip_left_right_gpu", JSImport.Namespace)
@js.native
object flipLeftRightGpuMod extends js.Object {
  
  @js.native
  class FlipLeftRightProgram protected () extends GPGPUProgram {
    def this(imageShape: js.Tuple4[Double, Double, Double, Double]) = this()
  }
}
