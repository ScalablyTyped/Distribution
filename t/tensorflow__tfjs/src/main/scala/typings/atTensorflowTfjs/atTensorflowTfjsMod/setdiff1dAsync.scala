package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "setdiff1dAsync")
@js.native
object setdiff1dAsync
  extends TopLevel[
      js.Function2[
        /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        /* y */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        js.Promise[
          js.Tuple2[
            typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], 
            typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
          ]
        ]
      ]
    ]

