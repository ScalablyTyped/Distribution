package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodeFloatGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_float_gpu", "EncodeFloatProgram")
  @js.native
  open class EncodeFloatProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("outTexUsage")
    var outTexUsage_EncodeFloatProgram: TextureUsage = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
