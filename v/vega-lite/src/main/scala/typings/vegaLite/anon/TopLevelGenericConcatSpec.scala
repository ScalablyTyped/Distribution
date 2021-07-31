package typings.vegaLite.anon

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.parameterMod.Parameter
import typings.vegaLite.repeatMod.RepeatSpec
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specMod._TopLevelSpec
import typings.vegaLite.specUnitMod.FacetedUnitSpec
import typings.vegaLite.srcResolveMod.Resolve
import typings.vegaLite.titleMod.TitleParams
import typings.vegaLite.toplevelMod.AutoSizeParams
import typings.vegaLite.toplevelMod.AutosizeType
import typings.vegaLite.toplevelMod.Padding
import typings.vegaLite.transformMod.Transform
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaLite.vegaSchemaMod.RowCol
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/concat.GenericConcatSpec<vega-lite.vega-lite/build/src/spec.GenericSpec<vega-lite.vega-lite/build/src/spec/unit.FacetedUnitSpec, vega-lite.vega-lite/build/src/spec/layer.LayerSpec, vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec, vega-lite.vega-lite/build/src/channeldef.Field>>> */
trait TopLevelGenericConcatSpec
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
  var background: js.UndefOr[typings.vegaTypings.colorMod.Color | ExprRef | SignalRef] = js.undefined
  
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
  var concat: js.Array[
    GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field]
  ]
  
  /**
    * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
    */
  var config: js.UndefOr[typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]] = js.undefined
  
  /**
    * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
    */
  var data: js.UndefOr[typings.vegaLite.srcDataMod.Data | Null] = js.undefined
  
  /**
    * A global data store for named datasets. This is a mapping from names to inline datasets.
    * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
    */
  var datasets: js.UndefOr[typings.vegaLite.toplevelMod.Datasets] = js.undefined
  
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
object TopLevelGenericConcatSpec {
  
  @scala.inline
  def apply(
    concat: js.Array[
      GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field]
    ]
  ): TopLevelGenericConcatSpec = {
    val __obj = js.Dynamic.literal(concat = concat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelGenericConcatSpec]
  }
  
  @scala.inline
  implicit class TopLevelGenericConcatSpecMutableBuilder[Self <: TopLevelGenericConcatSpec] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: typings.vegaTypings.colorMod.Color | ExprRef | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
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
    def setConcat(
      value: js.Array[
          GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field]
        ]
    ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcatVarargs(
      value: (GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field])*
    ): Self = StObject.set(x, "concat", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setData(value: typings.vegaLite.srcDataMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDatasets(value: typings.vegaLite.toplevelMod.Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
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
