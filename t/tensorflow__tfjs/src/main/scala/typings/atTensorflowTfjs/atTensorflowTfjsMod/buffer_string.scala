package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.string
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "buffer")
@js.native
object buffer_string extends js.Object {
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, string] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, string] = js.native
}

