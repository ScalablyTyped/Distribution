package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "linalg")
@js.native
object linalgNs extends js.Object {
  val gramSchmidt: js.Function1[/* xs */ js.Array[Tensor1D] | Tensor2D, js.Array[Tensor1D] | Tensor2D] = js.native
  val qr: js.Function2[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    /* fullMatrices */ js.UndefOr[Boolean], 
    js.Tuple2[
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ] = js.native
}

