package typings.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "reverse4d")
@js.native
object reverse4d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor4D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor4D
      ]
    ]

