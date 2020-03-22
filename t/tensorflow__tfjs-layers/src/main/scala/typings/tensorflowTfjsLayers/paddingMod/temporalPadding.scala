package typings.tensorflowTfjsLayers.paddingMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "temporalPadding")
@js.native
object temporalPadding extends js.Object {
  def apply(x: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], padding: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
}

