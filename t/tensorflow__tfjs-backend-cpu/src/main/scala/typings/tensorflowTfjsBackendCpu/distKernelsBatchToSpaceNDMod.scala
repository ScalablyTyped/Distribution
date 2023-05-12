package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsBatchToSpaceNDAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsBatchToSpaceNDMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchToSpaceND", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchToSpaceND(args: AttrsBatchToSpaceNDAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("batchToSpaceND")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchToSpaceND", "batchToSpaceNDConfig")
  @js.native
  val batchToSpaceNDConfig: KernelConfig = js.native
}
