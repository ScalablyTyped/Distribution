package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reverseGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/reverse_gpu", "ReverseProgram")
  @js.native
  class ReverseProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], axis: js.Array[Double]) = this()
  }
}
