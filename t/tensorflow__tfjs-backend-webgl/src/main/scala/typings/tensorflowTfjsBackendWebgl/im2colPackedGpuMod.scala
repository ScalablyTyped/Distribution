package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object im2colPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/im2col_packed_gpu", "Im2ColPackedProgram")
  @js.native
  class Im2ColPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double], inputShape: js.Array[Double], convInfo: Conv2DInfo) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_Im2ColPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_Im2ColPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
