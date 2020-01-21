package typings.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "reverse3d")
@js.native
object reverse3d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor3D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor3D
      ]
    ]

