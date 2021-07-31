package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryopGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "BinaryOpProgram")
  @js.native
  class BinaryOpProgram protected ()
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
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "ELU_DER")
  @js.native
  val ELU_DER: /* "return (b >= 1.0) ? a : a * (b + 1.0);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "EQUAL")
  @js.native
  val EQUAL: /* "return float(a == b);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "GREATER")
  @js.native
  val GREATER: /* "return float(a > b);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "GREATER_EQUAL")
  @js.native
  val GREATER_EQUAL: /* "return float(a >= b);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "INT_DIV")
  @js.native
  val INT_DIV: /* "\n  float s = sign(a) * sign(b);\n  int ia = round(a);\n  int ib = round(b);\n  if (ib != 0) {\n    // Windows (D3D) wants guaranteed non-zero int division at compile-time.\n    return float(idiv(ia, ib, s));\n  } else {\n    return NAN;\n  }\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "LESS")
  @js.native
  val LESS: /* "return float(a < b);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "LESS_EQUAL")
  @js.native
  val LESS_EQUAL: /* "return float(a <= b);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "LOGICAL_AND")
  @js.native
  val LOGICAL_AND: /* "return float(a >= 1.0 && b >= 1.0);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "LOGICAL_OR")
  @js.native
  val LOGICAL_OR: /* "return float(a >= 1.0 || b >= 1.0);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "MAX")
  @js.native
  val MAX: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "MIN")
  @js.native
  val MIN: String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "MOD")
  @js.native
  val MOD: /* "if (b == 0.0) return NAN;\n  return mod(a, b);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "POW")
  @js.native
  val POW: /* "\nif(a < 0.0 && floor(b) < b){\n  return NAN;\n}\nif (b == 0.0) {\n  return 1.0;\n}\nreturn (round(mod(b, 2.0)) != 1) ?\n    pow(abs(a), b) : sign(a) * pow(abs(a), b);\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "PRELU")
  @js.native
  val PRELU: /* "return (a < 0.) ? b * a : a;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", "SQUARED_DIFFERENCE")
  @js.native
  val SQUARED_DIFFERENCE: /* "return (a - b) * (a - b);" */ String = js.native
}
