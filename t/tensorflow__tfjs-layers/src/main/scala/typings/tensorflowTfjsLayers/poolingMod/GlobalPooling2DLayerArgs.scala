package typings.tensorflowTfjsLayers.poolingMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalPooling2DLayerArgs extends LayerArgs {
  
  /**
    * One of `CHANNEL_LAST` (default) or `CHANNEL_FIRST`.
    *
    * The ordering of the dimensions in the inputs. `CHANNEL_LAST` corresponds
    * to inputs with shape `[batch, height, width, channels[` while
    * `CHANNEL_FIRST` corresponds to inputs with shape
    * `[batch, channels, height, width]`.
    */
  var dataFormat: js.UndefOr[DataFormat] = js.native
}
object GlobalPooling2DLayerArgs {
  
  @scala.inline
  def apply(): GlobalPooling2DLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPooling2DLayerArgs]
  }
  
  @scala.inline
  implicit class GlobalPooling2DLayerArgsOps[Self <: GlobalPooling2DLayerArgs] (val x: Self) extends AnyVal {
    
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
  }
}
