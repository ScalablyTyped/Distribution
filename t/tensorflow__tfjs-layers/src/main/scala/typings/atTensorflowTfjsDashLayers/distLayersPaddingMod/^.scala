package typings.atTensorflowTfjsDashLayers.distLayersPaddingMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/padding", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def spatial2dPadding(x: Tensor[Rank]): Tensor[Rank] = js.native
  def spatial2dPadding(x: Tensor[Rank], padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Tensor[Rank] = js.native
  def spatial2dPadding(
    x: Tensor[Rank],
    padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def temporalPadding(x: Tensor[Rank]): Tensor[Rank] = js.native
  def temporalPadding(x: Tensor[Rank], padding: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
}

