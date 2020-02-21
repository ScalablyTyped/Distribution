package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "scatter_util")
@js.native
object scatterUtil extends js.Object {
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
  def validateInput(
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = js.native
  def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
}

