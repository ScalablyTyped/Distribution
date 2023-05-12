package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsMaxPool3DAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMaxPool3DMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/MaxPool3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxPool3D(args: AttrsMaxPool3DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPool3D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/MaxPool3D", "maxPool3DConfig")
  @js.native
  val maxPool3DConfig: KernelConfig = js.native
}
