package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.AttrsSplitVAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSplitVMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/SplitV", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitV(args: AttrsSplitVAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitV")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/SplitV", "splitVConfig")
  @js.native
  val splitVConfig: KernelConfig = js.native
}
