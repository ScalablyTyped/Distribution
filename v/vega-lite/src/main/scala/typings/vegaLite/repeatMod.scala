package typings.vegaLite

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns
import typings.vegaLite.specBaseMod.ResolveMixins
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specUnitMod.FacetedUnitSpec
import typings.vegaLite.specUnitMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatMod {
  
  @JSImport("vega-lite/build/src/spec/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isLayerRepeatSpec(spec: RepeatSpec): /* is vega-lite.vega-lite/build/src/spec/repeat.LayerRepeatSpec */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayerRepeatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/repeat.LayerRepeatSpec */ Boolean]
  
  @scala.inline
  def isRepeatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean]
  
  trait LayerRepeatMapping
    extends StObject
       with RepeatMapping {
    
    /**
      * An array of fields to be repeated as layers.
      */
    var layer: js.Array[String]
  }
  object LayerRepeatMapping {
    
    @scala.inline
    def apply(layer: js.Array[String]): LayerRepeatMapping = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerRepeatMapping]
    }
    
    @scala.inline
    implicit class LayerRepeatMappingMutableBuilder[Self <: LayerRepeatMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayer(value: js.Array[String]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerVarargs(value: String*): Self = StObject.set(x, "layer", js.Array(value :_*))
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
    var spec: LayerSpec | UnitSpec
  }
  object LayerRepeatSpec {
    
    @scala.inline
    def apply(repeat: LayerRepeatMapping, spec: LayerSpec | UnitSpec): LayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerRepeatSpec]
    }
    
    @scala.inline
    implicit class LayerRepeatSpecMutableBuilder[Self <: LayerRepeatSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepeat(value: LayerRepeatMapping): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: LayerSpec | UnitSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
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
    var spec: GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, FieldName]
  }
  object NonLayerRepeatSpec {
    
    @scala.inline
    def apply(
      repeat: js.Array[String] | RepeatMapping,
      spec: GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, FieldName]
    ): NonLayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonLayerRepeatSpec]
    }
    
    @scala.inline
    implicit class NonLayerRepeatSpecMutableBuilder[Self <: NonLayerRepeatSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepeat(value: js.Array[String] | RepeatMapping): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatVarargs(value: String*): Self = StObject.set(x, "repeat", js.Array(value :_*))
      
      @scala.inline
      def setSpec(value: GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, FieldName]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): RepeatMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepeatMapping]
    }
    
    @scala.inline
    implicit class RepeatMappingMutableBuilder[Self <: RepeatMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: js.Array[String]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setColumnVarargs(value: String*): Self = StObject.set(x, "column", js.Array(value :_*))
      
      @scala.inline
      def setRow(value: js.Array[String]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      @scala.inline
      def setRowVarargs(value: String*): Self = StObject.set(x, "row", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.repeatMod.NonLayerRepeatSpec
    - typings.vegaLite.repeatMod.LayerRepeatSpec
  */
  trait RepeatSpec extends StObject
  object RepeatSpec {
    
    @scala.inline
    def LayerRepeatSpec(repeat: LayerRepeatMapping, spec: LayerSpec | UnitSpec): typings.vegaLite.repeatMod.LayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.repeatMod.LayerRepeatSpec]
    }
    
    @scala.inline
    def NonLayerRepeatSpec(
      repeat: js.Array[String] | RepeatMapping,
      spec: GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, FieldName]
    ): typings.vegaLite.repeatMod.NonLayerRepeatSpec = {
      val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.repeatMod.NonLayerRepeatSpec]
    }
  }
}
