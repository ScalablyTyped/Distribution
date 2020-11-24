package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/diag_gpu", JSImport.Namespace)
@js.native
object diagGpuMod extends js.Object {
  
  @js.native
  class DiagProgram protected () extends GPGPUProgram {
    def this(size: Double) = this()
  }
}
