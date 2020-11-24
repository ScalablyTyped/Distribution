package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/select_gpu", JSImport.Namespace)
@js.native
object selectGpuMod extends js.Object {
  
  @js.native
  class SelectProgram protected () extends GPGPUProgram {
    def this(cRank: Double, shape: js.Array[Double], rank: Double) = this()
  }
}
