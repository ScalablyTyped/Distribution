package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "Tensor")
@js.native
class Tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */] protected ()
  extends atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[R] {
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues, dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues, dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId, backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "Tensor")
@js.native
object Tensor extends js.Object {
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool]
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64]
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  /**
    * Makes a new tensor with the provided shape and values. Values should be in
    * a flat array.
    */
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32]
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32]
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string]
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
}

