package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "pad4d")
@js.native
object pad4d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike, 
        /* paddings */ js.Tuple4[
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double]
        ], 
        /* constantValue */ js.UndefOr[Double], 
        Tensor4D
      ]
    ]

