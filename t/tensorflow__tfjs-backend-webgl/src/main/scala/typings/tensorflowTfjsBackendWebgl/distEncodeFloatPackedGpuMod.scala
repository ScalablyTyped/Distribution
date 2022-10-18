package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodeFloatPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_float_packed_gpu", "EncodeFloatPackedProgram")
  @js.native
  open class EncodeFloatPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    
    @JSName("outTexUsage")
    var outTexUsage_EncodeFloatPackedProgram: TextureUsage = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_EncodeFloatPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_EncodeFloatPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
