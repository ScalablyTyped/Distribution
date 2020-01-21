package typings.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "batchNorm3d")
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

