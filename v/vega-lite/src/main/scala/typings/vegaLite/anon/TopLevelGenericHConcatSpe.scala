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
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/concat.GenericHConcatSpec<vega-lite.vega-lite/build/src/spec.GenericSpec<vega-lite.vega-lite/build/src/spec/unit.FacetedUnitSpec, vega-lite.vega-lite/build/src/spec/layer.LayerSpec, vega-lite.vega-lite/build/src/spec/repeat.RepeatSpec, vega-lite.vega-lite/build/src/channeldef.Field>>> */
@js.native
trait TopLevelGenericHConcatSpe extends _TopLevelSpec {
  
  /**
    * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v4.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
    * @format uri
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  
  /**
    * How the visualization size should be determined. If a string, should be one of `"pad"`, `"fit"` or `"none"`.
    * Object values can additionally specify parameters for content sizing and automatic resizing.
    *
    * __Default value__: `pad`
    */
  var autosize: js.UndefOr[AutosizeType | AutoSizeParams] = js.native
  
  /**
    * CSS color property to use as the background of the entire view.
    *
    * __Default value:__ `"white"`
    */
  var background: js.UndefOr[typings.vegaTypings.colorMod.Color | ExprRef | SignalRef] = js.native
  
  /**
    * The bounds calculation method to use for determining the extent of a sub-plot. One of `full` (the default) or `flush`.
    *
    * - If set to `full`, the entire calculated bounds (including axes, title, and legend) will be used.
    * - If set to `flush`, only the specified width and height values for the sub-view will be used. The `flush` setting can be useful when attempting to place sub-plots without axes or legends into a uniform grid structure.
    *
    * __Default value:__ `"full"`
    */
  var bounds: js.UndefOr[full | flush] = js.native
  
  /**
    * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
    *
    * __Default value:__ `false`
    */
  var center: js.UndefOr[Boolean] = js.native
  
  /**
    * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
    */
  var config: js.UndefOr[typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]] = js.native
  
  /**
    * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
    */
  var data: js.UndefOr[typings.vegaLite.srcDataMod.Data | Null] = js.native
  
  /**
    * A global data store for named datasets. This is a mapping from names to inline datasets.
    * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
    */
  var datasets: js.UndefOr[typings.vegaLite.toplevelMod.Datasets] = js.native
  
  /**
    * Description of this mark for commenting purpose.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A list of views to be concatenated and put into a row.
    */
  var hconcat: js.Array[
    GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field]
  ] = js.native
  
  /**
    * Name of the visualization for later reference.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The default visualization padding, in pixels, from the edge of the visualization canvas to the data rectangle. If a number, specifies padding for all sides.
    * If an object, the value should have the format `{"left": 5, "top": 5, "right": 5, "bottom": 5}` to specify padding for each side of the visualization.
    *
    * __Default value__: `5`
    */
  var padding: js.UndefOr[Padding | ExprRef | SignalRef] = js.native
  
  /**
    * Dynamic variables that parameterize a visualization.
    */
  var params: js.UndefOr[js.Array[Parameter]] = js.native
  
  /**
    * Scale, axis, and legend resolutions for view composition specifications.
    */
  var resolve: js.UndefOr[Resolve] = js.native
  
  /**
    * The spacing in pixels between sub-views of the concat operator.
    *
    * __Default value__: `10`
    */
  var spacing: js.UndefOr[Double] = js.native
  
  /**
    * Title for the plot.
    */
  var title: js.UndefOr[Text | (TitleParams[ExprRef | SignalRef])] = js.native
  
  /**
    * An array of data transformations such as filter and new field calculation.
    */
  var transform: js.UndefOr[js.Array[Transform]] = js.native
  
  /**
    * Optional metadata that will be passed to Vega.
    * This object is completely ignored by Vega and Vega-Lite and can be used for custom metadata.
    */
  var usermeta: js.UndefOr[Dict[_]] = js.native
}
object TopLevelGenericHConcatSpe {
  
  @scala.inline
  def apply(
    hconcat: js.Array[
      GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field]
    ]
  ): TopLevelGenericHConcatSpe = {
    val __obj = js.Dynamic.literal(hconcat = hconcat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelGenericHConcatSpe]
  }
  
  @scala.inline
  implicit class TopLevelGenericHConcatSpeMutableBuilder[Self <: TopLevelGenericHConcatSpe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
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
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
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
    def setHconcat(
      value: js.Array[
          GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field]
        ]
    ): Self = StObject.set(x, "hconcat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHconcatVarargs(
      value: (GenericSpec[FacetedUnitSpec, LayerSpec, RepeatSpec, typings.vegaLite.channeldefMod.Field])*
    ): Self = StObject.set(x, "hconcat", js.Array(value :_*))
    
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
    def setUsermeta(value: Dict[_]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
  }
}
