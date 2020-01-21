package typings.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "slice4d")
@js.native
object slice4d
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike, 
        /* begin */ js.Tuple4[Double, Double, Double, Double], 
        /* size */ js.Tuple4[Double, Double, Double, Double], 
        Tensor4D
      ]
    ]

