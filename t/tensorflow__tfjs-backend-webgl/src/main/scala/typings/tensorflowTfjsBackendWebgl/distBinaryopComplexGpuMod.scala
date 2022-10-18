package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBinaryopComplexGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "BinaryOpComplexProgram")
  @js.native
  open class BinaryOpComplexProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  object COMPLEX_MULTIPLY {
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "COMPLEX_MULTIPLY")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "COMPLEX_MULTIPLY.IMAG")
    @js.native
    def IMAG: String = js.native
    inline def IMAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAG")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "COMPLEX_MULTIPLY.REAL")
    @js.native
    def REAL: String = js.native
    inline def REAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REAL")(x.asInstanceOf[js.Any])
  }
}
