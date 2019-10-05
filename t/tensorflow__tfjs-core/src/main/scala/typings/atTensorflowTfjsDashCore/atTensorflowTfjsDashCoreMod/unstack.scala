package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "unstack")
@js.native
object unstack
  extends TopLevel[
      js.Function2[
        /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        /* axis */ js.UndefOr[Double], 
        js.Array[typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]]
      ]
    ]

