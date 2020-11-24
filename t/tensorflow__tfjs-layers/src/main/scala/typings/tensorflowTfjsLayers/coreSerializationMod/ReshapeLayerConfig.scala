package typings.tensorflowTfjsLayers.coreSerializationMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReshapeLayerConfig extends LayerConfig {
  
  var target_shape: Shape = js.native
}
object ReshapeLayerConfig {
  
  @scala.inline
  def apply(target_shape: Shape): ReshapeLayerConfig = {
    val __obj = js.Dynamic.literal(target_shape = target_shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerConfig]
  }
  
  @scala.inline
  implicit class ReshapeLayerConfigOps[Self <: ReshapeLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setTarget_shapeVarargs(value: (Null | Double)*): Self = this.set("target_shape", js.Array(value :_*))
    
    @scala.inline
    def setTarget_shape(value: Shape): Self = this.set("target_shape", value.asInstanceOf[js.Any])
  }
}
