package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/complex_abs_gpu", JSImport.Namespace)
@js.native
object complexAbsGpuMod extends js.Object {
  
  @js.native
  class ComplexAbsProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double]) = this()
  }
}
