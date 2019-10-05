package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.euclidean
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.fro
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "norm")
@js.native
object norm
  extends TopLevel[
      js.Function4[
        /* x */ Tensor[Rank] | TensorLike, 
        /* ord */ js.UndefOr[Double | euclidean | fro], 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        /* keepDims */ js.UndefOr[Boolean], 
        Tensor[Rank]
      ]
    ]

