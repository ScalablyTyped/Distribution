package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelUtilsIntMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/int", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def int(input: TensorInfo, backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("int")(input.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
