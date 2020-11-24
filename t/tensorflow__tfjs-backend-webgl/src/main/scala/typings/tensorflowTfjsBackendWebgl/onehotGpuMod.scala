package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/onehot_gpu", JSImport.Namespace)
@js.native
object onehotGpuMod extends js.Object {
  
  @js.native
  class OneHotProgram protected () extends GPGPUProgram {
    def this(numIndices: Double, depth: Double, onValue: Double, offValue: Double) = this()
    
    var seedLoc: WebGLUniformLocation = js.native
  }
}
