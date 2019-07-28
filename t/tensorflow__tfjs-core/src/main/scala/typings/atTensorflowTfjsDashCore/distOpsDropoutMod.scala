package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/dropout", JSImport.Namespace)
@js.native
object distOpsDropoutMod extends js.Object {
  val dropout: js.Function4[
    /* x */ Tensor[Rank], 
    /* rate */ Scalar | Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
}

