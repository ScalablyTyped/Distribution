package typings.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "pad2d")
@js.native
object pad2d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor2D | TensorLike, 
        /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
        /* constantValue */ js.UndefOr[Double], 
        Tensor2D
      ]
    ]

