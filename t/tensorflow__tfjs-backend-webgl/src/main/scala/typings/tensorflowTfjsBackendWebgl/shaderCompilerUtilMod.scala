package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderCompilerUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler_util", "ENCODE_FLOAT_SNIPPET")
  @js.native
  val ENCODE_FLOAT_SNIPPET: /* "\n  const float FLOAT_MAX = 1.70141184e38;\n  const float FLOAT_MIN = 1.17549435e-38;\n\n  lowp vec4 encode_float(highp float v) {\n    if (isnan(v)) {\n      return vec4(255, 255, 255, 255);\n    }\n\n    highp float av = abs(v);\n\n    if(av < FLOAT_MIN) {\n      return vec4(0.0, 0.0, 0.0, 0.0);\n    } else if(v > FLOAT_MAX) {\n      return vec4(0.0, 0.0, 128.0, 127.0) / 255.0;\n    } else if(v < -FLOAT_MAX) {\n      return vec4(0.0, 0.0,  128.0, 255.0) / 255.0;\n    }\n\n    highp vec4 c = vec4(0,0,0,0);\n\n    highp float e = floor(log2(av));\n    highp float m = exp2(fract(log2(av))) - 1.0;\n\n    c[2] = floor(128.0 * m);\n    m -= c[2] / 128.0;\n    c[1] = floor(32768.0 * m);\n    m -= c[1] / 32768.0;\n    c[0] = floor(8388608.0 * m);\n\n    highp float ebias = e + 127.0;\n    c[3] = floor(ebias / 2.0);\n    ebias -= c[3] * 2.0;\n    c[2] += floor(ebias) * 128.0;\n\n    c[3] += 128.0 * step(0.0, -v);\n\n    return c / 255.0;\n  }\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler_util", "dotify")
  @js.native
  def dotify(x: js.Array[String], y: js.Array[String]): String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler_util", "getFlatIndexFrom3D")
  @js.native
  def getFlatIndexFrom3D(shape: js.Tuple3[Double, Double, Double]): String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler_util", "getLogicalCoordinatesFromFlatIndex")
  @js.native
  def getLogicalCoordinatesFromFlatIndex(coords: js.Array[String], shape: js.Array[Double]): String = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/shader_compiler_util", "getLogicalCoordinatesFromFlatIndex")
  @js.native
  def getLogicalCoordinatesFromFlatIndex(coords: js.Array[String], shape: js.Array[Double], index: String): String = js.native
}
