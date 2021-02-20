package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization
import typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizationSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/normalization_serialization", "normalizationLayerClassNames")
  @js.native
  val normalizationLayerClassNames: js.Array[NormalizationLayerClassName] = js.native
  
  @js.native
  trait BatchNormalizationLayerConfig extends LayerConfig {
    
    var axis: js.UndefOr[Double] = js.native
    
    var beta_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var beta_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var beta_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var center: js.UndefOr[Boolean] = js.native
    
    var epsilon: js.UndefOr[Double] = js.native
    
    var gamma_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var gamma_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var gamma_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var momentum: js.UndefOr[Double] = js.native
    
    var moving_mean_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var moving_variance_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var scale: js.UndefOr[Boolean] = js.native
  }
  object BatchNormalizationLayerConfig {
    
    @scala.inline
    def apply(): BatchNormalizationLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchNormalizationLayerConfig]
    }
    
    @scala.inline
    implicit class BatchNormalizationLayerConfigMutableBuilder[Self <: BatchNormalizationLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setBeta_constraint(value: ConstraintSerialization): Self = StObject.set(x, "beta_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta_constraintUndefined: Self = StObject.set(x, "beta_constraint", js.undefined)
      
      @scala.inline
      def setBeta_initializer(value: InitializerSerialization): Self = StObject.set(x, "beta_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta_initializerUndefined: Self = StObject.set(x, "beta_initializer", js.undefined)
      
      @scala.inline
      def setBeta_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "beta_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta_regularizerUndefined: Self = StObject.set(x, "beta_regularizer", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      @scala.inline
      def setGamma_constraint(value: ConstraintSerialization): Self = StObject.set(x, "gamma_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamma_constraintUndefined: Self = StObject.set(x, "gamma_constraint", js.undefined)
      
      @scala.inline
      def setGamma_initializer(value: InitializerSerialization): Self = StObject.set(x, "gamma_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamma_initializerUndefined: Self = StObject.set(x, "gamma_initializer", js.undefined)
      
      @scala.inline
      def setGamma_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "gamma_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamma_regularizerUndefined: Self = StObject.set(x, "gamma_regularizer", js.undefined)
      
      @scala.inline
      def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      @scala.inline
      def setMoving_mean_initializer(value: InitializerSerialization): Self = StObject.set(x, "moving_mean_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoving_mean_initializerUndefined: Self = StObject.set(x, "moving_mean_initializer", js.undefined)
      
      @scala.inline
      def setMoving_variance_initializer(value: InitializerSerialization): Self = StObject.set(x, "moving_variance_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoving_variance_initializerUndefined: Self = StObject.set(x, "moving_variance_initializer", js.undefined)
      
      @scala.inline
      def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  type BatchNormalizationLayerSerialization = BaseLayerSerialization[BatchNormalization, BatchNormalizationLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/normalization_serialization.NormalizationLayerSerialization['class_name'] */
  type NormalizationLayerClassName = BatchNormalization
  
  type NormalizationLayerSerialization = BatchNormalizationLayerSerialization
}
