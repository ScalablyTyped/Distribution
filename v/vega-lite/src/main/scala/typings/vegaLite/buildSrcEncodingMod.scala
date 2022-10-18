package typings.vegaLite

import typings.std.Record
import typings.vegaLite.anon.Bins
import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChannelMod.Channel
import typings.vegaLite.buildSrcChanneldefMod.ChannelDef
import typings.vegaLite.buildSrcChanneldefMod.ColorDef
import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcChanneldefMod.FieldDef
import typings.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typings.vegaLite.buildSrcChanneldefMod.LatLongDef
import typings.vegaLite.buildSrcChanneldefMod.NumericArrayMarkPropDef
import typings.vegaLite.buildSrcChanneldefMod.NumericMarkPropDef
import typings.vegaLite.buildSrcChanneldefMod.OffsetDef
import typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef
import typings.vegaLite.buildSrcChanneldefMod.OrderValueDef
import typings.vegaLite.buildSrcChanneldefMod.PolarDef
import typings.vegaLite.buildSrcChanneldefMod.Position2Def
import typings.vegaLite.buildSrcChanneldefMod.PositionDef
import typings.vegaLite.buildSrcChanneldefMod.ShapeDef
import typings.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typings.vegaLite.buildSrcChanneldefMod.StringFieldDefWithCondition
import typings.vegaLite.buildSrcChanneldefMod.StringValueDefWithCondition
import typings.vegaLite.buildSrcChanneldefMod.TextDef
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcSpecFacetMod.EncodingFacetMapping
import typings.vegaLite.buildSrcTypeMod.StandardType
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
import typings.vegaLite.vegaLiteStrings.xOffset
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaLiteStrings.y2
import typings.vegaLite.vegaLiteStrings.yOffset
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcEncodingMod {
  
  @JSImport("vega-lite/build/src/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def channelHasField[F /* <: Field */](
    encoding: EncodingWithFacet[F],
    channel: /* keyof vega-lite.vega-lite/build/src/encoding.EncodingWithFacet<F> */ x | y | xOffset | yOffset | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | color | fill | stroke | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | shape | detail | key | text | tooltip | href | url | description | order | facet | row | column
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("channelHasField")(encoding.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def channelHasFieldOrDatum[F /* <: Field */](
    encoding: EncodingWithFacet[F],
    channel: /* keyof vega-lite.vega-lite/build/src/encoding.EncodingWithFacet<F> */ x | y | xOffset | yOffset | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | color | fill | stroke | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | shape | detail | key | text | tooltip | href | url | description | order | facet | row | column
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("channelHasFieldOrDatum")(encoding.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def channelHasNestedOffsetScale[F /* <: Field */](
    encoding: EncodingWithFacet[F],
    channel: /* keyof vega-lite.vega-lite/build/src/encoding.EncodingWithFacet<F> */ x | y | xOffset | yOffset | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | color | fill | stroke | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | shape | detail | key | text | tooltip | href | url | description | order | facet | row | column
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("channelHasNestedOffsetScale")(encoding.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extractTransformsFromEncoding(oldEncoding: Encoding[Any], config: Config[ExprRef | SignalRef]): Bins = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTransformsFromEncoding")(oldEncoding.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Bins]
  
  inline def fieldDefs[F /* <: Field */](encoding: EncodingWithFacet[F]): js.Array[FieldDef[F, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldDefs")(encoding.asInstanceOf[js.Any]).asInstanceOf[js.Array[FieldDef[F, Any]]]
  
  inline def forEach[U /* <: Record[Any, Any] */](mapping: U, f: js.Function2[/* cd */ ChannelDef[String], /* keyof U */ /* c */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[U /* <: Record[Any, Any] */](
    mapping: U,
    f: js.Function2[/* cd */ ChannelDef[String], /* keyof U */ /* c */ String, Unit],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initEncoding(encoding: Encoding[String], mark: Mark, filled: Boolean, config: Config[ExprRef | SignalRef]): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initEncoding")(encoding.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], filled.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  
  inline def isAggregate(encoding: EncodingWithFacet[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregate")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def markChannelCompatible(encoding: Encoding[String], channel: Channel, mark: Mark): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("markChannelCompatible")(encoding.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalizeEncoding(encoding: Encoding[String], config: Config[ExprRef | SignalRef]): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEncoding")(encoding.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  
  inline def pathGroupingFields(mark: Mark, encoding: Encoding[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathGroupingFields")(mark.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def reduce_binned[T, U /* <: Record[Any, Any] */](
    mapping: U,
    f: js.Function3[
      /* acc */ Any, 
      /* fd */ TypedFieldDef[String, Any, Boolean | BinParams | binned | Null], 
      /* keyof U */ /* c */ String, 
      U
    ],
    init: T
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def reduce_binned[T, U /* <: Record[Any, Any] */](
    mapping: U,
    f: js.Function3[
      /* acc */ Any, 
      /* fd */ TypedFieldDef[String, Any, Boolean | BinParams | binned | Null], 
      /* keyof U */ /* c */ String, 
      U
    ],
    init: T,
    thisArg: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(mapping.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
      * Offset of x-position of the marks
      */
    var xOffset: js.UndefOr[OffsetDef[F, StandardType]] = js.undefined
    
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
    
    /**
      * Offset of y-position of the marks
      */
    var yOffset: js.UndefOr[OffsetDef[F, StandardType]] = js.undefined
  }
  object Encoding {
    
    inline def apply[F /* <: Field */](): Encoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding[F]]
    }
    
    extension [Self <: Encoding[?], F /* <: Field */](x: Self & Encoding[F]) {
      
      inline def setAngle(value: NumericMarkPropDef[F]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setColor(value: ColorDef[F]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDescription(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value*))
      
      inline def setFill(value: ColorDef[F]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHref(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setKey(value: FieldDefWithoutScale[F, StandardType]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLatitude(value: LatLongDef[F]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitude2(value: Position2Def[F]): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
      
      inline def setLatitude2Undefined: Self = StObject.set(x, "latitude2", js.undefined)
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: LatLongDef[F]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude2(value: Position2Def[F]): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
      
      inline def setLongitude2Undefined: Self = StObject.set(x, "longitude2", js.undefined)
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrder(value: OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: OrderFieldDef[F]*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setRadius(value: PolarDef[F]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadius2(value: Position2Def[F]): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setShape(value: ShapeDef[F]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: NumericMarkPropDef[F]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStroke(value: ColorDef[F]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDash(value: NumericArrayMarkPropDef[F]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      inline def setStrokeOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: NumericMarkPropDef[F]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setText(value: TextDef[F]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheta(value: PolarDef[F]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setTheta2(value: Position2Def[F]): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
      
      inline def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      inline def setTooltip(
        value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltipVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "tooltip", js.Array(value*))
      
      inline def setUrl(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setX(value: PositionDef[F]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Position2Def[F]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXOffset(value: OffsetDef[F, StandardType]): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: PositionDef[F]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Position2Def[F]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYOffset(value: OffsetDef[F, StandardType]): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
      
      inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait EncodingWithFacet[F /* <: Field */]
    extends StObject
       with Encoding[F]
       with EncodingFacetMapping[F, ExprRef | SignalRef]
  object EncodingWithFacet {
    
    inline def apply[F /* <: Field */](): EncodingWithFacet[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingWithFacet[F]]
    }
  }
}
