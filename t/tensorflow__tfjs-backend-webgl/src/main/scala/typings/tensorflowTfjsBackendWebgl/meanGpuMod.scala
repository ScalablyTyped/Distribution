package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/mean_gpu", JSImport.Namespace)
@js.native
object meanGpuMod extends js.Object {
  
  @js.native
  class MeanProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo) = this()
    def this(reduceInfo: ReduceInfo, divisor: Double) = this()
  }
}
