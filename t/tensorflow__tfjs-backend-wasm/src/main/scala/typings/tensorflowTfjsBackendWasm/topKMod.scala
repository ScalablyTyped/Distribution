package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsTopKAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topKMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/TopK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/TopK", "topKConfig")
  @js.native
  val topKConfig: KernelConfig = js.native
  
  inline def topk(args: AttrsTopKAttrs): js.Array[TensorInfo] | TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("topk")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo] | TensorInfo]
}
