package typings.tensorflowTfjsCore.backendUtilMod

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "nonMaxSuppressionV5")
@js.native
object nonMaxSuppressionV5 extends js.Object {
  def apply(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NamedTensorMap = js.native
}

