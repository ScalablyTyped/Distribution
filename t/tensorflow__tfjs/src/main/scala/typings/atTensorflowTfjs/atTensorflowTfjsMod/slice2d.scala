package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "slice2d")
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

