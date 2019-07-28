package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.euclidean
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.fro
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/norm", JSImport.Namespace)
@js.native
object distOpsNormMod extends js.Object {
  val norm: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* ord */ js.UndefOr[Double | euclidean | fro], 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
}

