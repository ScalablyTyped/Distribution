package typings.vegaLite

import typings.std.Record
import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.compositemarkMod.CompositeEncoding
import typings.vegaLite.compositemarkMod.FacetedCompositeEncoding
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.parameterMod.Parameter
import typings.vegaLite.projectionMod.Projection
import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specBaseMod.DeprecatedFrameMixins
import typings.vegaLite.specBaseMod.FrameMixins
import typings.vegaLite.specBaseMod.GenericCompositionLayout
import typings.vegaLite.specBaseMod.ResolveMixins
import typings.vegaLite.specBaseMod.Step
import typings.vegaLite.specBaseMod.ViewBackground
import typings.vegaLite.specMod._TopLevelSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcDataMod.Data
import typings.vegaLite.srcMarkMod.AnyMark
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaLite.srcResolveMod.Resolve
import typings.vegaLite.srcSelectionMod.SelectionDef
import typings.vegaLite.titleMod.TitleParams
import typings.vegaLite.toplevelMod.AutoSizeParams
import typings.vegaLite.toplevelMod.AutosizeType
import typings.vegaLite.toplevelMod.Datasets
import typings.vegaLite.toplevelMod.Padding
import typings.vegaLite.transformMod.Transform
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.container
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaLite.vegaSchemaMod.RowCol
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specUnitMod {
  
  @JSImport("vega-lite/build/src/spec/unit", "isUnitSpec")
  @js.native
  def isUnitSpec(spec: BaseSpec): Boolean = js.native
  
  type FacetedUnitSpec = (GenericUnitSpec[FacetedCompositeEncoding[Field], AnyMark]) with ResolveMixins with GenericCompositionLayout with (FrameMixins[ExprRef | SignalRef])
  
  @js.native
  trait GenericUnitSpec[E /* <: Encoding[_] */, M] extends BaseSpec {
    
    /**
      * A key-value mapping between encoding channels and definition of fields.
      */
    var encoding: js.UndefOr[E] = js.native
    
    /**
      * A string describing the mark type (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
      * `"area"`, `"point"`, `"rule"`, `"geoshape"`, and `"text"`) or a [mark definition object](https://vega.github.io/vega-lite/docs/mark.html#mark-def).
      */
    var mark: M = js.native
    
    /**
      * An object defining properties of geographic projection, which will be applied to `shape` path for `"geoshape"` marks
      * and to `latitude` and `"longitude"` channels for other marks.
      */
    var projection: js.UndefOr[Projection] = js.native
    
    /**
      * A key-value mapping between selection names and definitions.
      */
    var selection: js.UndefOr[Record[String, SelectionDef]] = js.native
  }
  object GenericUnitSpec {
    
    @scala.inline
    def apply[E /* <: Encoding[_] */, M](mark: M): GenericUnitSpec[E, M] = {
      val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericUnitSpec[E, M]]
    }
    
    @scala.inline
    implicit class GenericUnitSpecMutableBuilder[Self <: GenericUnitSpec[_, _], E /* <: Encoding[_] */, M] (val x: Self with (GenericUnitSpec[E, M])) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: E): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setMark(value: M): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setSelection(value: Record[String, SelectionDef]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    }
  }
  
  type NormalizedUnitSpec = GenericUnitSpec[Encoding[FieldName], Mark | (MarkDef[Mark, ExprRef | SignalRef])]
  
  /* Inlined vega-lite.vega-lite/build/src/spec/toplevel.TopLevel<vega-lite.vega-lite/build/src/spec/unit.FacetedUnitSpec> & vega-lite.vega-lite/build/src/spec/base.DataMixins */
  @js.native
  trait TopLevelUnitSpec extends _TopLevelSpec {
    
    /**
      * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v4.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
      * @format uri
      */
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
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
    var align: js.UndefOr[LayoutAlign | RowCol[LayoutAlign]] = js.native
    
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
    var background: js.UndefOr[Color | ExprRef | SignalRef] = js.native
    
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
      * An object value of the form `{"row": boolean, "column": boolean}` can be used to supply different centering values for rows and columns.
      *
      * __Default value:__ `false`
      */
    var center: js.UndefOr[Boolean | RowCol[Boolean]] = js.native
    
    /**
      * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
      */
    var config: js.UndefOr[Config[ExprRef | SignalRef]] = js.native
    
    /**
      * An object describing the data source. Set to `null` to ignore the parent's data source. If no data is set, it is derived from the parent.
      */
    /**
      * An object describing the data source.
      */
    var data: (js.UndefOr[Data | Null]) with Data = js.native
    
    /**
      * A global data store for named datasets. This is a mapping from names to inline datasets.
      * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
      */
    var datasets: js.UndefOr[Datasets] = js.native
    
    /**
      * Description of this mark for commenting purpose.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * A key-value mapping between encoding channels and definition of fields.
      */
    var encoding: js.UndefOr[FacetedCompositeEncoding[Field]] = js.native
    
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
    var height: js.UndefOr[Double | container | Step] = js.native
    
    /**
      * A string describing the mark type (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
      * `"area"`, `"point"`, `"rule"`, `"geoshape"`, and `"text"`) or a [mark definition object](https://vega.github.io/vega-lite/docs/mark.html#mark-def).
      */
    var mark: AnyMark = js.native
    
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
      * An object defining properties of geographic projection, which will be applied to `shape` path for `"geoshape"` marks
      * and to `latitude` and `"longitude"` channels for other marks.
      */
    var projection: js.UndefOr[Projection] = js.native
    
    /**
      * Scale, axis, and legend resolutions for view composition specifications.
      */
    var resolve: js.UndefOr[Resolve] = js.native
    
    /**
      * A key-value mapping between selection names and definitions.
      */
    var selection: js.UndefOr[Record[String, SelectionDef]] = js.native
    
    /**
      * The spacing in pixels between sub-views of the composition operator.
      * An object of the form `{"row": number, "column": number}` can be used to set
      * different spacing values for rows and columns.
      *
      * __Default value__: Depends on `"spacing"` property of [the view composition configuration](https://vega.github.io/vega-lite/docs/config.html#view-config) (`20` by default)
      */
    var spacing: js.UndefOr[Double | RowCol[Double]] = js.native
    
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
    
    /**
      * An object defining the view background's fill and stroke.
      *
      * __Default value:__ none (transparent)
      */
    var view: js.UndefOr[ViewBackground[ExprRef | SignalRef]] = js.native
    
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
    var width: js.UndefOr[Double | container | Step] = js.native
  }
  object TopLevelUnitSpec {
    
    @scala.inline
    def apply(data: (js.UndefOr[Data | Null]) with Data, mark: AnyMark): TopLevelUnitSpec = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelUnitSpec]
    }
    
    @scala.inline
    implicit class TopLevelUnitSpecMutableBuilder[Self <: TopLevelUnitSpec] (val x: Self) extends AnyVal {
      
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
      def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setData(value: (js.UndefOr[Data | Null]) with Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasets(value: Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEncoding(value: FacetedCompositeEncoding[Field]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | container | Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMark(value: AnyMark): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
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
      def setSelection(value: Record[String, SelectionDef]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
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
      def setUsermeta(value: Dict[_]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
      
      @scala.inline
      def setView(value: ViewBackground[ExprRef | SignalRef]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | container | Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type UnitSpec = (GenericUnitSpec[CompositeEncoding[Field], AnyMark]) with DeprecatedFrameMixins
  
  type UnitSpecWithFrame = (GenericUnitSpec[CompositeEncoding[Field], AnyMark]) with (FrameMixins[ExprRef | SignalRef])
}
