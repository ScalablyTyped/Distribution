package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/binaryop_gpu", JSImport.Namespace)
@js.native
object binaryopGpuMod extends js.Object {
  @js.native
  class BinaryOpProgram protected () extends GPGPUProgram {
    def this(op: String, aShape: js.Array[Double], bShape: js.Array[Double]) = this()
  }
  
  val ADD: /* "return a + b;" */ String = js.native
  val ATAN2: String = js.native
  val DIV: /* "\nif (a == b) {\n  return 1.0;\n};\nreturn a / b;" */ String = js.native
  val ELU_DER: /* "return (b >= 1.0) ? a : a * (b + 1.0);" */ String = js.native
  val EQUAL: /* "return float(a == b);" */ String = js.native
  val GREATER: /* "return float(a > b);" */ String = js.native
  val GREATER_EQUAL: /* "return float(a >= b);" */ String = js.native
  val INT_DIV: /* "\n  float s = sign(a) * sign(b);\n  int ia = round(a);\n  int ib = round(b);\n  if (ib != 0) {\n    // Windows (D3D) wants guaranteed non-zero int division at compile-time.\n    return float(idiv(ia, ib, s));\n  } else {\n    return NAN;\n  }\n" */ String = js.native
  val LESS: /* "return float(a < b);" */ String = js.native
  val LESS_EQUAL: /* "return float(a <= b);" */ String = js.native
  val LOGICAL_AND: /* "return float(a >= 1.0 && b >= 1.0);" */ String = js.native
  val LOGICAL_OR: /* "return float(a >= 1.0 || b >= 1.0);" */ String = js.native
  val MAX: String = js.native
  val MIN: String = js.native
  val MOD: /* "if (b == 0.0) return NAN;\n  return mod(a, b);" */ String = js.native
  val MUL: /* "return a * b;" */ String = js.native
  val NOT_EQUAL: /* "return float(a != b);" */ String = js.native
  val POW: /* "\nif(a < 0.0 && floor(b) < b){\n  return NAN;\n}\nif (b == 0.0) {\n  return 1.0;\n}\nreturn (round(mod(b, 2.0)) != 1) ?\n    pow(abs(a), b) : sign(a) * pow(abs(a), b);\n" */ String = js.native
  val PRELU: /* "return (a < 0.) ? b * a : a;" */ String = js.native
  val SQUARED_DIFFERENCE: /* "return (a - b) * (a - b);" */ String = js.native
  val SUB: /* "return a - b;" */ String = js.native
}

