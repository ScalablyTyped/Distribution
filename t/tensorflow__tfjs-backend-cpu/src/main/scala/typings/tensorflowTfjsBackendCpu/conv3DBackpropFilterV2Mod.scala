package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv3DBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv3DBackpropFilterV2Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3DBackpropFilterV2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3DBackpropFilterV2(args: AttrsConv3DBackpropFilterAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropFilterV2")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3DBackpropFilterV2", "conv3DBackpropFilterV2Config")
  @js.native
  val conv3DBackpropFilterV2Config: KernelConfig = js.native
}
