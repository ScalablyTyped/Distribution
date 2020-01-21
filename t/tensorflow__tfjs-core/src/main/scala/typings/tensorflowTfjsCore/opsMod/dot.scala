package typings.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "dot")
@js.native
object dot
  extends TopLevel[
      js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]]
    ]

