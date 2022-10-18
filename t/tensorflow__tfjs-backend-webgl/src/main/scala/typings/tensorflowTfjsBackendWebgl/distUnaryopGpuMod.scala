package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUnaryopGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ABS")
  @js.native
  val ABS: /* "return abs(x);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "CHECK_NAN_SNIPPET")
  @js.native
  val CHECK_NAN_SNIPPET: /* "if (isnan(x)) return x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "CLONE")
  @js.native
  val CLONE: /* "return x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "ELU")
  @js.native
  val ELU: /* "return (x >= 0.0) ? x : (exp(x) - 1.0);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "LINEAR")
  @js.native
  val LINEAR: /* "return x;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "RELU")
  @js.native
  val RELU: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "RELU6")
  @js.native
  val RELU6: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "SIGMOID")
  @js.native
  val SIGMOID: /* "return 1.0 / (1.0 + exp(-1.0 * x));" */ String = js.native
  
  inline def STEP(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STEP")().asInstanceOf[String]
  inline def STEP(alpha: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STEP")(alpha.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/unaryop_gpu", "UnaryOpProgram")
  @js.native
  open class UnaryOpProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_UnaryOpProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
