package typings.tensorflowTfjsLayers.paddingMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroPadding2DLayerArgs extends LayerArgs {
  /**
    * One of `'channelsLast'` (default) and `'channelsFirst'`.
    *
    * The ordering of the dimensions in the inputs.
    * `channelsLast` corresponds to inputs with shape
    * `[batch, height, width, channels]` while `channelsFirst`
    * corresponds to inputs with shape
    * `[batch, channels, height, width]`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  /**
    * Integer, or `Array` of 2 integers, or `Array` of 2 `Array`s, each of
    * which is an `Array` of 2 integers.
    * - If integer, the same symmetric padding is applied to width and height.
    * - If Array` of 2 integers, interpreted as two different symmetric values
    *   for height and width:
    *   `[symmetricHeightPad, symmetricWidthPad]`.
    * - If `Array` of 2 `Array`s, interpreted as:
    *   `[[topPad, bottomPad], [leftPad, rightPad]]`.
    */
  var padding: js.UndefOr[
    Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ] = js.native
}

object ZeroPadding2DLayerArgs {
  @scala.inline
  def apply(): ZeroPadding2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeroPadding2DLayerArgs]
  }
  @scala.inline
  implicit class ZeroPadding2DLayerArgsOps[Self <: ZeroPadding2DLayerArgs] (val x: Self) extends AnyVal {
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
    def setPadding(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

