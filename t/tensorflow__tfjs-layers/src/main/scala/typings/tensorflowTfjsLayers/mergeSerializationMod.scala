package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
import typings.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization", "mergeLayerClassNames")
  @js.native
  val mergeLayerClassNames: js.Array[MergeLayerClassName] = js.native
  
  type AddLayerSerialization = BaseLayerSerialization[Add, LayerConfig]
  
  type AverageLayerSerialization = BaseLayerSerialization[Average, LayerConfig]
  
  trait ConcatenateLayerConfig
    extends StObject
       with LayerConfig {
    
    var axis: js.UndefOr[Double] = js.undefined
  }
  object ConcatenateLayerConfig {
    
    inline def apply(): ConcatenateLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcatenateLayerConfig]
    }
    
    extension [Self <: ConcatenateLayerConfig](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type ConcatenateLayerSerialization = BaseLayerSerialization[Concatenate, ConcatenateLayerConfig]
  
  trait DotLayerConfig
    extends StObject
       with LayerConfig {
    
    var axes: Double | (js.Tuple2[Double, Double])
    
    var normalize: js.UndefOr[Boolean] = js.undefined
  }
  object DotLayerConfig {
    
    inline def apply(axes: Double | (js.Tuple2[Double, Double])): DotLayerConfig = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotLayerConfig]
    }
    
    extension [Self <: DotLayerConfig](x: Self) {
      
      inline def setAxes(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type DotLayerSerialization = BaseLayerSerialization[Dot, DotLayerConfig]
  
  type MaximumLayerSerialization = BaseLayerSerialization[Maximum, LayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization.MergeLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
  */
  trait MergeLayerClassName extends StObject
  object MergeLayerClassName {
    
    inline def Add: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add = "Add".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add]
    
    inline def Average: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average = "Average".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average]
    
    inline def Concatenate: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate = "Concatenate".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate]
    
    inline def Dot: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot = "Dot".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot]
    
    inline def Maximum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum = "Maximum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum]
    
    inline def Minimum: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum = "Minimum".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum]
    
    inline def Multiply: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply = "Multiply".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply]
  }
  
  type MergeLayerSerialization = AddLayerSerialization | MultiplyLayerSerialization | AverageLayerSerialization | MaximumLayerSerialization | MinimumLayerSerialization | ConcatenateLayerSerialization | DotLayerSerialization
  
  type MinimumLayerSerialization = BaseLayerSerialization[Minimum, LayerConfig]
  
  type MultiplyLayerSerialization = BaseLayerSerialization[Multiply, LayerConfig]
}
