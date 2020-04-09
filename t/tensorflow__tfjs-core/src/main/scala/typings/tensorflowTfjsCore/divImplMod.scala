package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/kernels/Div_impl", JSImport.Namespace)
@js.native
object divImplMod extends js.Object {
  @JSName("divImpl")
  def divImpl_bool(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: bool
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_complex64(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: complex64
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_float32(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: float32
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_int32(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: int32
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
  @JSName("divImpl")
  def divImpl_string(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: string
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
}

