package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/boolean_mask", JSImport.Namespace)
@js.native
object distOpsBooleanUnderscoreMaskMod extends js.Object {
  val booleanMaskAsync: js.Function3[
    /* tensor */ Tensor[Rank] | TensorLike, 
    /* mask */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Promise[Tensor[Rank]]
  ] = js.native
}

