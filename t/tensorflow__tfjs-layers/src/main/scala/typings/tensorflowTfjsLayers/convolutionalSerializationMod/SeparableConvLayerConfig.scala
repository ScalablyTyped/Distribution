package typings.tensorflowTfjsLayers.convolutionalSerializationMod

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeparableConvLayerConfig extends ConvLayerConfig {
  
  var depth_multiplier: js.UndefOr[Double] = js.native
  
  var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
  
  var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.native
  
  var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  
  var pointwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
  
  var pointwise_initializer: js.UndefOr[InitializerSerialization] = js.native
  
  var pointwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
}
object SeparableConvLayerConfig {
  
  @scala.inline
  def apply(filters: Double, kernel_size: Double | js.Array[Double]): SeparableConvLayerConfig = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernel_size = kernel_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableConvLayerConfig]
  }
  
  @scala.inline
  implicit class SeparableConvLayerConfigOps[Self <: SeparableConvLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setDepth_multiplier(value: Double): Self = this.set("depth_multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth_multiplier: Self = this.set("depth_multiplier", js.undefined)
    
    @scala.inline
    def setDepthwise_constraint(value: ConstraintSerialization): Self = this.set("depthwise_constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthwise_constraint: Self = this.set("depthwise_constraint", js.undefined)
    
    @scala.inline
    def setDepthwise_initializer(value: InitializerSerialization): Self = this.set("depthwise_initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthwise_initializer: Self = this.set("depthwise_initializer", js.undefined)
    
    @scala.inline
    def setDepthwise_regularizer(value: RegularizerSerialization): Self = this.set("depthwise_regularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthwise_regularizer: Self = this.set("depthwise_regularizer", js.undefined)
    
    @scala.inline
    def setPointwise_constraint(value: ConstraintSerialization): Self = this.set("pointwise_constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointwise_constraint: Self = this.set("pointwise_constraint", js.undefined)
    
    @scala.inline
    def setPointwise_initializer(value: InitializerSerialization): Self = this.set("pointwise_initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointwise_initializer: Self = this.set("pointwise_initializer", js.undefined)
    
    @scala.inline
    def setPointwise_regularizer(value: RegularizerSerialization): Self = this.set("pointwise_regularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointwise_regularizer: Self = this.set("pointwise_regularizer", js.undefined)
  }
}
