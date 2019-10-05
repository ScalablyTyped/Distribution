package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.complex64
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "buffer")
@js.native
object buffer_complex64 extends js.Object {
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, complex64] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, complex64] = js.native
}

