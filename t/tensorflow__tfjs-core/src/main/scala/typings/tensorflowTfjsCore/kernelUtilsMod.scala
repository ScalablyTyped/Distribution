package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/utils/kernel_utils", JSImport.Namespace)
@js.native
object kernelUtilsMod extends js.Object {
  def broadcastedBinaryOp(
    aShape: js.Array[Double],
    bShape: js.Array[Double],
    aVals: TypedArray,
    bVals: TypedArray,
    dtype: DataType,
    op: js.Function2[/* a */ Double, /* b */ Double, Double]
  ): js.Tuple2[TypedArray, js.Array[Double]] = js.native
}

