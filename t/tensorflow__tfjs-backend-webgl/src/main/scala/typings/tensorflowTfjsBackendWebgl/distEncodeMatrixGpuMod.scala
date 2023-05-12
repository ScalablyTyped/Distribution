package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.NameType
import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodeMatrixGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_matrix_gpu", "EncodeMatrixProgram")
  @js.native
  open class EncodeMatrixProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    def this(outputShape: js.Tuple3[Double, Double, Double], inputIsUnsignedByte: Boolean) = this()
    def this(outputShape: js.Tuple3[Double, Double, Double], inputIsUnsignedByte: Boolean, usedChannels: String) = this()
    def this(outputShape: js.Tuple3[Double, Double, Double], inputIsUnsignedByte: Unit, usedChannels: String) = this()
    
    @JSName("customUniforms")
    var customUniforms_EncodeMatrixProgram: js.Array[NameType] = js.native
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_EncodeMatrixProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
