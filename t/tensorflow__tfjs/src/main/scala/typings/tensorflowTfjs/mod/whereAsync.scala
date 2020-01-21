package typings.tensorflowTfjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "whereAsync")
@js.native
object whereAsync
  extends TopLevel[
      js.Function1[
        /* condition */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike, 
        js.Promise[Tensor2D]
      ]
    ]

