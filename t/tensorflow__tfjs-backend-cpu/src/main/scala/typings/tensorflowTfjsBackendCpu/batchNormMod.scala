package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.BackendInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchNormMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchNorm", "batchNorm")
  @js.native
  def batchNorm(args: BackendInputs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchNorm", "batchNormConfig")
  @js.native
  val batchNormConfig: KernelConfig = js.native
}
