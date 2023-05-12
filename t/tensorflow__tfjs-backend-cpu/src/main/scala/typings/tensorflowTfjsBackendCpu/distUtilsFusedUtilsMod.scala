package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsFusedUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fused_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  inline def applyActivation(
    backend: MathBackendCPU,
    x: TensorInfo,
    activation: Activation,
    preluActivationWeights: Unit,
    leakyreluAlpha: Double
  ): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any], leakyreluAlpha.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  inline def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation, preluActivationWeights: TensorInfo): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  inline def applyActivation(
    backend: MathBackendCPU,
    x: TensorInfo,
    activation: Activation,
    preluActivationWeights: TensorInfo,
    leakyreluAlpha: Double
  ): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActivation")(backend.asInstanceOf[js.Any], x.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], preluActivationWeights.asInstanceOf[js.Any], leakyreluAlpha.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
