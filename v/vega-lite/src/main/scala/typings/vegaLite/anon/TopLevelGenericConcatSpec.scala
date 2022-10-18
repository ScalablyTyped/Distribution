package typings.vegaLite.anon

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcResolveMod.Resolve
import typings.vegaLite.buildSrcSpecMod.NonNormalizedSpec
import typings.vegaLite.buildSrcSpecMod._TopLevelSpec
import typings.vegaLite.buildSrcSpecToplevelMod.AutoSizeParams
import typings.vegaLite.buildSrcSpecToplevelMod.AutosizeType
import typings.vegaLite.buildSrcSpecToplevelMod.Padding
import typings.vegaLite.buildSrcSpecToplevelMod.TopLevelParameter
import typings.vegaLite.buildSrcTitleMod.TitleParams
import typings.vegaLite.buildSrcTransformMod.Transform
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.buildSrcVegaDotschemaMod.RowCol
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecLayoutMod.LayoutAlign
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/concat.GenericConcatSpec<vega-lite.vega-lite/build/src/spec.NonNormalizedSpec>> */
trait TopLevelGenericConcatSpec
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
  var background: js.UndefOr[typings.vegaTypings.typesSpecColorMod.Color | ExprRef | SignalRef] = js.undefined
  
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
    * A list of views to be concatenated.
    */
  var concat: js.Array[NonNormalizedSpec]
  
  /**
    * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
    */
  var config: js.UndefOr[typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]] = js.undefined
  
  /**
    * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
    */
  var data: js.UndefOr[typings.vegaLite.buildSrcDataMod.Data | Null] = js.undefined
  
  /**
    * A global data store for named datasets. This is a mapping from names to inline datasets.
    * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
    */
  var datasets: js.UndefOr[typings.vegaLite.buildSrcSpecToplevelMod.Datasets] = js.undefined
  
  /**
    * Description of this mark for commenting purpose.
    */
  var description: js.UndefOr[String] = js.undefined
  
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
object TopLevelGenericConcatSpec {
  
  inline def apply(concat: js.Array[NonNormalizedSpec]): TopLevelGenericConcatSpec = {
    val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelGenericConcatSpec]
  }
  
  extension [Self <: TopLevelGenericConcatSpec](x: Self) {
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setAlign(value: LayoutAlign | RowCol[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
    
    inline def setBackground(value: typings.vegaTypings.typesSpecColorMod.Color | ExprRef | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCenter(value: Boolean | RowCol[Boolean]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setConcat(value: js.Array[NonNormalizedSpec]): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    inline def setConcatVarargs(value: NonNormalizedSpec*): Self = StObject.set(x, "concat", js.Array(value*))
    
    inline def setConfig(value: typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: typings.vegaLite.buildSrcDataMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDatasets(value: typings.vegaLite.buildSrcSpecToplevelMod.Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
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
