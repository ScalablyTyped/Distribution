package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cropping2DLayerArgs extends LayerArgs {
  
  /**
    * Dimension of the cropping along the width and the height.
    * - If integer: the same symmetric cropping
    *  is applied to width and height.
    * - If list of 2 integers:
    *   interpreted as two different
    *   symmetric cropping values for height and width:
    *   `[symmetric_height_crop, symmetric_width_crop]`.
    * - If a list of 2 list of 2 integers:
    *   interpreted as
    *   `[[top_crop, bottom_crop], [left_crop, right_crop]]`
    */
  var cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]) = js.native
  
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `channels_last` corresponds to inputs with shape
    *   `(batch, ..., channels)`
    *
    * `channels_first` corresponds to inputs with shape
    *   `(batch, channels, ...)`
    *
    * Defaults to `channels_last`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
}
object Cropping2DLayerArgs {
  
  @scala.inline
  def apply(
    cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
  ): Cropping2DLayerArgs = {
    val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropping2DLayerArgs]
  }
  
  @scala.inline
  implicit class Cropping2DLayerArgsOps[Self <: Cropping2DLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setCropping(
      value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Self = this.set("cropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
  }
}
