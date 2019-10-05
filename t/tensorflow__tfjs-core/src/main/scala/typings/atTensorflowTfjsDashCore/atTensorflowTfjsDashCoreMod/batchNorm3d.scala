package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "batchNorm3d")
@js.native
object batchNorm3d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor3D | TensorLike, 
        /* mean */ Tensor3D | Tensor1D | TensorLike, 
        /* variance */ Tensor3D | Tensor1D | TensorLike, 
        /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
        /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
        /* varianceEpsilon */ js.UndefOr[Double], 
        Tensor3D
      ]
    ]

