package typings.tensorflowTfjsBackendCpu

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolWithArgmax_impl", JSImport.Namespace)
@js.native
object maxPoolWithArgmaxImplMod extends js.Object {
  def maxPoolWithArgmaxImpl(
    xValues: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    includeBatchInIndex: Boolean,
    convInfo: Conv2DInfo
  ): js.Array[js.Array[String] | Uint8Array | Int32Array | Float32Array] = js.native
}

