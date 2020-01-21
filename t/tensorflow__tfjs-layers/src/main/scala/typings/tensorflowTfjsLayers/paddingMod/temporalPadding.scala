package typings.tensorflowTfjsLayers.paddingMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "temporalPadding")
@js.native
object temporalPadding extends js.Object {
  def apply(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], padding: js.Tuple2[Double, Double]): Tensor_[Rank] = js.native
}

