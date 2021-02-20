package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeFloatPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_float_packed_gpu", "EncodeFloatPackedProgram")
  @js.native
  class EncodeFloatPackedProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    
    @JSName("outTexUsage")
    var outTexUsage_EncodeFloatPackedProgram: TextureUsage = js.native
    
    @JSName("packedInputs")
    var packedInputs_EncodeFloatPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_EncodeFloatPackedProgram: Boolean = js.native
  }
}
