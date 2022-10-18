package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLessEqualMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LessEqual", "LESS_EQUAL")
  @js.native
  val LESS_EQUAL: /* "return float(a <= b);" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LessEqual", "LESS_EQUAL_PACKED")
  @js.native
  val LESS_EQUAL_PACKED: /* "\n  return vec4(lessThanEqual(a, b));\n" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LessEqual", "lessEqual")
  @js.native
  val lessEqual: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LessEqual", "lessEqualConfig")
  @js.native
  val lessEqualConfig: KernelConfig = js.native
}
