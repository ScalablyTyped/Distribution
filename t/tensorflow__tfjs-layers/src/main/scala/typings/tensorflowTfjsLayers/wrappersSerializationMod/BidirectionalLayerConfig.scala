package typings.tensorflowTfjsLayers.wrappersSerializationMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.BidirectionalMergeMode
import typings.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidirectionalLayerConfig extends LayerConfig {
  
  var layer: RecurrentLayerSerialization = js.native
  
  var merge_mode: js.UndefOr[BidirectionalMergeMode] = js.native
}
object BidirectionalLayerConfig {
  
  @scala.inline
  def apply(layer: RecurrentLayerSerialization): BidirectionalLayerConfig = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidirectionalLayerConfig]
  }
  
  @scala.inline
  implicit class BidirectionalLayerConfigOps[Self <: BidirectionalLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setLayer(value: RecurrentLayerSerialization): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge_mode(value: BidirectionalMergeMode): Self = this.set("merge_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerge_mode: Self = this.set("merge_mode", js.undefined)
  }
}
