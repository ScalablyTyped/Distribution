package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "Tensor")
@js.native
class Tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */] protected ()
  extends atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] {
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues, dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues, dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId, backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "Tensor")
@js.native
object Tensor extends js.Object {
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool]
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64]
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  /**
    * Makes a new tensor with the provided shape and values. Values should be in
    * a flat array.
    */
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32]
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32]
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string]
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string],
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
}

