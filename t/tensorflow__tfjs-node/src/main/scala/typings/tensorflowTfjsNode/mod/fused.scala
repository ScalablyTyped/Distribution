package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.AnonA
import typings.tensorflowTfjsCore.AnonActivation
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "fused")
@js.native
object fused extends js.Object {
  @js.native
  object conv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: AnonActivation[T]
    ): T = js.native
  }
  
  @js.native
  object depthwiseConv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: AnonActivation[T]
    ): T = js.native
  }
  
  @js.native
  object matMul extends js.Object {
    def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: AnonA[T]): T = js.native
  }
  
}

