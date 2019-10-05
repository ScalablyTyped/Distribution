package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "gatherND")
@js.native
object gatherND
  extends TopLevel[
      js.Function2[
        /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        /* indices */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] | TensorLike, 
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
      ]
    ]

