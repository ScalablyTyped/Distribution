package typings.vegaLite

import typings.std.Record
import typings.vegaLite.anon.Bins
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.Channel
import typings.vegaLite.channeldefMod.ChannelDef
import typings.vegaLite.channeldefMod.ColorDef
import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldDef
import typings.vegaLite.channeldefMod.FieldDefWithoutScale
import typings.vegaLite.channeldefMod.LatLongDef
import typings.vegaLite.channeldefMod.NumericArrayMarkPropDef
import typings.vegaLite.channeldefMod.NumericMarkPropDef
import typings.vegaLite.channeldefMod.OrderFieldDef
import typings.vegaLite.channeldefMod.OrderValueDef
import typings.vegaLite.channeldefMod.PolarDef
import typings.vegaLite.channeldefMod.Position2Def
import typings.vegaLite.channeldefMod.PositionDef
import typings.vegaLite.channeldefMod.ShapeDef
import typings.vegaLite.channeldefMod.StringFieldDef
import typings.vegaLite.channeldefMod.StringFieldDefWithCondition
import typings.vegaLite.channeldefMod.StringValueDefWithCondition
import typings.vegaLite.channeldefMod.TextDef
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.specFacetMod.EncodingFacetMapping
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaLite.vegaLiteStrings.angle
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.color
import typings.vegaLite.vegaLiteStrings.column
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.detail
import typings.vegaLite.vegaLiteStrings.facet
import typings.vegaLite.vegaLiteStrings.fill
import typings.vegaLite.vegaLiteStrings.fillOpacity
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.key
import typings.vegaLite.vegaLiteStrings.latitude
import typings.vegaLite.vegaLiteStrings.latitude2
import typings.vegaLite.vegaLiteStrings.longitude
import typings.vegaLite.vegaLiteStrings.longitude2
import typings.vegaLite.vegaLiteStrings.opacity
import typings.vegaLite.vegaLiteStrings.order
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.radius2
import typings.vegaLite.vegaLiteStrings.row
import typings.vegaLite.vegaLiteStrings.shape
import typings.vegaLite.vegaLiteStrings.size
import typings.vegaLite.vegaLiteStrings.stroke
import typings.vegaLite.vegaLiteStrings.strokeDash
import typings.vegaLite.vegaLiteStrings.strokeOpacity
import typings.vegaLite.vegaLiteStrings.strokeWidth
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.theta2
import typings.vegaLite.vegaLiteStrings.tooltip
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.x2
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaLiteStrings.y2
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("vega-lite/build/src/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def channelHasField[F /* <: Field */](
    encoding: EncodingWithFacet[F],
    channel: /* keyof vega-lite.vega-lite/build/src/encoding.EncodingWithFacet<F> */ x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | color | fill | stroke | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | shape | detail | key | text | tooltip | href | url | description | order | facet | row | column
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("channelHasField")(encoding.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def extractTransformsFromEncoding(oldEncoding: Encoding[js.Any], config: Config[ExprRef | SignalRef]): Bins = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTransformsFromEncoding")(oldEncoding.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Bins]
  
  @scala.inline
  def fieldDefs[F /* <: Field */](encoding: EncodingWithFacet[F]): js.Array[FieldDef[F, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldDefs")(encoding.asInstanceOf[js.Any]).asInstanceOf[js.Array[FieldDef[F, js.Any]]]
  
  @scala.inline
  def forEach[U /* <: Record[js.Any, js.Any] */](mapping: U, f: js.Function2[/* cd */ ChannelDef[String], /* keyof U */ /* c */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach[U /* <: Record[js.Any, js.Any] */](
    mapping: U,
    f: js.Function2[/* cd */ ChannelDef[String], /* keyof U */ /* c */ String, Unit],
    thisArg: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def initEncoding(encoding: Encoding[String], mark: Mark, filled: Boolean, config: Config[ExprRef | SignalRef]): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initEncoding")(encoding.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], filled.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  
  @scala.inline
  def isAggregate(encoding: EncodingWithFacet[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregate")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def markChannelCompatible(encoding: Encoding[String], channel: Channel, mark: Mark): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("markChannelCompatible")(encoding.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def normalizeEncoding(encoding: Encoding[String], config: Config[ExprRef | SignalRef]): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEncoding")(encoding.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  
  @scala.inline
  def pathGroupingFields(mark: Mark, encoding: Encoding[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathGroupingFields")(mark.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def reduce_binned[T, U /* <: Record[js.Any, js.Any] */](
    mapping: U,
    f: js.Function3[
      /* acc */ js.Any, 
      /* fd */ TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null], 
      /* keyof U */ /* c */ String, 
      U
    ],
    init: T
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def reduce_binned[T, U /* <: Record[js.Any, js.Any] */](
    mapping: U,
    f: js.Function3[
      /* acc */ js.Any, 
      /* fd */ TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null], 
      /* keyof U */ /* c */ String, 
      U
    ],
    init: T,
    thisArg: js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait Encoding[F /* <: Field */] extends StObject {
    
    /**
      * Rotation angle of point and text marks.
      */
    var angle: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    /**
      * Color of the marks – either fill or stroke color based on  the `filled` property of mark definition.
      * By default, `color` represents fill color for `"area"`, `"bar"`, `"tick"`,
      * `"text"`, `"trail"`, `"circle"`, and `"square"` / stroke color for `"line"` and `"point"`.
      *
      * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `color` property.
      *
      * _Note:_
      * 1) For fine-grained control over both fill and stroke colors of the marks, please use the `fill` and `stroke` channels. The `fill` or `stroke` encodings have higher precedence than `color`, thus may override the `color` encoding if conflicting encodings are specified.
      * 2) See the scale documentation for more information about customizing [color scheme](https://vega.github.io/vega-lite/docs/scale.html#scheme).
      */
    var color: js.UndefOr[ColorDef[F]] = js.undefined
    
    /**
      * A text description of this mark for ARIA accessibility (SVG output only). For SVG output the `"aria-label"` attribute will be set to this description.
      */
    var description: js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])] = js.undefined
    
    /**
      * Additional levels of detail for grouping data in aggregate views and
      * in line, trail, and area marks without mapping data to a specific visual channel.
      */
    var detail: js.UndefOr[
        (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])
      ] = js.undefined
    
    /**
      * Fill color of the marks.
      * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `color` property.
      *
      * _Note:_ The `fill` encoding has higher precedence than `color`, thus may override the `color` encoding if conflicting encodings are specified.
      */
    var fill: js.UndefOr[ColorDef[F]] = js.undefined
    
    /**
      * Fill opacity of the marks.
      *
      * __Default value:__ If undefined, the default opacity depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `fillOpacity` property.
      */
    var fillOpacity: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    /**
      * A URL to load upon mouse click.
      */
    var href: js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])] = js.undefined
    
    /**
      * A data field to use as a unique key for data binding. When a visualization’s data is updated, the key value will be used to match data elements to existing mark instances. Use a key channel to enable object constancy for transitions over dynamic data.
      */
    var key: js.UndefOr[FieldDefWithoutScale[F, StandardType]] = js.undefined
    
    /**
      * Latitude position of geographically projected marks.
      */
    var latitude: js.UndefOr[LatLongDef[F]] = js.undefined
    
    /**
      * Latitude-2 position for geographically projected ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      */
    var latitude2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Longitude position of geographically projected marks.
      */
    var longitude: js.UndefOr[LatLongDef[F]] = js.undefined
    
    /**
      * Longitude-2 position for geographically projected ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      */
    var longitude2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Opacity of the marks.
      *
      * __Default value:__ If undefined, the default opacity depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `opacity` property.
      */
    var opacity: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    /**
      * Order of the marks.
      * - For stacked marks, this `order` channel encodes [stack order](https://vega.github.io/vega-lite/docs/stack.html#order).
      * - For line and trail marks, this `order` channel encodes order of data points in the lines. This can be useful for creating [a connected scatterplot](https://vega.github.io/vega-lite/examples/connected_scatterplot.html). Setting `order` to `{"value": null}` makes the line marks use the original order in the data sources.
      * - Otherwise, this `order` channel encodes layer order of the marks.
      *
      * __Note__: In aggregate plots, `order` field should be `aggregate`d to avoid creating additional aggregation grouping.
      */
    var order: js.UndefOr[OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef] = js.undefined
    
    /**
      * The outer radius in pixels of arc marks.
      */
    var radius: js.UndefOr[PolarDef[F]] = js.undefined
    
    /**
      * The inner radius in pixels of arc marks.
      */
    var radius2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Shape of the mark.
      *
      * 1. For `point` marks the supported values include:
      *   - plotting shapes: `"circle"`, `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, `"triangle-down"`, `"triangle-right"`, or `"triangle-left"`.
      *   - the line symbol `"stroke"`
      *   - centered directional shapes `"arrow"`, `"wedge"`, or `"triangle"`
      *   - a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) (For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.)
      *
      * 2. For `geoshape` marks it should be a field definition of the geojson data
      *
      * __Default value:__ If undefined, the default shape depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#point-config)'s `shape` property. (`"circle"` if unset.)
      */
    var shape: js.UndefOr[ShapeDef[F]] = js.undefined
    
    /**
      * Size of the mark.
      * - For `"point"`, `"square"` and `"circle"`, – the symbol size, or pixel area of the mark.
      * - For `"bar"` and `"tick"` – the bar and tick's size.
      * - For `"text"` – the text's font size.
      * - Size is unsupported for `"line"`, `"area"`, and `"rect"`. (Use `"trail"` instead of line with varying size)
      */
    var size: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    /**
      * Stroke color of the marks.
      * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `color` property.
      *
      * _Note:_ The `stroke` encoding has higher precedence than `color`, thus may override the `color` encoding if conflicting encodings are specified.
      */
    var stroke: js.UndefOr[ColorDef[F]] = js.undefined
    
    /**
      * Stroke dash of the marks.
      *
      * __Default value:__ `[1,0]` (No dash).
      */
    var strokeDash: js.UndefOr[NumericArrayMarkPropDef[F]] = js.undefined
    
    /**
      * Stroke opacity of the marks.
      *
      * __Default value:__ If undefined, the default opacity depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `strokeOpacity` property.
      */
    var strokeOpacity: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    /**
      * Stroke width of the marks.
      *
      * __Default value:__ If undefined, the default stroke width depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `strokeWidth` property.
      */
    var strokeWidth: js.UndefOr[NumericMarkPropDef[F]] = js.undefined
    
    /**
      * Text of the `text` mark.
      */
    var text: js.UndefOr[TextDef[F]] = js.undefined
    
    /**
      * - For arc marks, the arc length in radians if theta2 is not specified, otherwise the start arc angle. (A value of 0 indicates up or “north”, increasing values proceed clockwise.)
      *
      * - For text marks, polar coordinate angle in radians.
      */
    var theta: js.UndefOr[PolarDef[F]] = js.undefined
    
    /**
      * The end angle of arc marks in radians. A value of 0 indicates up or “north”, increasing values proceed clockwise.
      */
    var theta2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * The tooltip text to show upon mouse hover. Specifying `tooltip` encoding overrides [the `tooltip` property in the mark definition](https://vega.github.io/vega-lite/docs/mark.html#mark-def).
      *
      * See the [`tooltip`](https://vega.github.io/vega-lite/docs/tooltip.html) documentation for a detailed discussion about tooltip in Vega-Lite.
      */
    var tooltip: js.UndefOr[
        StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]] | Null
      ] = js.undefined
    
    /**
      * The URL of an image mark.
      */
    var url: js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])] = js.undefined
    
    /**
      * X coordinates of the marks, or width of horizontal `"bar"` and `"area"` without specified `x2` or `width`.
      *
      * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
      */
    var x: js.UndefOr[PositionDef[F]] = js.undefined
    
    /**
      * X2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      *
      * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
      */
    var x2: js.UndefOr[Position2Def[F]] = js.undefined
    
    /**
      * Y coordinates of the marks, or height of vertical `"bar"` and `"area"` without specified `y2` or `height`.
      *
      * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
      */
    var y: js.UndefOr[PositionDef[F]] = js.undefined
    
    /**
      * Y2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      *
      * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
      */
    var y2: js.UndefOr[Position2Def[F]] = js.undefined
  }
  object Encoding {
    
    @scala.inline
    def apply[F /* <: Field */](): Encoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding[F]]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding[?], F /* <: Field */] (val x: Self & Encoding[F]) extends AnyVal {
      
      @scala.inline
      def setAngle(value: NumericMarkPropDef[F]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setColor(value: ColorDef[F]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDescription(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: ColorDef[F]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHref(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: FieldDefWithoutScale[F, StandardType]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLatitude(value: LatLongDef[F]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2(value: Position2Def[F]): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2Undefined: Self = StObject.set(x, "latitude2", js.undefined)
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: LatLongDef[F]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2(value: Position2Def[F]): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2Undefined: Self = StObject.set(x, "longitude2", js.undefined)
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrder(value: OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: OrderFieldDef[F]*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setRadius(value: PolarDef[F]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2(value: Position2Def[F]): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setShape(value: ShapeDef[F]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: NumericMarkPropDef[F]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStroke(value: ColorDef[F]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDash(value: NumericArrayMarkPropDef[F]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: NumericMarkPropDef[F]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setText(value: TextDef[F]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheta(value: PolarDef[F]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta2(value: Position2Def[F]): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      @scala.inline
      def setTooltip(
        value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTooltipVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "tooltip", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setX(value: PositionDef[F]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Position2Def[F]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: PositionDef[F]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Position2Def[F]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait EncodingWithFacet[F /* <: Field */]
    extends StObject
       with Encoding[F]
       with EncodingFacetMapping[F, ExprRef | SignalRef]
  object EncodingWithFacet {
    
    @scala.inline
    def apply[F /* <: Field */](): EncodingWithFacet[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingWithFacet[F]]
    }
  }
}
