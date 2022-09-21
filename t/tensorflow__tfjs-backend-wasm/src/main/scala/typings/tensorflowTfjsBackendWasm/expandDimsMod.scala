package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsBackendInputs
import typings.tensorflowTfjsBackendWasm.anon.DataId
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandDimsMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/ExpandDims", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandDims(args: AttrsBackendInputs): DataId = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(args.asInstanceOf[js.Any]).asInstanceOf[DataId]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/ExpandDims", "expandDimsConfig")
  @js.native
  val expandDimsConfig: KernelConfig = js.native
}
