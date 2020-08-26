package typings.tensorflowTfjsNode.mod.backendUtil

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "backend_util.nonMaxSuppressionV3")
@js.native
object nonMaxSuppressionV3 extends js.Object {
  def apply(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
}

