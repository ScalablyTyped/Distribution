package typings.tensorflowTfjsCore.baseMod

import typings.std.Float32Array
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "buffer")
@js.native
object buffer_complex64 extends js.Object {
  
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, complex64] = js.native
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): typings.tensorflowTfjsCore.distTensorMod.TensorBuffer[R, complex64] = js.native
}
