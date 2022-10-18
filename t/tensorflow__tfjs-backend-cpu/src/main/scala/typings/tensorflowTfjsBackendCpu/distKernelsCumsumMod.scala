package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsCumsumAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCumsumMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cumsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cumsum(args: AttrsCumsumAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cumsum", "cumsumConfig")
  @js.native
  val cumsumConfig: KernelConfig = js.native
}
