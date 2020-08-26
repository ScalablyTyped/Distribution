package typings.tensorflowTfjsLayers.poolingSerializationMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalPooling2DLayerConfig extends LayerConfig {
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
}

object GlobalPooling2DLayerConfig {
  @scala.inline
  def apply(): GlobalPooling2DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPooling2DLayerConfig]
  }
  @scala.inline
  implicit class GlobalPooling2DLayerConfigOps[Self <: GlobalPooling2DLayerConfig] (val x: Self) extends AnyVal {
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
    def setData_format(value: DataFormatSerialization): Self = this.set("data_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_format: Self = this.set("data_format", js.undefined)
  }
  
}

