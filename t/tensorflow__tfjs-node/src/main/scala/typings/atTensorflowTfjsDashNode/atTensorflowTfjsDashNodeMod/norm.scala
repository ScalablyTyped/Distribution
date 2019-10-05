package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.euclidean
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.fro
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "norm")
@js.native
object norm
  extends TopLevel[
      js.Function4[
        /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        /* ord */ js.UndefOr[Double | euclidean | fro], 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        /* keepDims */ js.UndefOr[Boolean], 
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
      ]
    ]

