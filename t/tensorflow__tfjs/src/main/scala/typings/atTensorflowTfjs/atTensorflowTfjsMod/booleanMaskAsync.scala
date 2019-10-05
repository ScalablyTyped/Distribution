package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "booleanMaskAsync")
@js.native
object booleanMaskAsync
  extends TopLevel[
      js.Function3[
        /* tensor */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        /* mask */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Promise[typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]]
      ]
    ]

