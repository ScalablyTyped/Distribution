package typings
package vegaDashLiteLib.buildSrcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends vegaDashLiteLib.buildSrcToplevelpropsMod.TopLevelProperties
     with VLOnlyConfig
     with vegaDashLiteLib.buildSrcMarkMod.MarkConfigMixins
     with vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotConfigMixins
     with vegaDashLiteLib.buildSrcAxisMod.AxisConfigMixins {
  /**
    * Header configuration, which determines default properties for all [header](https://vega.github.io/vega-lite/docs/header.html). For a full list of header configuration options, please see the [corresponding section of in the header documentation](https://vega.github.io/vega-lite/docs/header.html#config).
    */
  var header: js.UndefOr[vegaDashLiteLib.buildSrcHeaderMod.HeaderConfig] = js.undefined
  /**
    * Legend configuration, which determines default properties for all [legends](https://vega.github.io/vega-lite/docs/legend.html). For a full list of legend configuration options, please see the [corresponding section of in the legend documentation](https://vega.github.io/vega-lite/docs/legend.html#config).
    */
  var legend: js.UndefOr[vegaDashLiteLib.buildSrcLegendMod.LegendConfig] = js.undefined
  /**
    * Projection configuration, which determines default properties for all [projections](https://vega.github.io/vega-lite/docs/projection.html). For a full list of projection configuration options, please see the [corresponding section of the projection documentation](https://vega.github.io/vega-lite/docs/projection.html#config).
    */
  var projection: js.UndefOr[vegaDashLiteLib.buildSrcProjectionMod.ProjectionConfig] = js.undefined
  /**
    * An object hash that defines default range arrays or schemes for using with scales.
    * For a full list of scale range configuration options, please see the [corresponding section of the scale documentation](https://vega.github.io/vega-lite/docs/scale.html#config).
    */
  var range: js.UndefOr[RangeConfig] = js.undefined
  /** An object hash that defines key-value mappings to determine default properties for marks with a given [style](https://vega.github.io/vega-lite/docs/mark.html#mark-def).  The keys represent styles names; the values have to be valid [mark configuration objects](https://vega.github.io/vega-lite/docs/mark.html#config).  */
  var style: js.UndefOr[StyleConfigIndex] = js.undefined
  /**
    * Title configuration, which determines default properties for all [titles](https://vega.github.io/vega-lite/docs/title.html). For a full list of title configuration options, please see the [corresponding section of the title documentation](https://vega.github.io/vega-lite/docs/title.html#config).
    */
  var title: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgTitleConfig] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    area: vegaDashLiteLib.buildSrcMarkMod.AreaConfig = null,
    autosize: vegaDashLiteLib.buildSrcToplevelpropsMod.AutosizeType | vegaDashLiteLib.buildSrcToplevelpropsMod.AutoSizeParams = null,
    axis: vegaDashLiteLib.buildSrcAxisMod.AxisConfig = null,
    axisBand: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig = null,
    axisBottom: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig = null,
    axisLeft: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig = null,
    axisRight: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig = null,
    axisTop: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig = null,
    axisX: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig = null,
    axisY: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig = null,
    background: java.lang.String = null,
    bar: vegaDashLiteLib.buildSrcMarkMod.BarConfig = null,
    box: vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotConfig = null,
    boxMid: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    boxWhisker: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    circle: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    countTitle: java.lang.String = null,
    datasets: vegaDashLiteLib.buildSrcToplevelpropsMod.Datasets = null,
    fieldTitle: vegaDashLiteLib.vegaDashLiteLibStrings.verbal | vegaDashLiteLib.vegaDashLiteLibStrings.functional | vegaDashLiteLib.vegaDashLiteLibStrings.plain = null,
    geoshape: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    header: vegaDashLiteLib.buildSrcHeaderMod.HeaderConfig = null,
    invalidValues: vegaDashLiteLib.vegaDashLiteLibStrings.filter = null,
    legend: vegaDashLiteLib.buildSrcLegendMod.LegendConfig = null,
    line: vegaDashLiteLib.buildSrcMarkMod.LineConfig = null,
    mark: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    numberFormat: java.lang.String = null,
    padding: vegaDashLiteLib.buildSrcToplevelpropsMod.Padding = null,
    point: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    projection: vegaDashLiteLib.buildSrcProjectionMod.ProjectionConfig = null,
    range: RangeConfig = null,
    rect: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    rule: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    scale: vegaDashLiteLib.buildSrcScaleMod.ScaleConfig = null,
    selection: vegaDashLiteLib.buildSrcSelectionMod.SelectionConfig = null,
    square: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = null,
    stack: vegaDashLiteLib.buildSrcStackMod.StackOffset = null,
    style: StyleConfigIndex = null,
    text: vegaDashLiteLib.buildSrcMarkMod.TextConfig = null,
    tick: vegaDashLiteLib.buildSrcMarkMod.TickConfig = null,
    timeFormat: java.lang.String = null,
    title: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgTitleConfig = null,
    trail: vegaDashLiteLib.buildSrcMarkMod.LineConfig = null,
    view: ViewConfig = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (axisBand != null) __obj.updateDynamic("axisBand")(axisBand)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (axisX != null) __obj.updateDynamic("axisX")(axisX)
    if (axisY != null) __obj.updateDynamic("axisY")(axisY)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (box != null) __obj.updateDynamic("box")(box)
    if (boxMid != null) __obj.updateDynamic("boxMid")(boxMid)
    if (boxWhisker != null) __obj.updateDynamic("boxWhisker")(boxWhisker)
    if (circle != null) __obj.updateDynamic("circle")(circle)
    if (countTitle != null) __obj.updateDynamic("countTitle")(countTitle)
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (fieldTitle != null) __obj.updateDynamic("fieldTitle")(fieldTitle.asInstanceOf[js.Any])
    if (geoshape != null) __obj.updateDynamic("geoshape")(geoshape)
    if (header != null) __obj.updateDynamic("header")(header)
    if (invalidValues != null) __obj.updateDynamic("invalidValues")(invalidValues)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (line != null) __obj.updateDynamic("line")(line)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rect != null) __obj.updateDynamic("rect")(rect)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (square != null) __obj.updateDynamic("square")(square)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (tick != null) __obj.updateDynamic("tick")(tick)
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trail != null) __obj.updateDynamic("trail")(trail)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Config]
  }
}

