package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "Tensor")
@js.native
class Tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */] protected ()
  extends atTensorflowTfjsLib.atTensorflowTfjsMod.Tensor[R] {
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues, dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId) = this()
  protected def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues, dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId, backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-node", "Tensor")
@js.native
object Tensor extends js.Object {
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.bool]
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.bool],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.bool
  ): T = js.native
  @JSName("make")
  def make_bool[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.bool],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.bool,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.complex64]
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.complex64],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.complex64
  ): T = js.native
  @JSName("make")
  def make_complex64[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.complex64],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.complex64,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  /**
    * Makes a new tensor with the provided shape and values. Values should be in
    * a flat array.
    */
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.float32]
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.float32],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.float32
  ): T = js.native
  @JSName("make")
  def make_float32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.float32],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.float32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.int32]
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.int32],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.int32
  ): T = js.native
  @JSName("make")
  def make_int32[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.int32],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.int32,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.string]
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.string],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.string
  ): T = js.native
  @JSName("make")
  def make_string[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] */, R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    data: atTensorflowTfjsDashCoreLib.distTensorMod.TensorData[atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.string],
    dtype: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibStrings.string,
    backend: atTensorflowTfjsDashCoreLib.distTensorMod.Backend
  ): T = js.native
}

