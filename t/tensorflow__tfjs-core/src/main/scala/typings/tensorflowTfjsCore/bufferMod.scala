package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.TensorBuffer
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any]).asInstanceOf[TensorBuffer[R, float32]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  @scala.inline
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  @scala.inline
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  @scala.inline
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  @scala.inline
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  
  @scala.inline
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  @scala.inline
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  
  @scala.inline
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  @scala.inline
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  
  @scala.inline
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  @scala.inline
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
}
