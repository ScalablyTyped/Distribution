package typings.vegaLite.anon

import typings.std.Record
import typings.vegaLite.exprMod.ExprOrSignalRef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.parameterMod.Parameter
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcDataMod.InlineDataset
import typings.vegaLite.srcResolveMod.Resolve
import typings.vegaLite.titleMod.TitleParams
import typings.vegaLite.toplevelMod.AutoSizeParams
import typings.vegaLite.toplevelMod.AutosizeType
import typings.vegaLite.toplevelMod.Padding
import typings.vegaLite.transformMod.Transform
import typings.vegaLite.vegaLiteStrings.container
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/spec.GenericHConcatSpec<vega-lite.vega-lite/build/src/spec.GenericSpec<vega-lite.vega-lite/build/src/spec.NormalizedUnitSpec, vega-lite.vega-lite/build/src/spec.NormalizedLayerSpec, never, string>> & vega-lite.vega-lite/build/src/spec/toplevel.TopLevelProperties<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef> & {  $schema :string | undefined,   config :vega-lite.vega-lite/build/src/config.Config<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef> | undefined,   datasets :std.Record<string, vega-lite.vega-lite/build/src/data.InlineDataset> | undefined,   usermeta :std.Record<string, unknown> | undefined} & vega-lite.vega-lite/build/src/spec.LayoutSizeMixins */
trait GenericHConcatSpecGeneric extends StObject {
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
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
  var background: js.UndefOr[typings.vegaTypings.colorMod.Color | ExprOrSignalRef] = js.undefined
  
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
    * __Default value:__ `false`
    */
  var center: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets a custom logger.
    */
  var config: js.UndefOr[typings.vegaLite.srcConfigMod.Config[ExprOrSignalRef]] = js.undefined
  
  /**
    * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
    */
  var data: js.UndefOr[typings.vegaLite.srcDataMod.Data | Null] = js.undefined
  
  var datasets: js.UndefOr[Record[String, InlineDataset]] = js.undefined
  
  /**
    * Description of this mark for commenting purpose.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A list of views to be concatenated and put into a row.
    */
  var hconcat: js.Array[GenericSpec[NormalizedUnitSpec, NormalizedLayerSpec, scala.Nothing, String]]
  
  /**
    * The height of a visualization.
    *
    * - For a plot with a continuous y-field, height should be a number.
    * - For a plot with either a discrete y-field or no y-field, height can be either a number indicating a fixed height or an object in the form of `{step: number}` defining the height per discrete step. (No y-field is equivalent to having one discrete step.)
    * - To enable responsive sizing on height, it should be set to `"container"`.
    *
    * __Default value:__ Based on `config.view.continuousHeight` for a plot with a continuous y-field and `config.view.discreteHeight` otherwise.
    *
    * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the height of a single view and the `"container"` option cannot be used.
    *
    * __See also:__ [`height`](https://vega.github.io/vega-lite/docs/size.html) documentation.
    */
  var height: js.UndefOr[Double | container | typings.vegaLite.specBaseMod.Step] = js.undefined
  
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
  var padding: js.UndefOr[Padding | ExprOrSignalRef] = js.undefined
  
  /**
    * Dynamic variables that parameterize a visualization.
    */
  var params: js.UndefOr[js.Array[Parameter]] = js.undefined
  
  /**
    * Scale, axis, and legend resolutions for view composition specifications.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
  
  /**
    * The spacing in pixels between sub-views of the concat operator.
    *
    * __Default value__: `10`
    */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Title for the plot.
    */
  var title: js.UndefOr[Text | (TitleParams[ExprRef | SignalRef])] = js.undefined
  
  /**
    * An array of data transformations such as filter and new field calculation.
    */
  var transform: js.UndefOr[js.Array[Transform]] = js.undefined
  
  var usermeta: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  /**
    * The width of a visualization.
    *
    * - For a plot with a continuous x-field, width should be a number.
    * - For a plot with either a discrete x-field or no x-field, width can be either a number indicating a fixed width or an object in the form of `{step: number}` defining the width per discrete step. (No x-field is equivalent to having one discrete step.)
    * - To enable responsive sizing on width, it should be set to `"container"`.
    *
    * __Default value:__
    * Based on `config.view.continuousWidth` for a plot with a continuous x-field and `config.view.discreteWidth` otherwise.
    *
    * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the width of a single view and the `"container"` option cannot be used.
    *
    * __See also:__ [`width`](https://vega.github.io/vega-lite/docs/size.html) documentation.
    */
  var width: js.UndefOr[Double | container | typings.vegaLite.specBaseMod.Step] = js.undefined
}
object GenericHConcatSpecGeneric {
  
  @scala.inline
  def apply(hconcat: js.Array[GenericSpec[NormalizedUnitSpec, NormalizedLayerSpec, scala.Nothing, String]]): GenericHConcatSpecGeneric = {
    val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericHConcatSpecGeneric]
  }
  
  @scala.inline
  implicit class GenericHConcatSpecGenericMutableBuilder[Self <: GenericHConcatSpecGeneric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    @scala.inline
    def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
    
    @scala.inline
    def setBackground(value: typings.vegaTypings.colorMod.Color | ExprOrSignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setConfig(value: typings.vegaLite.srcConfigMod.Config[ExprOrSignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setData(value: typings.vegaLite.srcDataMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDatasets(value: Record[String, InlineDataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHconcat(value: js.Array[GenericSpec[NormalizedUnitSpec, NormalizedLayerSpec, scala.Nothing, String]]): Self = StObject.set(x, "hconcat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHconcatVarargs(value: (GenericSpec[NormalizedUnitSpec, NormalizedLayerSpec, scala.Nothing, String])*): Self = StObject.set(x, "hconcat", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double | container | typings.vegaLite.specBaseMod.Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding | ExprOrSignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
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
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
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
    def setUsermeta(value: Record[String, js.Any]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | container | typings.vegaLite.specBaseMod.Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
