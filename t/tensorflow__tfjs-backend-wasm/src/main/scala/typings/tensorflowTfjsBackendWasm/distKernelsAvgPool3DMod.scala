package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.Attrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAvgPool3DMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/AvgPool3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avgPool3D(args: Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/AvgPool3D", "avgPool3DConfig")
  @js.native
  val avgPool3DConfig: KernelConfig = js.native
}
