package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpSampling2DLayerArgs extends LayerArgs {
  
  /**
    * Format of the data, which determines the ordering of the dimensions in
    * the inputs.
    *
    * `"channelsLast"` corresponds to inputs with shape
    *   `[batch, ..., channels]`
    *
    *  `"channelsFirst"` corresponds to inputs with shape `[batch, channels,
    * ...]`.
    *
    * Defaults to `"channelsLast"`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
  
  /**
    * The upsampling factors for rows and columns.
    *
    * Defaults to `[2, 2]`.
    */
  var size: js.UndefOr[js.Array[Double]] = js.native
}
object UpSampling2DLayerArgs {
  
  @scala.inline
  def apply(): UpSampling2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpSampling2DLayerArgs]
  }
  
  @scala.inline
  implicit class UpSampling2DLayerArgsOps[Self <: UpSampling2DLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
