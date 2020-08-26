package typings.tensorflowTfjsCore.backendUtilMod

import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "calculateShapes")
@js.native
object calculateShapes extends js.Object {
  def apply(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
}

