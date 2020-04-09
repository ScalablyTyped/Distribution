package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/kernels/Transpose_impl", JSImport.Namespace)
@js.native
object transposeImplMod extends js.Object {
  def transposeImpl(
    xVals: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    perm: js.Array[Double],
    newShape: js.Array[Double]
  ): TypedArray = js.native
}

