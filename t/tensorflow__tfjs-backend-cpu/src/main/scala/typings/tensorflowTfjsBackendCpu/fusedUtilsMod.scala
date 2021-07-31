package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fused_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  @scala.inline
  def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation, preluActivationWeights: TensorInfo): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
