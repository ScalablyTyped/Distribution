package typings.tensorflowTfjsLayers.paddingMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "spatial2dPadding")
@js.native
object spatial2dPadding extends js.Object {
  def apply(x: Tensor[Rank]): Tensor[Rank] = js.native
  def apply(x: Tensor[Rank], padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Tensor[Rank] = js.native
  def apply(
    x: Tensor[Rank],
    padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
}

