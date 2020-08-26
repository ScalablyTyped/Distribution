package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", JSImport.Namespace)
@js.native
object sharedMod extends js.Object {
  def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = js.native
  def transposeImpl(
    xVals: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    perm: js.Array[Double],
    newShape: js.Array[Double]
  ): TypedArray = js.native
}

