package typings.vegaTypings.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.anon.Bind
import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.localeMod.Locale
import typings.vegaTypings.paddingMod.Padding
import typings.vegaTypings.signalMod.InitSignal
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>> */
/* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig>> */
trait Config extends js.Object {
  var arc: js.UndefOr[MarkConfig] = js.undefined
  var area: js.UndefOr[MarkConfig] = js.undefined
  var autosize: js.UndefOr[AutoSize | SignalRef] = js.undefined
  var axis: js.UndefOr[AxisConfig] = js.undefined
  var axisBand: js.UndefOr[AxisConfig] = js.undefined
  var axisBottom: js.UndefOr[AxisConfig] = js.undefined
  var axisLeft: js.UndefOr[AxisConfig] = js.undefined
  var axisRight: js.UndefOr[AxisConfig] = js.undefined
  var axisTop: js.UndefOr[AxisConfig] = js.undefined
  var axisX: js.UndefOr[AxisConfig] = js.undefined
  var axisY: js.UndefOr[AxisConfig] = js.undefined
  var background: js.UndefOr[Null | Color | SignalRef] = js.undefined
   // TODO
  var events: js.UndefOr[Bind] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
  var image: js.UndefOr[MarkConfig] = js.undefined
  var legend: js.UndefOr[LegendConfig] = js.undefined
  var line: js.UndefOr[MarkConfig] = js.undefined
  /**
    * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property provides a global default for text marks, which is overridden by mark or style config settings, and by the "lineBreak" mark encoding channel. If signal-valued, either string or regular expression (regexp) values are valid.
    */
  var lineBreak: js.UndefOr[String | SignalRef] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var mark: js.UndefOr[MarkConfig] = js.undefined
  var padding: js.UndefOr[Padding | SignalRef] = js.undefined
  var path: js.UndefOr[MarkConfig] = js.undefined
  var projection: js.UndefOr[ProjectionConfig] = js.undefined
  var range: js.UndefOr[RangeConfig] = js.undefined
  var rect: js.UndefOr[MarkConfig] = js.undefined
  var rule: js.UndefOr[MarkConfig] = js.undefined
  var shape: js.UndefOr[MarkConfig] = js.undefined
  var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.undefined
  var style: js.UndefOr[StringDictionary[MarkConfig]] = js.undefined
  var symbol: js.UndefOr[MarkConfig] = js.undefined
  var text: js.UndefOr[MarkConfig] = js.undefined
  var title: js.UndefOr[TitleConfig] = js.undefined
  var trail: js.UndefOr[MarkConfig] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    arc: MarkConfig = null,
    area: MarkConfig = null,
    autosize: AutoSize | SignalRef = null,
    axis: AxisConfig = null,
    axisBand: AxisConfig = null,
    axisBottom: AxisConfig = null,
    axisLeft: AxisConfig = null,
    axisRight: AxisConfig = null,
    axisTop: AxisConfig = null,
    axisX: AxisConfig = null,
    axisY: AxisConfig = null,
    background: js.UndefOr[Null | Color | SignalRef] = js.undefined,
    events: Bind = null,
    group: js.Any = null,
    image: MarkConfig = null,
    legend: LegendConfig = null,
    line: MarkConfig = null,
    lineBreak: String | SignalRef = null,
    locale: Locale = null,
    mark: MarkConfig = null,
    padding: Padding | SignalRef = null,
    path: MarkConfig = null,
    projection: ProjectionConfig = null,
    range: RangeConfig = null,
    rect: MarkConfig = null,
    rule: MarkConfig = null,
    shape: MarkConfig = null,
    signals: js.Array[InitSignal | NewSignal] = null,
    style: StringDictionary[MarkConfig] = null,
    symbol: MarkConfig = null,
    text: MarkConfig = null,
    title: TitleConfig = null,
    trail: MarkConfig = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (axisBand != null) __obj.updateDynamic("axisBand")(axisBand.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (axisX != null) __obj.updateDynamic("axisX")(axisX.asInstanceOf[js.Any])
    if (axisY != null) __obj.updateDynamic("axisY")(axisY.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rect != null) __obj.updateDynamic("rect")(rect.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trail != null) __obj.updateDynamic("trail")(trail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

