package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "batchNormalization2d")
@js.native
object batchNormalization2d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor2D | TensorLike, 
        /* mean */ Tensor2D | Tensor1D | TensorLike, 
        /* variance */ Tensor2D | Tensor1D | TensorLike, 
        /* varianceEpsilon */ js.UndefOr[Double], 
        /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
        Tensor2D
      ]
    ]

