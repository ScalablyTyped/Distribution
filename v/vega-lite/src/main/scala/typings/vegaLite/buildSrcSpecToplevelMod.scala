package typings.vegaLite

import typings.vegaLite.anon.Bottom
import typings.vegaLite.buildSrcDataMod.InlineDataset
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcParameterMod.ParameterName
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecBaseMod.BaseSpec
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.vegaLiteStrings.content
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.padding
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpecToplevelMod {
  
  @JSImport("vega-lite/build/src/spec/toplevel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractTopLevelProperties(t: TopLevelProperties[ExprRef | SignalRef], includeParams: Boolean): TopLevelProperties[SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTopLevelProperties")(t.asInstanceOf[js.Any], includeParams.asInstanceOf[js.Any])).asInstanceOf[TopLevelProperties[SignalRef]]
  
  inline def getFitType(): FitType = ^.asInstanceOf[js.Dynamic].applyDynamic("getFitType")().asInstanceOf[FitType]
  inline def getFitType(sizeType: width | height): FitType = ^.asInstanceOf[js.Dynamic].applyDynamic("getFitType")(sizeType.asInstanceOf[js.Any]).asInstanceOf[FitType]
  
  inline def isFitType(autoSizeType: AutosizeType): /* is vega-lite.vega-lite/build/src/spec/toplevel.FitType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFitType")(autoSizeType.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/toplevel.FitType */ Boolean]
  
  trait AutoSizeParams extends StObject {
    
    /**
      * Determines how size calculation should be performed, one of `"content"` or `"padding"`. The default setting (`"content"`) interprets the width and height settings as the data rectangle (plotting) dimensions, to which padding is then added. In contrast, the `"padding"` setting includes the padding within the view size calculations, such that the width and height settings indicate the **total** intended size of the view.
      *
      * __Default value__: `"content"`
      */
    var contains: js.UndefOr[content | padding] = js.undefined
    
    /**
      * A boolean flag indicating if autosize layout should be re-calculated on every view update.
      *
      * __Default value__: `false`
      */
    var resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sizing format type. One of `"pad"`, `"fit"`, `"fit-x"`, `"fit-y"`,  or `"none"`. See the [autosize type](https://vega.github.io/vega-lite/docs/size.html#autosize) documentation for descriptions of each.
      *
      * __Default value__: `"pad"`
      */
    var `type`: js.UndefOr[AutosizeType] = js.undefined
  }
  object AutoSizeParams {
    
    inline def apply(): AutoSizeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoSizeParams]
    }
    
    extension [Self <: AutoSizeParams](x: Self) {
      
      inline def setContains(value: content | padding): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setType(value: AutosizeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.pad
    - typings.vegaLite.vegaLiteStrings.none
    - typings.vegaLite.vegaLiteStrings.fit
    - typings.vegaLite.vegaLiteStrings.`fit-x`
    - typings.vegaLite.vegaLiteStrings.`fit-y`
  */
  trait AutosizeType extends StObject
  object AutosizeType {
    
    inline def fit: typings.vegaLite.vegaLiteStrings.fit = "fit".asInstanceOf[typings.vegaLite.vegaLiteStrings.fit]
    
    inline def `fit-x`: typings.vegaLite.vegaLiteStrings.`fit-x` = "fit-x".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-x`]
    
    inline def `fit-y`: typings.vegaLite.vegaLiteStrings.`fit-y` = "fit-y".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-y`]
    
    inline def none: typings.vegaLite.vegaLiteStrings.none = "none".asInstanceOf[typings.vegaLite.vegaLiteStrings.none]
    
    inline def pad: typings.vegaLite.vegaLiteStrings.pad = "pad".asInstanceOf[typings.vegaLite.vegaLiteStrings.pad]
  }
  
  type Datasets = Dict[InlineDataset]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.fit
    - typings.vegaLite.vegaLiteStrings.`fit-x`
    - typings.vegaLite.vegaLiteStrings.`fit-y`
  */
  trait FitType extends StObject
  object FitType {
    
    inline def fit: typings.vegaLite.vegaLiteStrings.fit = "fit".asInstanceOf[typings.vegaLite.vegaLiteStrings.fit]
    
    inline def `fit-x`: typings.vegaLite.vegaLiteStrings.`fit-x` = "fit-x".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-x`]
    
    inline def `fit-y`: typings.vegaLite.vegaLiteStrings.`fit-y` = "fit-y".asInstanceOf[typings.vegaLite.vegaLiteStrings.`fit-y`]
  }
  
  type Padding = Double | Bottom
  
  type TopLevel[S /* <: BaseSpec */] = S & (TopLevelProperties[ExprRef | SignalRef]) & typings.vegaLite.anon.Datasets
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.buildSrcParameterMod.VariableParameter
    - typings.vegaLite.buildSrcSelectionMod.TopLevelSelectionParameter
  */
  trait TopLevelParameter extends StObject
  object TopLevelParameter {
    
    inline def TopLevelSelectionParameter(
      name: ParameterName,
      select: SelectionType | (/* import warning: importer.ImportType#apply Failed type conversion: T extends 'point' ? vega-lite.vega-lite/build/src/selection.PointSelectionConfig : T extends 'interval' ? vega-lite.vega-lite/build/src/selection.IntervalSelectionConfig : never */ js.Any)
    ): typings.vegaLite.buildSrcSelectionMod.TopLevelSelectionParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcSelectionMod.TopLevelSelectionParameter]
    }
    
    inline def VariableParameter(name: ParameterName): typings.vegaLite.buildSrcParameterMod.VariableParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcParameterMod.VariableParameter]
    }
  }
  
  trait TopLevelProperties[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * How the visualization size should be determined. If a string, should be one of `"pad"`, `"fit"` or `"none"`.
      * Object values can additionally specify parameters for content sizing and automatic resizing.
      *
      * __Default value__: `pad`
      */
    var autosize: js.UndefOr[AutosizeType | AutoSizeParams] = js.undefined
    
    /**
      * CSS color property to use as the background of the entire view.
      *
      * __Default value:__ `"white"`
      */
    var background: js.UndefOr[Color | ES] = js.undefined
    
    /**
      * The default visualization padding, in pixels, from the edge of the visualization canvas to the data rectangle. If a number, specifies padding for all sides.
      * If an object, the value should have the format `{"left": 5, "top": 5, "right": 5, "bottom": 5}` to specify padding for each side of the visualization.
      *
      * __Default value__: `5`
      */
    var padding: js.UndefOr[Padding | ES] = js.undefined
    
    /**
      * Dynamic variables or selections that parameterize a visualization.
      */
    var params: js.UndefOr[js.Array[TopLevelParameter]] = js.undefined
  }
  object TopLevelProperties {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): TopLevelProperties[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TopLevelProperties[ES]]
    }
    
    extension [Self <: TopLevelProperties[?], ES /* <: ExprRef | SignalRef */](x: Self & TopLevelProperties[ES]) {
      
      inline def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      inline def setBackground(value: Color | ES): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setPadding(value: Padding | ES): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setParams(value: js.Array[TopLevelParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: TopLevelParameter*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
}
