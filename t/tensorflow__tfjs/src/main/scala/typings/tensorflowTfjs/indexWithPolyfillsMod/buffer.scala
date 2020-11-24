package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjs.tensorflowTfjsStrings.bool
import typings.tensorflowTfjs.tensorflowTfjsStrings.float32
import typings.tensorflowTfjs.tensorflowTfjsStrings.int32
import typings.tensorflowTfjs.tensorflowTfjsStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "buffer")
@js.native
object buffer extends js.Object {
  
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, float32] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, string] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: Float32Array
  ): typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, float32] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: Int32Array
  ): typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, int32] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: Uint8Array
  ): typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, bool] = js.native
}
