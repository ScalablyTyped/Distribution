package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatConstraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.distKerasFormatInitializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatRegularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.distKerasFormatTopologyConfigMod.LayerConfig
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.BatchNormalization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatLayersNormalizationSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/normalization_serialization", "normalizationLayerClassNames")
  @js.native
  val normalizationLayerClassNames: js.Array[NormalizationLayerClassName] = js.native
  
  trait BatchNormalizationLayerConfig
    extends StObject
       with LayerConfig {
    
    var axis: js.UndefOr[Double] = js.undefined
    
    var beta_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var beta_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var beta_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var center: js.UndefOr[Boolean] = js.undefined
    
    var epsilon: js.UndefOr[Double] = js.undefined
    
    var gamma_constraint: js.UndefOr[ConstraintSerialization] = js.undefined
    
    var gamma_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var gamma_regularizer: js.UndefOr[RegularizerSerialization] = js.undefined
    
    var momentum: js.UndefOr[Double] = js.undefined
    
    var moving_mean_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var moving_variance_initializer: js.UndefOr[InitializerSerialization] = js.undefined
    
    var scale: js.UndefOr[Boolean] = js.undefined
  }
  object BatchNormalizationLayerConfig {
    
    inline def apply(): BatchNormalizationLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchNormalizationLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchNormalizationLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setBeta_constraint(value: ConstraintSerialization): Self = StObject.set(x, "beta_constraint", value.asInstanceOf[js.Any])
      
      inline def setBeta_constraintUndefined: Self = StObject.set(x, "beta_constraint", js.undefined)
      
      inline def setBeta_initializer(value: InitializerSerialization): Self = StObject.set(x, "beta_initializer", value.asInstanceOf[js.Any])
      
      inline def setBeta_initializerUndefined: Self = StObject.set(x, "beta_initializer", js.undefined)
      
      inline def setBeta_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "beta_regularizer", value.asInstanceOf[js.Any])
      
      inline def setBeta_regularizerUndefined: Self = StObject.set(x, "beta_regularizer", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      inline def setGamma_constraint(value: ConstraintSerialization): Self = StObject.set(x, "gamma_constraint", value.asInstanceOf[js.Any])
      
      inline def setGamma_constraintUndefined: Self = StObject.set(x, "gamma_constraint", js.undefined)
      
      inline def setGamma_initializer(value: InitializerSerialization): Self = StObject.set(x, "gamma_initializer", value.asInstanceOf[js.Any])
      
      inline def setGamma_initializerUndefined: Self = StObject.set(x, "gamma_initializer", js.undefined)
      
      inline def setGamma_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "gamma_regularizer", value.asInstanceOf[js.Any])
      
      inline def setGamma_regularizerUndefined: Self = StObject.set(x, "gamma_regularizer", js.undefined)
      
      inline def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      inline def setMoving_mean_initializer(value: InitializerSerialization): Self = StObject.set(x, "moving_mean_initializer", value.asInstanceOf[js.Any])
      
      inline def setMoving_mean_initializerUndefined: Self = StObject.set(x, "moving_mean_initializer", js.undefined)
      
      inline def setMoving_variance_initializer(value: InitializerSerialization): Self = StObject.set(x, "moving_variance_initializer", value.asInstanceOf[js.Any])
      
      inline def setMoving_variance_initializerUndefined: Self = StObject.set(x, "moving_variance_initializer", js.undefined)
      
      inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  type BatchNormalizationLayerSerialization = BaseLayerSerialization[BatchNormalization, BatchNormalizationLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/normalization_serialization.NormalizationLayerSerialization['class_name'] */
  type NormalizationLayerClassName = BatchNormalization
  
  type NormalizationLayerSerialization = BatchNormalizationLayerSerialization
}
