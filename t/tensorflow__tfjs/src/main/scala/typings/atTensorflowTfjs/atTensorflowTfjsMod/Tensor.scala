package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsStrings.bool
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.complex64
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.float32
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.int32
import typings.atTensorflowTfjs.atTensorflowTfjsStrings.string
import typings.atTensorflowTfjsDashCore.distTensorMod.Backend
import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import typings.atTensorflowTfjsDashCore.distTensorMod.TensorData
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "Tensor")
@js.native
class Tensor[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */] protected ()
  extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor[R] {
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ) = this()
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    values: BackendValues
  ) = this()
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    values: BackendValues,
    dataId: DataId
  ) = this()
  protected def this(
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    values: BackendValues,
    dataId: DataId,
    backend: Backend
  ) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "Tensor")
@js.native
object Tensor extends js.Object {
  @JSName("make")
  def make_bool[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[bool]
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[bool],
    dtype: bool
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[bool],
    dtype: bool,
    backend: Backend
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[complex64]
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[complex64],
    dtype: complex64
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[complex64],
    dtype: complex64,
    backend: Backend
  ): T = js.native
  /**
    * Makes a new tensor with the provided shape and values. Values should be in
    * a flat array.
    */
  @JSName("make")
  def make_float32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[float32]
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[float32],
    dtype: float32
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[float32],
    dtype: float32,
    backend: Backend
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[int32]
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[int32],
    dtype: int32
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[int32],
    dtype: int32,
    backend: Backend
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[string]
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[string],
    dtype: string
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] */, R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: TensorData[string],
    dtype: string,
    backend: Backend
  ): T = js.native
}

