package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsSliceAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSliceMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def slice(args: AttrsSliceAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Slice", "sliceConfig")
  @js.native
  val sliceConfig: KernelConfig = js.native
}
