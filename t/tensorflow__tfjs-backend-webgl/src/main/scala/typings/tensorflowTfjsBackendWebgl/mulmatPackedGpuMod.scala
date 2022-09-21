package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mulmatPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/mulmat_packed_gpu", "MatMulPackedProgram")
  @js.native
  open class MatMulPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      aShape: js.Tuple3[Double, Double, Double],
      bShape: js.Tuple3[Double, Double, Double],
      outputShape: js.Tuple3[Double, Double, Double],
      transposeA: js.UndefOr[Boolean],
      transposeB: js.UndefOr[Boolean],
      addBias: js.UndefOr[Boolean],
      activation: js.UndefOr[String],
      hasPreluActivation: js.UndefOr[Boolean],
      hasLeakyreluActivation: js.UndefOr[Boolean]
    ) = this()
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_MatMulPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_MatMulPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_MatMulPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
