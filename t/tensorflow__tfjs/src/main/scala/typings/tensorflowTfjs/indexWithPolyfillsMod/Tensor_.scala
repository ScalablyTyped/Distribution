package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.tensorMod.DataId
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "Tensor")
@js.native
class Tensor_[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */] protected () extends Tensor[R] {
  def this(
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    dataId: DataId,
    id: Double
  ) = this()
}

