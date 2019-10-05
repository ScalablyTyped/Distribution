package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "oneHot")
@js.native
object oneHot
  extends TopLevel[
      js.Function4[
        /* indices */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        /* depth */ Double, 
        /* onValue */ js.UndefOr[Double], 
        /* offValue */ js.UndefOr[Double], 
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
      ]
    ]

