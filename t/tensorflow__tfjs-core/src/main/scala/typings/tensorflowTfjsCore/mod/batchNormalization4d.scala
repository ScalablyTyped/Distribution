package typings.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "batchNormalization4d")
@js.native
object batchNormalization4d
  extends TopLevel[
      js.Function6[
        /* x */ Tensor4D | TensorLike, 
        /* mean */ Tensor4D | Tensor1D | TensorLike, 
        /* variance */ Tensor4D | Tensor1D | TensorLike, 
        /* varianceEpsilon */ js.UndefOr[Double], 
        /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
        /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
        Tensor4D
      ]
    ]

