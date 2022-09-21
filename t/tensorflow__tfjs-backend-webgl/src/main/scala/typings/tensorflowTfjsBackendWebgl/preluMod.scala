package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsPreluInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preluMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Prelu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Prelu", "PRELU")
  @js.native
  val PRELU_ : /* "return (a < 0.) ? b * a : a;" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Prelu", "PRELU_PACKED")
  @js.native
  val PRELU_PACKED: /* "\n  vec4 aLessThanZero = vec4(lessThan(a, vec4(0.)));\n  return (aLessThanZero * (b * a)) + ((vec4(1.0) - aLessThanZero) * a);\n" */ String = js.native
  
  inline def prelu(args: InputsPreluInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Prelu", "preluConfig")
  @js.native
  val preluConfig: KernelConfig = js.native
}
