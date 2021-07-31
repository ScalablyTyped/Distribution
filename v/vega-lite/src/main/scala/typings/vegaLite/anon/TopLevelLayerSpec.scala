package typings.vegaLite.anon

import typings.vegaLite.compositemarkMod.SharedCompositeEncoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.parameterMod.Parameter
import typings.vegaLite.projectionMod.Projection
import typings.vegaLite.specBaseMod.ViewBackground
import typings.vegaLite.specLayerMod.LayerSpec
import typings.vegaLite.specMod._TopLevelSpec
import typings.vegaLite.specUnitMod.UnitSpec
import typings.vegaLite.srcResolveMod.Resolve
import typings.vegaLite.titleMod.TitleParams
import typings.vegaLite.toplevelMod.AutoSizeParams
import typings.vegaLite.toplevelMod.AutosizeType
import typings.vegaLite.toplevelMod.Padding
import typings.vegaLite.transformMod.Transform
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.container
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/layer.LayerSpec> */
trait TopLevelLayerSpec
  extends StObject
     with _TopLevelSpec {
  
  /**
    * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v4.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
    * @format uri
    */
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
  var background: js.UndefOr[typings.vegaTypings.colorMod.Color | ExprRef | SignalRef] = js.undefined
  
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
    * A shared key-value mapping between encoding channels and definition of fields in the underlying layers.
    */
  var encoding: js.UndefOr[SharedCompositeEncoding[typings.vegaLite.channeldefMod.Field]] = js.undefined
  
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
    * Layer or single view specifications to be layered.
    *
    * __Note__: Specifications inside `layer` cannot use `row` and `column` channels as layering facet specifications is not allowed. Instead, use the [facet operator](https://vega.github.io/vega-lite/docs/facet.html) and place a layer inside a facet.
    */
  var layer: js.Array[LayerSpec | UnitSpec]
  
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
    * An object defining properties of the geographic projection shared by underlying layers.
    */
  var projection: js.UndefOr[Projection] = js.undefined
  
  /**
    * Scale, axis, and legend resolutions for view composition specifications.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
  
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
  
  /**
    * An object defining the view background's fill and stroke.
    *
    * __Default value:__ none (transparent)
    */
  var view: js.UndefOr[ViewBackground[ExprRef | SignalRef]] = js.undefined
  
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
object TopLevelLayerSpec {
  
  @scala.inline
  def apply(layer: js.Array[LayerSpec | UnitSpec]): TopLevelLayerSpec = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelLayerSpec]
  }
  
  @scala.inline
  implicit class TopLevelLayerSpecMutableBuilder[Self <: TopLevelLayerSpec] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: SharedCompositeEncoding[typings.vegaLite.channeldefMod.Field]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | container | typings.vegaLite.specBaseMod.Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLayer(value: js.Array[LayerSpec | UnitSpec]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerVarargs(value: (LayerSpec | UnitSpec)*): Self = StObject.set(x, "layer", js.Array(value :_*))
    
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
    def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
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
    
    @scala.inline
    def setView(value: ViewBackground[ExprRef | SignalRef]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | container | typings.vegaLite.specBaseMod.Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
