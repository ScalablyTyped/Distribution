package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.A
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/fused/mat_mul", JSImport.Namespace)
@js.native
object matMulMod extends js.Object {
  
  @js.native
  object matMul extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: A[T]): T = js.native
  }
}
