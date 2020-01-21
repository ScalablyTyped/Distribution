package typings.tensorflowTfjs.mod

import typings.std.Uint8Array
import typings.tensorflowTfjs.tensorflowTfjsStrings.bool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "buffer")
@js.native
object buffer_bool extends js.Object {
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): typings.tensorflowTfjsCore.tensorMod.TensorBuffer[R, bool] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: Uint8Array
  ): typings.tensorflowTfjsCore.tensorMod.TensorBuffer[R, bool] = js.native
}

