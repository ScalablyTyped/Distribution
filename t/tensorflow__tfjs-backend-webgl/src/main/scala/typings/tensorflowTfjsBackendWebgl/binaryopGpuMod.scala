package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryopGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "BinaryOpProgram")
  @js.native
  open class BinaryOpProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_BinaryOpProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "CHECK_NAN_SNIPPET")
  @js.native
  val CHECK_NAN_SNIPPET: /* "\n  if (isnan(a)) return a;\n  if (isnan(b)) return b;\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "SQUARED_DIFFERENCE")
  @js.native
  val SQUARED_DIFFERENCE: /* "return (a - b) * (a - b);" */ String = js.native
}
