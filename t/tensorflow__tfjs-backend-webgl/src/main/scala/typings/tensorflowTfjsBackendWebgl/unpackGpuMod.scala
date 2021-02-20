package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unpackGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unpack_gpu", "UnpackProgram")
  @js.native
  class UnpackProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("packedInputs")
    var packedInputs_UnpackProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_UnpackProgram: Boolean = js.native
  }
}
