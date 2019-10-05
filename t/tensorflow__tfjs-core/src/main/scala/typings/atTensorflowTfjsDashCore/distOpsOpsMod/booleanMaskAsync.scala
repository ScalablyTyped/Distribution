package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "booleanMaskAsync")
@js.native
object booleanMaskAsync
  extends TopLevel[
      js.Function3[
        /* tensor */ Tensor[Rank] | TensorLike, 
        /* mask */ Tensor[Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Promise[Tensor[Rank]]
      ]
    ]

