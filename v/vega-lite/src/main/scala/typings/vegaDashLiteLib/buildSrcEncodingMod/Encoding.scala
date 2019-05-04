package typings
package vegaDashLiteLib.buildSrcEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding[F] extends js.Object {
  /**
    * Color of the marks – either fill or stroke color based on  the `filled` property of mark definition.
    * By default, `color` represents fill color for `"area"`, `"bar"`, `"tick"`,
    * `"text"`, `"trail"`, `"circle"`, and `"square"` / stroke color for `"line"` and `"point"`.
    *
    * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark)'s `color` property.
    *
    * _Note:_
    * 1) For fine-grained control over both fill and stroke colors of the marks, please use the `fill` and `stroke` channels.  If either `fill` or `stroke` channel is specified, `color` channel will be ignored.
    * 2) See the scale documentation for more information about customizing [color scheme](https://vega.github.io/vega-lite/docs/scale.html#scheme).
    */
  var color: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]]
  ] = js.undefined
  /**
    * Additional levels of detail for grouping data in aggregate views and
    * in line, trail, and area marks without mapping data to a specific visual channel.
    */
  var detail: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]]
  ] = js.undefined
  /**
    * Fill color of the marks.
    * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark)'s `color` property.
    *
    * _Note:_ When using `fill` channel, `color ` channel will be ignored. To customize both fill and stroke, please use `fill` and `stroke` channels (not `fill` and `color`).
    */
  var fill: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]]
  ] = js.undefined
  /**
    * A URL to load upon mouse click.
    */
  var href: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]]
  ] = js.undefined
  /**
    * A data field to use as a unique key for data binding. When a visualization’s data is updated, the key value will be used to match data elements to existing mark instances. Use a key channel to enable object constancy for transitions over dynamic data.
    */
  var key: js.UndefOr[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = js.undefined
  /**
    * Latitude position of geographically projected marks.
    */
  var latitude: js.UndefOr[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = js.undefined
  /**
    * Latitude-2 position for geographically projected ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    */
  var latitude2: js.UndefOr[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = js.undefined
  /**
    * Longitude position of geographically projected marks.
    */
  var longitude: js.UndefOr[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = js.undefined
  /**
    * Longitude-2 position for geographically projected ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    */
  var longitude2: js.UndefOr[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = js.undefined
  /**
    * Opacity of the marks – either can be a value or a range.
    *
    * __Default value:__ If undefined, the default opacity depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark)'s `opacity` property.
    */
  var opacity: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]]
  ] = js.undefined
  /**
    * Order of the marks.
    * - For stacked marks, this `order` channel encodes [stack order](https://vega.github.io/vega-lite/docs/stack.html#order).
    * - For line and trail marks, this `order` channel encodes order of data points in the lines. This can be useful for creating [a connected scatterplot](https://vega.github.io/vega-lite/examples/connected_scatterplot.html).  Setting `order` to `{"value": null}` makes the line marks use the original order in the data sources.
    * - Otherwise, this `order` channel encodes layer order of the marks.
    *
    * __Note__: In aggregate plots, `order` field should be `aggregate`d to avoid creating additional aggregation grouping.
    */
  var order: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.OrderFieldDef[F] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.OrderFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef
  ] = js.undefined
  /**
    * For `point` marks the supported values are
    * `"circle"` (default), `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`,
    * or `"triangle-down"`, or else a custom SVG path string.
    * For `geoshape` marks it should be a field definition of the geojson data
    *
    * __Default value:__ If undefined, the default shape depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#point-config)'s `shape` property.
    */
  var shape: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]]
  ] = js.undefined
  /**
    * Size of the mark.
    * - For `"point"`, `"square"` and `"circle"`, – the symbol size, or pixel area of the mark.
    * - For `"bar"` and `"tick"` – the bar and tick's size.
    * - For `"text"` – the text's font size.
    * - Size is unsupported for `"line"`, `"area"`, and `"rect"`. (Use `"trail"` instead of line with varying size)
    */
  var size: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]]
  ] = js.undefined
  /**
    * Stroke color of the marks.
    * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark)'s `color` property.
    *
    * _Note:_ When using `stroke` channel, `color ` channel will be ignored. To customize both stroke and fill, please use `stroke` and `fill` channels (not `stroke` and `color`).
    */
  var stroke: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]]
  ] = js.undefined
  /**
    * Text of the `text` mark.
    */
  var text: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]]
  ] = js.undefined
  /**
    * The tooltip text to show upon mouse hover.
    */
  var tooltip: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]]
  ] = js.undefined
  /**
    * X coordinates of the marks, or width of horizontal `"bar"` and `"area"`.
    */
  var x: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.PositionFieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef
  ] = js.undefined
  /**
    * X2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    */
  var x2: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef
  ] = js.undefined
  /**
    * Y coordinates of the marks, or height of vertical `"bar"` and `"area"`.
    */
  var y: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.PositionFieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef
  ] = js.undefined
  /**
    * Y2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    */
  var y2: js.UndefOr[
    vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef
  ] = js.undefined
}

object Encoding {
  @scala.inline
  def apply[F](
    color: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    detail: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = null,
    fill: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    href: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = null,
    key: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    latitude: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    latitude2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    longitude: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    longitude2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    opacity: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    order: vegaDashLiteLib.buildSrcFielddefMod.OrderFieldDef[F] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.OrderFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    shape: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    size: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    stroke: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    text: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] = null,
    tooltip: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] = null,
    x: vegaDashLiteLib.buildSrcFielddefMod.PositionFieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    x2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    y: vegaDashLiteLib.buildSrcFielddefMod.PositionFieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    y2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null
  ): Encoding[F] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude)
    if (latitude2 != null) __obj.updateDynamic("latitude2")(latitude2)
    if (longitude != null) __obj.updateDynamic("longitude")(longitude)
    if (longitude2 != null) __obj.updateDynamic("longitude2")(longitude2)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding[F]]
  }
}

