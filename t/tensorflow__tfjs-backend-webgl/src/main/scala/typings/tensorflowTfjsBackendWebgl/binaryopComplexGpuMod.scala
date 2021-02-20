package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryopComplexGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "BinaryOpComplexProgram")
  @js.native
  class BinaryOpComplexProgram protected () extends GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
  }
  
  object COMPLEX_MULTIPLY {
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "COMPLEX_MULTIPLY")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "COMPLEX_MULTIPLY.IMAG")
    @js.native
    def IMAG: String = js.native
    @scala.inline
    def IMAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAG")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_complex_gpu", "COMPLEX_MULTIPLY.REAL")
    @js.native
    def REAL: String = js.native
    @scala.inline
    def REAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REAL")(x.asInstanceOf[js.Any])
  }
}
