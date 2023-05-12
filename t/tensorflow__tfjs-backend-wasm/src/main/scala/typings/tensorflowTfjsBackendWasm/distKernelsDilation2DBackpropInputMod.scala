package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.anon.InputsDy
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDilation2DBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Dilation2DBackpropInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dilation2DBackpropInput(args: InputsDy): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("dilation2DBackpropInput")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/Dilation2DBackpropInput", "dilation2DBackpropInputConfig")
  @js.native
  val dilation2DBackpropInputConfig: KernelConfig = js.native
}
