package typings.tensorflowTfjsLayers.convolutionalSerializationMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpSampling2DLayerConfig extends LayerConfig {
  
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
  
  var size: js.UndefOr[js.Array[Double]] = js.native
}
object UpSampling2DLayerConfig {
  
  @scala.inline
  def apply(): UpSampling2DLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpSampling2DLayerConfig]
  }
  
  @scala.inline
  implicit class UpSampling2DLayerConfigOps[Self <: UpSampling2DLayerConfig] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
