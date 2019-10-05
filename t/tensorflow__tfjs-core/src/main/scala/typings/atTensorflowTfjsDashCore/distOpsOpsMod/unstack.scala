package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "unstack")
@js.native
object unstack
  extends TopLevel[
      js.Function2[
        /* x */ Tensor[Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Array[Tensor[Rank]]
      ]
    ]

