package typings.tensorflowTfjsLayers.convolutionalSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvLayerConfig extends BaseConvLayerConfig {
  
  var filters: Double = js.native
}
object ConvLayerConfig {
  
  @scala.inline
  def apply(filters: Double, kernel_size: Double | js.Array[Double]): ConvLayerConfig = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernel_size = kernel_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvLayerConfig]
  }
  
  @scala.inline
  implicit class ConvLayerConfigOps[Self <: ConvLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setFilters(value: Double): Self = this.set("filters", value.asInstanceOf[js.Any])
  }
}
