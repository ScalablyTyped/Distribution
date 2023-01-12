package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatLayersConvolutionalSerializationMod.BaseConvLayerConfig
import typings.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersConvolutionalDepthwiseSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_depthwise_serialization", "convolutionalDepthwiseLayerClassNames")
  @js.native
  val convolutionalDepthwiseLayerClassNames: js.Array[ConvolutionalDepthwiseLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_depthwise_serialization.ConvolutionalDepthwiseLayerSerialization['class_name'] */
  type ConvolutionalDepthwiseLayerClassName = DepthwiseConv2D
  
  type ConvolutionalDepthwiseLayerSerialization = DepthwiseConv2DLayerSerialization
  
  trait DepthwiseConv2DLayerConfig
    extends StObject
       with BaseConvLayerConfig {
    
    var depth_multiplier: js.UndefOr[Double] = js.undefined
    
    var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    @JSName("kernel_size")
    var kernel_size_DepthwiseConv2DLayerConfig: Double | (js.Tuple2[Double, Double])
  }
  object DepthwiseConv2DLayerConfig {
    
    inline def apply(kernel_size: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerConfig = {
      val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepthwiseConv2DLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DepthwiseConv2DLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setDepth_multiplier(value: Double): Self = StObject.set(x, "depth_multiplier", value.asInstanceOf[js.Any])
      
      inline def setDepth_multiplierUndefined: Self = StObject.set(x, "depth_multiplier", js.undefined)
      
      inline def setDepthwise_constraint(value: ConstraintSerialization): Self = StObject.set(x, "depthwise_constraint", value.asInstanceOf[js.Any])
      
      inline def setDepthwise_constraintUndefined: Self = StObject.set(x, "depthwise_constraint", js.undefined)
      
      inline def setDepthwise_initializer(value: InitializerSerialization): Self = StObject.set(x, "depthwise_initializer", value.asInstanceOf[js.Any])
      
      inline def setDepthwise_initializerUndefined: Self = StObject.set(x, "depthwise_initializer", js.undefined)
      
      inline def setDepthwise_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "depthwise_regularizer", value.asInstanceOf[js.Any])
      
      inline def setDepthwise_regularizerUndefined: Self = StObject.set(x, "depthwise_regularizer", js.undefined)
      
      inline def setKernel_size(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "kernel_size", value.asInstanceOf[js.Any])
    }
  }
  
  type DepthwiseConv2DLayerSerialization = BaseLayerSerialization[DepthwiseConv2D, DepthwiseConv2DLayerConfig]
}
