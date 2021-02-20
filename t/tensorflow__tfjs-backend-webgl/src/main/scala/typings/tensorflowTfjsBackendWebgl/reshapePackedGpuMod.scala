package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reshapePackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/reshape_packed_gpu", "ReshapePackedProgram")
  @js.native
  class ReshapePackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double], inputShape: js.Tuple3[Double, Double, Double]) = this()
    
    @JSName("packedInputs")
    var packedInputs_ReshapePackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ReshapePackedProgram: Boolean = js.native
  }
}
