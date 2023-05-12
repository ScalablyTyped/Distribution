package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsExpandDimsAttrs
import typings.tensorflowTfjsBackendWasm.anon.DataId
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsExpandDimsMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/ExpandDims", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandDims(args: AttrsExpandDimsAttrs): DataId = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(args.asInstanceOf[js.Any]).asInstanceOf[DataId]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/ExpandDims", "expandDimsConfig")
  @js.native
  val expandDimsConfig: KernelConfig = js.native
}
