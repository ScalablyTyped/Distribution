package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "batchNorm4d")
@js.native
object batchNorm4d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor4D | TensorLike, 
        /* mean */ Tensor4D | Tensor1D | TensorLike, 
        /* variance */ Tensor4D | Tensor1D | TensorLike, 
        /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
        /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
        /* varianceEpsilon */ js.UndefOr[Double], 
        Tensor4D
      ]
    ]

