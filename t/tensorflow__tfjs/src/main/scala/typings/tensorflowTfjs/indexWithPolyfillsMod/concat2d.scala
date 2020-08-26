package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "concat2d")
@js.native
object concat2d
  extends TopLevel[
      js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D]
    ]

