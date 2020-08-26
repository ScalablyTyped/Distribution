package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "linalg")
@js.native
object linalg extends js.Object {
  val gramSchmidt: js.Function1[/* xs */ js.Array[Tensor1D] | Tensor2D, js.Array[Tensor1D] | Tensor2D] = js.native
  val qr: js.Function2[
    /* x */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[
      Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
      Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = js.native
  @js.native
  object bandPart extends js.Object {
    def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
  }
  
}

