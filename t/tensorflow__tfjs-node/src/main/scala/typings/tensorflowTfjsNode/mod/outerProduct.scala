package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "outerProduct")
@js.native
object outerProduct
  extends TopLevel[
      js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D]
    ]

