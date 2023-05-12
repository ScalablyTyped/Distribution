package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.InputsSparseFillEmptyRowsInputs
import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseFillEmptyRowsMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/SparseFillEmptyRows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setup(backend: BackendWasm): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(backend.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sparseFillEmptyRows(args: InputsSparseFillEmptyRowsInputs): js.Tuple4[TensorInfo, TensorInfo, TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[TensorInfo, TensorInfo, TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/SparseFillEmptyRows", "sparseFillEmptyRowsConfig")
  @js.native
  val sparseFillEmptyRowsConfig: KernelConfig = js.native
}
