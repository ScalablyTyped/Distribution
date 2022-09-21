package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsFusedBatchNormAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchNormMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchNorm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchNorm(args: AttrsFusedBatchNormAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNorm")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchNorm", "batchNormConfig")
  @js.native
  val batchNormConfig: KernelConfig = js.native
}
