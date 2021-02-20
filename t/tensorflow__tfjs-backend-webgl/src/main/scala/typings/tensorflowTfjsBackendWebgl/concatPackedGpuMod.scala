package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/concat_packed_gpu", "ConcatPackedProgram")
  @js.native
  class ConcatPackedProgram protected () extends GPGPUProgram {
    def this(shapes: js.Array[js.Array[Double]], axis: Double) = this()
    
    @JSName("packedInputs")
    var packedInputs_ConcatPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ConcatPackedProgram: Boolean = js.native
  }
}
