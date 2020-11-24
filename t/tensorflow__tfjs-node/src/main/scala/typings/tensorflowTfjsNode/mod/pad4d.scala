package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
