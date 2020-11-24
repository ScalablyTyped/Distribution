package typings.tensorflowTfjsLayers.convolutionalDepthwiseSerializationMod

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.convolutionalSerializationMod.BaseConvLayerConfig
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthwiseConv2DLayerConfig extends BaseConvLayerConfig {
  
  var depth_multiplier: js.UndefOr[Double] = js.native
  
  var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
  
  var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.native
  
  var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  
  @JSName("kernel_size")
  var kernel_size_DepthwiseConv2DLayerConfig: Double | (js.Tuple2[Double, Double]) = js.native
}
object DepthwiseConv2DLayerConfig {
  
  @scala.inline
  def apply(kernel_size: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerConfig = {
    val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthwiseConv2DLayerConfig]
  }
  
  @scala.inline
  implicit class DepthwiseConv2DLayerConfigOps[Self <: DepthwiseConv2DLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setKernel_size(value: Double | (js.Tuple2[Double, Double])): Self = this.set("kernel_size", value.asInstanceOf[js.Any])
    
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
  }
}
