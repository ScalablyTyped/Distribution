package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.parameterMod.Parameter
import typings.vegaLite.repeatMod.RepeatSpec
import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specConcatMod.GenericConcatSpec
import typings.vegaLite.specConcatMod.GenericHConcatSpec
import typings.vegaLite.specConcatMod.GenericVConcatSpec
import typings.vegaLite.specFacetMod.FacetFieldDef
import typings.vegaLite.specFacetMod.FacetMapping
import typings.vegaLite.specFacetMod.GenericFacetSpec
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specUnitMod.FacetedUnitSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.specUnitMod.UnitSpec
import typings.vegaLite.specUnitMod.UnitSpecWithFrame
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcDataMod.Data
import typings.vegaLite.srcMarkMod.AnyMark
import typings.vegaLite.srcResolveMod.Resolve
import typings.vegaLite.titleMod.TitleParams
import typings.vegaLite.toplevelMod.AutoSizeParams
import typings.vegaLite.toplevelMod.AutosizeType
import typings.vegaLite.toplevelMod.Datasets
import typings.vegaLite.toplevelMod.Padding
import typings.vegaLite.toplevelMod.TopLevel
import typings.vegaLite.transformMod.Transform
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaLite.vegaSchemaMod.RowCol
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specMod {
  
  @JSImport("vega-lite/build/src/spec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isAnyConcatSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFacetSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFacetSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<any, any, any> */ Boolean]
  
  @scala.inline
  def isHConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<any> */ Boolean]
  
  @scala.inline
  def isLayerSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/layer.GenericLayerSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayerSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/layer.GenericLayerSpec<any> */ Boolean]
  
  @scala.inline
  def isRepeatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec */ Boolean]
  
  @scala.inline
  def isUnitSpec(spec: BaseSpec): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnitSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isVConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVConcatSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/concat.GenericVConcatSpec<any> */ Boolean]
  
  type GenericSpec[U /* <: GenericUnitSpec[js.Any, js.Any] */, L /* <: GenericLayerSpec[js.Any] */, R /* <: RepeatSpec */, F /* <: Field */] = U | L | R | (GenericFacetSpec[U, L, F]) | (GenericConcatSpec[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-lite.vega-lite/build/src/spec.GenericSpec<U, L, R, F> */ js.Object
  ]) | (GenericVConcatSpec[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-lite.vega-lite/build/src/spec.GenericSpec<U, L, R, F> */ js.Object
  ]) | (GenericHConcatSpec[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-lite.vega-lite/build/src/spec.GenericSpec<U, L, R, F> */ js.Object
  ])
  
  type NormalizedSpec = GenericSpec[NormalizedUnitSpec, NormalizedLayerSpec, scala.Nothing, FieldName]
  
  /* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<vega-lite.vega-lite/build/src/spec/unit.UnitSpecWithFrame, vega-lite.vega-lite/build/src/spec/layer.LayerSpec, vega-lite.vega-lite/build/src/channeldef.Field>> & vega-lite.vega-lite/build/src/spec/base.DataMixins */
  trait TopLevelFacetSpec
    extends StObject
       with _TopLevelSpec {
    
    /**
      * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v4.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
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
    var data: (js.UndefOr[Data | Null]) & Data
    
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
      * Dynamic variables that parameterize a visualization.
      */
    var params: js.UndefOr[js.Array[Parameter]] = js.undefined
    
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
    var spec: LayerSpec | UnitSpecWithFrame
    
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
    var usermeta: js.UndefOr[Dict[js.Any]] = js.undefined
  }
  object TopLevelFacetSpec {
    
    @scala.inline
    def apply(
      data: (js.UndefOr[Data | Null]) & Data,
      facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]]),
      spec: LayerSpec | UnitSpecWithFrame
    ): TopLevelFacetSpec = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelFacetSpec]
    }
    
    @scala.inline
    implicit class TopLevelFacetSpecMutableBuilder[Self <: TopLevelFacetSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAlign(value: LayoutAlign | RowCol[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      @scala.inline
      def setBackground(value: Color | ExprRef | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean | RowCol[Boolean]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setData(value: (js.UndefOr[Data | Null]) & Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasets(value: Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFacet(
        value: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]])
      ): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding | ExprRef | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setParams(value: js.Array[Parameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: Parameter*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double | RowCol[Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setSpec(value: LayerSpec | UnitSpecWithFrame): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: Text | (TitleParams[ExprRef | SignalRef])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value :_*))
      
      @scala.inline
      def setUsermeta(value: Dict[js.Any]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.specUnitMod.TopLevelUnitSpec
    - typings.vegaLite.specMod.TopLevelFacetSpec
    - typings.vegaLite.anon.TopLevelLayerSpec
    - typings.vegaLite.toplevelMod.TopLevel[typings.vegaLite.repeatMod.RepeatSpec]
    - typings.vegaLite.anon.TopLevelGenericConcatSpec
    - typings.vegaLite.anon.TopLevelGenericVConcatSpe
    - typings.vegaLite.anon.TopLevelGenericHConcatSpe
  */
  type TopLevelSpec = _TopLevelSpec | TopLevel[RepeatSpec]
  
  trait _TopLevelSpec extends StObject
  object _TopLevelSpec {
    
    @scala.inline
    def TopLevelFacetSpec(
      data: (js.UndefOr[Data | Null]) & Data,
      facet: (FacetFieldDef[Field, ExprRef | SignalRef]) | (FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]]),
      spec: LayerSpec | UnitSpecWithFrame
    ): typings.vegaLite.specMod.TopLevelFacetSpec = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.specMod.TopLevelFacetSpec]
    }
    
    @scala.inline
    def TopLevelGenericConcatSpec(concat: js.Array[GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, Field]]): typings.vegaLite.anon.TopLevelGenericConcatSpec = {
      val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelGenericConcatSpec]
    }
    
    @scala.inline
    def TopLevelGenericHConcatSpe(hconcat: js.Array[GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, Field]]): typings.vegaLite.anon.TopLevelGenericHConcatSpe = {
      val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelGenericHConcatSpe]
    }
    
    @scala.inline
    def TopLevelGenericVConcatSpe(vconcat: js.Array[GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, Field]]): typings.vegaLite.anon.TopLevelGenericVConcatSpe = {
      val __obj = js.Dynamic.literal(vconcat = vconcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelGenericVConcatSpe]
    }
    
    @scala.inline
    def TopLevelLayerSpec(layer: js.Array[LayerSpec | UnitSpec]): typings.vegaLite.anon.TopLevelLayerSpec = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.TopLevelLayerSpec]
    }
    
    @scala.inline
    def TopLevelUnitSpec(data: (js.UndefOr[Data | Null]) & Data, mark: AnyMark): typings.vegaLite.specUnitMod.TopLevelUnitSpec = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.specUnitMod.TopLevelUnitSpec]
    }
  }
}
