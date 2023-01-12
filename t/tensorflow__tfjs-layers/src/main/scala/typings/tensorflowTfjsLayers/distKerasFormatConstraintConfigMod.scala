package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.BaseSerialization
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatConstraintConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/constraint_config", "constraintClassNames")
  @js.native
  val constraintClassNames: js.Array[ConstraintClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/constraint_config.ConstraintSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm
  */
  trait ConstraintClassName extends StObject
  object ConstraintClassName {
    
    inline def MaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm = "MaxNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm]
    
    inline def MinMaxNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm = "MinMaxNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm]
    
    inline def NonNeg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg = "NonNeg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg]
    
    inline def UnitNorm: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm = "UnitNorm".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm]
  }
  
  type ConstraintSerialization = MaxNormSerialization | NonNegSerialization | UnitNormSerialization | MinMaxNormSerialization
  
  trait MaxNormConfig extends StObject {
    
    var axis: js.UndefOr[Double] = js.undefined
    
    var max_value: js.UndefOr[Double] = js.undefined
  }
  object MaxNormConfig {
    
    inline def apply(): MaxNormConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxNormConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxNormConfig] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setMax_value(value: Double): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
      
      inline def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    }
  }
  
  type MaxNormSerialization = BaseSerialization[MaxNorm, MaxNormConfig]
  
  trait MinMaxNormConfig extends StObject {
    
    var axis: js.UndefOr[Double] = js.undefined
    
    var max_value: js.UndefOr[Double] = js.undefined
    
    var min_value: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
  }
  object MinMaxNormConfig {
    
    inline def apply(): MinMaxNormConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinMaxNormConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinMaxNormConfig] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setMax_value(value: Double): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
      
      inline def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
      
      inline def setMin_value(value: Double): Self = StObject.set(x, "min_value", value.asInstanceOf[js.Any])
      
      inline def setMin_valueUndefined: Self = StObject.set(x, "min_value", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
  
  type MinMaxNormSerialization = BaseSerialization[MinMaxNorm, MinMaxNormConfig]
  
  type NonNegSerialization = BaseSerialization[NonNeg, Null]
  
  trait UnitNormConfig extends StObject {
    
    var axis: js.UndefOr[Double] = js.undefined
  }
  object UnitNormConfig {
    
    inline def apply(): UnitNormConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitNormConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnitNormConfig] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type UnitNormSerialization = BaseSerialization[UnitNorm, UnitNormConfig]
}
