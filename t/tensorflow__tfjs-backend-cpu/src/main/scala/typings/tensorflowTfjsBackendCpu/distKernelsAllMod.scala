package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Attrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAllMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/All", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(args: Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/All", "allConfig")
  @js.native
  val allConfig: KernelConfig = js.native
}
