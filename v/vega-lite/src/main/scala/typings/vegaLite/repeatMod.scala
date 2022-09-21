package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns
import typings.vegaLite.specBaseMod.ResolveMixins
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specMod.NonNormalizedSpec
import typings.vegaLite.specUnitMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatMod {
  
  @JSImport("vega-lite/build/src/spec/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLayerRepeatSpec(spec: RepeatSpec): /* is vega-lite.vega-lite/build/src/spec/repeat.LayerRepeatSpec */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayerRepeatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/repeat.LayerRepeatSpec */ Boolean]
  
  inline def isRepeatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean]
  
  trait LayerRepeatMapping
    extends StObject
       with RepeatMapping {
    
    /**
      * An array of fields to be repeated as layers.
      */
    var layer: js.Array[String]
  }
  object LayerRepeatMapping {
    
    inline def apply(layer: js.Array[String]): LayerRepeatMapping = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerRepeatMapping]
    }
    
    extension [Self <: LayerRepeatMapping](x: Self) {
      
      inline def setLayer(value: js.Array[String]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerVarargs(value: String*): Self = StObject.set(x, "layer", js.Array(value*))
    }
  }
  
  trait LayerRepeatSpec
    extends StObject
       with BaseSpec
       with GenericCompositionLayoutWithColumns
       with ResolveMixins
       with RepeatSpec {
    
    /**
      * Definition for fields to be repeated. One of:
      * 1) An array of fields to be repeated. If `"repeat"` is an array, the field can be referred to as `{"repeat": "repeat"}`. The repeated views are laid out in a wrapped row. You can set the number of columns to control the wrapping.
      * 2) An object that maps `"row"` and/or `"column"` to the listed fields to be repeated along the particular orientations. The objects `{"repeat": "row"}` and `{"repeat": "column"}` can be used to refer to the repeated field respectively.
      */
    var repeat: LayerRepeatMapping
    
    /**
      * A specification of the view that gets repeated.
      */
    var spec: LayerSpec[Field] | UnitSpec[Field]
  }
  object LayerRepeatSpec {
    
    inline def apply(repeat: LayerRepeatMapping, spec: LayerSpec[Field] | UnitSpec[Field]): LayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerRepeatSpec]
    }
    
    extension [Self <: LayerRepeatSpec](x: Self) {
      
      inline def setRepeat(value: LayerRepeatMapping): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: LayerSpec[Field] | UnitSpec[Field]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  trait NonLayerRepeatSpec
    extends StObject
       with BaseSpec
       with GenericCompositionLayoutWithColumns
       with ResolveMixins
       with RepeatSpec {
    
    /**
      * Definition for fields to be repeated. One of:
      * 1) An array of fields to be repeated. If `"repeat"` is an array, the field can be referred to as `{"repeat": "repeat"}`. The repeated views are laid out in a wrapped row. You can set the number of columns to control the wrapping.
      * 2) An object that maps `"row"` and/or `"column"` to the listed fields to be repeated along the particular orientations. The objects `{"repeat": "row"}` and `{"repeat": "column"}` can be used to refer to the repeated field respectively.
      */
    var repeat: js.Array[String] | RepeatMapping
    
    /**
      * A specification of the view that gets repeated.
      */
    var spec: NonNormalizedSpec
  }
  object NonLayerRepeatSpec {
    
    inline def apply(repeat: js.Array[String] | RepeatMapping, spec: NonNormalizedSpec): NonLayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonLayerRepeatSpec]
    }
    
    extension [Self <: NonLayerRepeatSpec](x: Self) {
      
      inline def setRepeat(value: js.Array[String] | RepeatMapping): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatVarargs(value: String*): Self = StObject.set(x, "repeat", js.Array(value*))
      
      inline def setSpec(value: NonNormalizedSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepeatMapping extends StObject {
    
    /**
      * An array of fields to be repeated horizontally.
      */
    var column: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An array of fields to be repeated vertically.
      */
    var row: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RepeatMapping {
    
    inline def apply(): RepeatMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepeatMapping]
    }
    
    extension [Self <: RepeatMapping](x: Self) {
      
      inline def setColumn(value: js.Array[String]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setColumnVarargs(value: String*): Self = StObject.set(x, "column", js.Array(value*))
      
      inline def setRow(value: js.Array[String]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRowVarargs(value: String*): Self = StObject.set(x, "row", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.repeatMod.NonLayerRepeatSpec
    - typings.vegaLite.repeatMod.LayerRepeatSpec
  */
  trait RepeatSpec extends StObject
  object RepeatSpec {
    
    inline def LayerRepeatSpec(repeat: LayerRepeatMapping, spec: LayerSpec[Field] | UnitSpec[Field]): typings.vegaLite.repeatMod.LayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.repeatMod.LayerRepeatSpec]
    }
    
    inline def NonLayerRepeatSpec(repeat: js.Array[String] | RepeatMapping, spec: NonNormalizedSpec): typings.vegaLite.repeatMod.NonLayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.repeatMod.NonLayerRepeatSpec]
    }
  }
}
