package typings.tensorflowTfjsLayers.poolingMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pooling3DLayerArgs extends LayerArgs {
  /** The data format to use for the pooling layer. */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  /** The padding type to use for the pooling layer. */
  var padding: js.UndefOr[PaddingMode] = js.native
  /**
    * Factors by which to downscale in each dimension [depth, height, width].
    * Expects an integer or an array of 3 integers.
    *
    * For example, `[2, 2, 2]` will halve the input in three dimensions.
    * If only one integer is specified, the same window length
    * will be used for all dimensions.
    */
  var poolSize: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.native
  /**
    * The size of the stride in each dimension of the pooling window. Expects
    * an integer or an array of 3 integers. Integer, tuple of 3 integers, or
    * None.
    *
    * If `null`, defaults to `poolSize`.
    */
  var strides: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.native
}

object Pooling3DLayerArgs {
  @scala.inline
  def apply(): Pooling3DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pooling3DLayerArgs]
  }
  @scala.inline
  implicit class Pooling3DLayerArgsOps[Self <: Pooling3DLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataFormat(value: DataFormat): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    @scala.inline
    def setPadding(value: PaddingMode): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPoolSize(value: Double | (js.Tuple3[Double, Double, Double])): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    @scala.inline
    def setStrides(value: Double | (js.Tuple3[Double, Double, Double])): Self = this.set("strides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrides: Self = this.set("strides", js.undefined)
  }
  
}

