package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addnPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/addn_packed_gpu", "AddNPackedProgram")
  @js.native
  class AddNPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double], shapes: js.Array[js.Array[Double]]) = this()
    
    @JSName("packedInputs")
    var packedInputs_AddNPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_AddNPackedProgram: Boolean = js.native
  }
}
