package typings.tensorflowTfjsCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "slice2d")
@js.native
object slice2d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor2D | TensorLike, 
        /* begin */ js.Tuple2[Double, Double], 
        /* size */ js.Tuple2[Double, Double], 
        Tensor2D
      ]
    ]

