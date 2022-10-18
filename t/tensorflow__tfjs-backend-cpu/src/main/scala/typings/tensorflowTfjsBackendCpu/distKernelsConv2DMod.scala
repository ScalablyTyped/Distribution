package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv2DAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2D(args: AttrsConv2DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2D", "conv2DConfig")
  @js.native
  val conv2DConfig: KernelConfig = js.native
}
