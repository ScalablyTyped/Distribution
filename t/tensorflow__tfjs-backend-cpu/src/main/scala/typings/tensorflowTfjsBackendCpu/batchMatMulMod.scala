package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsBackend
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMatMulMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchMatMul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def batchMatMul(args: AttrsBackend): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("batchMatMul")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchMatMul", "batchMatMulConfig")
  @js.native
  val batchMatMulConfig: KernelConfig = js.native
}
