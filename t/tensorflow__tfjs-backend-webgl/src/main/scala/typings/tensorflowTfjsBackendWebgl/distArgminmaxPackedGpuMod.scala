package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distArgminmaxPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/argminmax_packed_gpu", "ArgMinMaxPackedProgram")
  @js.native
  open class ArgMinMaxPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(shape: js.Array[Double], windowSize: Double, op: max | min, firstPass: Boolean) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_ArgMinMaxPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ArgMinMaxPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
