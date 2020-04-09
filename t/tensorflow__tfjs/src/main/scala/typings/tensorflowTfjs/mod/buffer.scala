package typings.tensorflowTfjs.mod

import typings.tensorflowTfjs.tensorflowTfjsStrings.float32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "buffer")
@js.native
object buffer extends js.Object {
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.tensorMod.TensorBuffer[R, float32] = js.native
}

