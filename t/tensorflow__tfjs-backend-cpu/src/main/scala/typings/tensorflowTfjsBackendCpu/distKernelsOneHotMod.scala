package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsOneHotAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsOneHotMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/OneHot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oneHot(args: AttrsOneHotAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("oneHot")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/OneHot", "oneHotConfig")
  @js.native
  val oneHotConfig: KernelConfig = js.native
}
