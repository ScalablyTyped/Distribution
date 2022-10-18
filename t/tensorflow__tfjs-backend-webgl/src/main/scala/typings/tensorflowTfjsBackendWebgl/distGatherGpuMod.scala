package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGatherGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gather_gpu", "GatherProgram")
  @js.native
  open class GatherProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: GatherShape, outputShape: GatherShape) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    var rank: Double = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  type GatherShape = js.Tuple4[Double, Double, Double, Double]
}
