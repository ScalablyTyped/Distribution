package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Activation
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/fused/conv2d", JSImport.Namespace)
@js.native
object fusedConv2dMod extends js.Object {
  
  @js.native
  object conv2d extends js.Object {
    
    def apply[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Activation[T]
    ): T = js.native
  }
}
