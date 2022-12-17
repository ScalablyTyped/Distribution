package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcDataMod.Data
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcResolveMod.Resolve
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecBaseMod.BaseSpec
import typings.vegaLite.buildSrcSpecConcatMod.GenericConcatSpec
import typings.vegaLite.buildSrcSpecConcatMod.GenericHConcatSpec
import typings.vegaLite.buildSrcSpecConcatMod.GenericVConcatSpec
import typings.vegaLite.buildSrcSpecFacetMod.FacetFieldDef
import typings.vegaLite.buildSrcSpecFacetMod.FacetMapping
import typings.vegaLite.buildSrcSpecFacetMod.GenericFacetSpec
import typings.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typings.vegaLite.buildSrcSpecLayerMod.LayerSpec
import typings.vegaLite.buildSrcSpecRepeatMod.RepeatSpec
import typings.vegaLite.buildSrcSpecToplevelMod.AutoSizeParams
import typings.vegaLite.buildSrcSpecToplevelMod.AutosizeType
import typings.vegaLite.buildSrcSpecToplevelMod.Datasets
import typings.vegaLite.buildSrcSpecToplevelMod.Padding
import typings.vegaLite.buildSrcSpecToplevelMod.TopLevel
import typings.vegaLite.buildSrcSpecToplevelMod.TopLevelParameter
import typings.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.TopLevelUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.UnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.UnitSpecWithFrame
import typings.vegaLite.buildSrcTitleMod.TitleParams
import typings.vegaLite.buildSrcTransformMod.Transform
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.buildSrcVegaDotschemaMod.RowCol
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecLayoutMod.LayoutAlign
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpecMod {
  
  @JSImport("vega-lite/build/src/spec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAnyConcatSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFacetSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<any, any, any> */ Boolean]
  
  inline def isHConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<any> */ Boolean]
  
  inline def isLayerSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/layer.GenericLayerSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayerSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/layer.GenericLayerSpec<any> */ Boolean]
  
  inline def isRepeatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean]
  
  inline def isUnitSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<any> */ Boolean]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type GenericSpec = U | L | R | vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<U, L, F> | vega-lite.vega-lite/build/src/spec/concat.GenericConcatSpec<vega-lite.vega-lite/build/src/spec.GenericSpec<U, L, R, F>> | vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<vega-lite.vega-lite/build/src/spec.GenericSpec<U, L, R, F>> | vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<vega-lite.vega-lite/build/src/spec.GenericSpec<U, L, R, F>>
  }}}
  to avoid circular code involving: 
  - vega-lite.vega-lite/build/src/spec.GenericSpec
  */
  type GenericSpec[U /* <: GenericUnitSpec[Encoding[F], Any, SelectionParameter[SelectionType]] */, L /* <: GenericLayerSpec[U] */, R /* <: RepeatSpec */, F /* <: Field */] = U | L | R | (GenericFacetSpec[U, L, F]) | GenericConcatSpec[Any] | GenericVConcatSpec[Any] | GenericHConcatSpec[Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NonNormalizedSpec = vega-lite.vega-lite/build/src/spec.GenericSpec<vega-lite.vega-lite/build/src/spec/unit.FacetedUnitSpec<vega-lite.vega-lite/build/src/channeldef.Field, vega-lite.vega-lite/build/src/selection.SelectionParameter<vega-lite.vega-lite/build/src/selection.SelectionType>>, vega-lite.vega-lite/build/src/spec/layer.LayerSpec<vega-lite.vega-lite/build/src/channeldef.Field>, vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec, vega-lite.vega-lite/build/src/channeldef.Field>
  }}}
  to avoid circular code involving: 
  - vega-lite.vega-lite/build/src/spec.GenericSpec
  - vega-lite.vega-lite/build/src/spec.NonNormalizedSpec
  */
  type NonNormalizedSpec = Any
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NormalizedSpec = vega-lite.vega-lite/build/src/spec.GenericSpec<vega-lite.vega-lite/build/src/spec/unit.NormalizedUnitSpec, vega-lite.vega-lite/build/src/spec/layer.NormalizedLayerSpec, never, vega-lite.vega-lite/build/src/channeldef.FieldName>
  }}}
  to avoid circular code involving: 
  - vega-lite.vega-lite/build/src/spec.GenericSpec
  - vega-lite.vega-lite/build/src/spec.NormalizedSpec
  */
  type NormalizedSpec = Any
  
  /* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<vega-lite.vega-lite/build/src/spec/unit.UnitSpecWithFrame<vega-lite.vega-lite/build/src/channeldef.Field>, vega-lite.vega-lite/build/src/spec/layer.LayerSpec<vega-lite.vega-lite/build/src/channeldef.Field>, vega-lite.vega-lite/build/src/channeldef.Field>> & vega-lite.vega-lite/build/src/spec/base.DataMixins */
  trait TopLevelFacetSpec
    extends StObject
       with _TopLevelSpec {
    
    /**
      * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v5.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
      * @format uri
      */
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    /**
      * The alignment to apply to grid rows and columns.
      * The supported string values are `"all"`, `"each"`, and `"none"`.
      *
      * - For `"none"`, a flow layout will be used, in which adjacent subviews are simply placed one after the other.
      * - For `"each"`, subviews will be aligned into a clean grid structure, but each row or column may be of variable size.
      * - For `"all"`, subviews will be aligned and each row or column will be sized identically based on the maximum observed size. String values for this property will be applied to both grid rows and columns.
      *
      * Alternatively, an object value of the form `{"row": string, "column": string}` can be used to supply different alignments for rows and columns.
      *
      * __Default value:__ `"all"`.
      */
    var align: js.UndefOr[LayoutAlign | RowCol[LayoutAlign]] = js.undefined
    
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
    var background: js.UndefOr[Color | ExprRef | SignalRef] = js.undefined
    
    /**
      * The bounds calculation method to use for determining the extent of a sub-plot. One of `full` (the default) or `flush`.
      *
      * - If set to `full`, the entire calculated bounds (including axes, title, and legend) will be used.
      * - If set to `flush`, only the specified width and height values for the sub-view will be used. The `flush` setting can be useful when attempting to place sub-plots without axes or legends into a uniform grid structure.
      *
      * __Default value:__ `"full"`
      */
    var bounds: js.UndefOr[full | flush] = js.undefined
    
    /**
      * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
      *
      * An object value of the form `{"row": boolean, "column": boolean}` can be used to supply different centering values for rows and columns.
      *
      * __Default value:__ `false`
      */
    var center: js.UndefOr[Boolean | RowCol[Boolean]] = js.undefined
    
    /**
      * The number of columns to include in the view composition layout.
      *
      * __Default value__: `undefined` -- An infinite number of columns (a single row) will be assumed. This is equivalent to
      * `hconcat` (for `concat`) and to using the `column` channel (for `facet` and `repeat`).
      *
      * __Note__:
      *
      * 1) This property is only for:
      * - the general (wrappable) `concat` operator (not `hconcat`/`vconcat`)
      * - the `facet` and `repeat` operator with one field/repetition definition (without row/column nesting)
      *
      * 2) Setting the `columns` to `1` is equivalent to `vconcat` (for `concat`) and to using the `row` channel (for `facet` and `repeat`).
      */
    var columns: js.UndefOr[Double] = js.undefined
    
    /**
      * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
      */
    var config: js.UndefOr[Config[ExprRef | SignalRef]] = js.undefined
    
    /**
      * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
      */
    /**
      * An object describing the data source.
      */
    var data: js.UndefOr[Data | Null] = js.undefined
    
    /**
      * A global data store for named datasets. This is a mapping from names to inline datasets.
      * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
      */
    var datasets: js.UndefOr[Datasets] = js.undefined
    
    /**
      * Description of this mark for commenting purpose.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Definition for how to facet the data. One of:
      * 1) [a field definition for faceting the plot by one field](https://vega.github.io/vega-lite/docs/facet.html#field-def)
      * 2) [An object that maps `row` and `column` channels to their field definitions](https://vega.github.io/vega-lite/docs/facet.html#mapping)
      */
    var facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]])
    
    /**
      * Name of the visualization for later reference.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The default visualization padding, in pixels, from the edge of the visualization canvas to the data rectangle. If a number, specifies padding for all sides.
      * If an object, the value should have the format `{"left": 5, "top": 5, "right": 5, "bottom": 5}` to specify padding for each side of the visualization.
      *
      * __Default value__: `5`
      */
    var padding: js.UndefOr[Padding | ExprRef | SignalRef] = js.undefined
    
    /**
      * Dynamic variables or selections that parameterize a visualization.
      */
    var params: js.UndefOr[js.Array[TopLevelParameter]] = js.undefined
    
    /**
      * Scale, axis, and legend resolutions for view composition specifications.
      */
    var resolve: js.UndefOr[Resolve] = js.undefined
    
    /**
      * The spacing in pixels between sub-views of the composition operator.
      * An object of the form `{"row": number, "column": number}` can be used to set
      * different spacing values for rows and columns.
      *
      * __Default value__: Depends on `"spacing"` property of [the view composition configuration](https://vega.github.io/vega-lite/docs/config.html#view-config) (`20` by default)
      */
    var spacing: js.UndefOr[Double | RowCol[Double]] = js.undefined
    
    /**
      * A specification of the view that gets faceted.
      */
    var spec: LayerSpec[Field] | UnitSpecWithFrame[Field]
    
    /**
      * Title for the plot.
      */
    var title: js.UndefOr[Text | (TitleParams[ExprRef | SignalRef])] = js.undefined
    
    /**
      * An array of data transformations such as filter and new field calculation.
      */
    var transform: js.UndefOr[js.Array[Transform]] = js.undefined
    
    /**
      * Optional metadata that will be passed to Vega.
      * This object is completely ignored by Vega and Vega-Lite and can be used for custom metadata.
      */
    var usermeta: js.UndefOr[Dict[Any]] = js.undefined
  }
  object TopLevelFacetSpec {
    
    inline def apply(
      facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]]),
      spec: LayerSpec[Field] | UnitSpecWithFrame[Field]
    ): TopLevelFacetSpec = {
      val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelFacetSpec]
    }
    
    extension [Self <: TopLevelFacetSpec](x: Self) {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAlign(value: LayoutAlign | RowCol[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      inline def setBackground(value: Color | ExprRef | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCenter(value: Boolean | RowCol[Boolean]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatasets(value: Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFacet(
        value: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]])
      ): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: Padding | ExprRef | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setParams(value: js.Array[TopLevelParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: TopLevelParameter*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setSpacing(value: Double | RowCol[Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpec(value: LayerSpec[Field] | UnitSpecWithFrame[Field]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Text | (TitleParams[ExprRef | SignalRef])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setUsermeta(value: Dict[Any]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
      
      inline def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.buildSrcSpecUnitMod.TopLevelUnitSpec[typings.vegaLite.buildSrcChanneldefMod.Field]
    - typings.vegaLite.buildSrcSpecMod.TopLevelFacetSpec
    - typings.vegaLite.anon.TopLevelLayerSpecField
    - typings.vegaLite.buildSrcSpecToplevelMod.TopLevel[typings.vegaLite.buildSrcSpecRepeatMod.RepeatSpec]
    - typings.vegaLite.anon.TopLevelGenericConcatSpec
    - typings.vegaLite.anon.TopLevelGenericVConcatSpe
    - typings.vegaLite.anon.TopLevelGenericHConcatSpe
  */
  type TopLevelSpec = _TopLevelSpec | TopLevelUnitSpec[Field] | TopLevel[RepeatSpec]
  
  trait _TopLevelSpec extends StObject
  object _TopLevelSpec {
    
    inline def TopLevelFacetSpec(
      facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]]),
      spec: LayerSpec[Field] | UnitSpecWithFrame[Field]
    ): typings.vegaLite.buildSrcSpecMod.TopLevelFacetSpec = {
      val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.buildSrcSpecMod.TopLevelFacetSpec]
    }
    
    inline def TopLevelGenericConcatSpec(concat: js.Array[NonNormalizedSpec]): typings.vegaLite.anon.TopLevelGenericConcatSpec = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelGenericConcatSpec]
    }
    
    inline def TopLevelGenericHConcatSpe(hconcat: js.Array[NonNormalizedSpec]): typings.vegaLite.anon.TopLevelGenericHConcatSpe = {
      val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelGenericHConcatSpe]
    }
    
    inline def TopLevelGenericVConcatSpe(vconcat: js.Array[NonNormalizedSpec]): typings.vegaLite.anon.TopLevelGenericVConcatSpe = {
      val __obj = js.Dynamic.literal(vconcat = vconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelGenericVConcatSpe]
    }
    
    inline def TopLevelLayerSpecField(layer: js.Array[LayerSpec[Field] | UnitSpec[Field]]): typings.vegaLite.anon.TopLevelLayerSpecField = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelLayerSpecField]
    }
  }
}
