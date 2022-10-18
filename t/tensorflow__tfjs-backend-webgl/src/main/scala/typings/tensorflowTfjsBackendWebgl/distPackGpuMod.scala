package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/pack_gpu", "PackProgram")
  @js.native
  open class PackProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_PackProgram: Boolean = js.native
    
    /* private */ var getOutOfBoundsCondition: Any = js.native
    
    /* private */ var getOutput: Any = js.native
    
    /* private */ var getSetup: Any = js.native
    
    /* private */ var getSourceCoordsArr: Any = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_PackProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_PackProgram: Boolean = js.native
    
    var rank: Double = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
