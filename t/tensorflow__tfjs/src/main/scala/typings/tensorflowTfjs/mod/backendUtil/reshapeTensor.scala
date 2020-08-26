package typings.tensorflowTfjs.mod.backendUtil

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util.reshapeTensor")
@js.native
object reshapeTensor extends js.Object {
  def apply[T /* <: Tensor[Rank] */, R /* <: Rank */](
    x: T,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
}

