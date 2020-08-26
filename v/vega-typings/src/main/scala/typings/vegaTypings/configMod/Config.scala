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
@js.native
trait Config extends js.Object {
  var arc: js.UndefOr[MarkConfig] = js.native
  var area: js.UndefOr[MarkConfig] = js.native
  var autosize: js.UndefOr[AutoSize | SignalRef] = js.native
  var axis: js.UndefOr[AxisConfig] = js.native
  var axisBand: js.UndefOr[AxisConfig] = js.native
  var axisBottom: js.UndefOr[AxisConfig] = js.native
  var axisLeft: js.UndefOr[AxisConfig] = js.native
  var axisRight: js.UndefOr[AxisConfig] = js.native
  var axisTop: js.UndefOr[AxisConfig] = js.native
  var axisX: js.UndefOr[AxisConfig] = js.native
  var axisY: js.UndefOr[AxisConfig] = js.native
  var background: js.UndefOr[Null | Color | SignalRef] = js.native
   // TODO
  var events: js.UndefOr[Bind] = js.native
  var group: js.UndefOr[js.Any] = js.native
  var image: js.UndefOr[MarkConfig] = js.native
  var legend: js.UndefOr[LegendConfig] = js.native
  var line: js.UndefOr[MarkConfig] = js.native
  /**
    * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property provides a global default for text marks, which is overridden by mark or style config settings, and by the "lineBreak" mark encoding channel. If signal-valued, either string or regular expression (regexp) values are valid.
    */
  var lineBreak: js.UndefOr[String | SignalRef] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var mark: js.UndefOr[MarkConfig] = js.native
  var padding: js.UndefOr[Padding | SignalRef] = js.native
  var path: js.UndefOr[MarkConfig] = js.native
  var projection: js.UndefOr[ProjectionConfig] = js.native
  var range: js.UndefOr[RangeConfig] = js.native
  var rect: js.UndefOr[MarkConfig] = js.native
  var rule: js.UndefOr[MarkConfig] = js.native
  var shape: js.UndefOr[MarkConfig] = js.native
  var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.native
  var style: js.UndefOr[StringDictionary[MarkConfig]] = js.native
  var symbol: js.UndefOr[MarkConfig] = js.native
  var text: js.UndefOr[MarkConfig] = js.native
  var title: js.UndefOr[TitleConfig] = js.native
  var trail: js.UndefOr[MarkConfig] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArc(value: MarkConfig): Self = this.set("arc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArc: Self = this.set("arc", js.undefined)
    @scala.inline
    def setArea(value: MarkConfig): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setAutosize(value: AutoSize | SignalRef): Self = this.set("autosize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosize: Self = this.set("autosize", js.undefined)
    @scala.inline
    def setAxis(value: AxisConfig): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setAxisBand(value: AxisConfig): Self = this.set("axisBand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisBand: Self = this.set("axisBand", js.undefined)
    @scala.inline
    def setAxisBottom(value: AxisConfig): Self = this.set("axisBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisBottom: Self = this.set("axisBottom", js.undefined)
    @scala.inline
    def setAxisLeft(value: AxisConfig): Self = this.set("axisLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLeft: Self = this.set("axisLeft", js.undefined)
    @scala.inline
    def setAxisRight(value: AxisConfig): Self = this.set("axisRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisRight: Self = this.set("axisRight", js.undefined)
    @scala.inline
    def setAxisTop(value: AxisConfig): Self = this.set("axisTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisTop: Self = this.set("axisTop", js.undefined)
    @scala.inline
    def setAxisX(value: AxisConfig): Self = this.set("axisX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisX: Self = this.set("axisX", js.undefined)
    @scala.inline
    def setAxisY(value: AxisConfig): Self = this.set("axisY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisY: Self = this.set("axisY", js.undefined)
    @scala.inline
    def setBackground(value: Color | SignalRef): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundNull: Self = this.set("background", null)
    @scala.inline
    def setEvents(value: Bind): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setGroup(value: js.Any): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setImage(value: MarkConfig): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLegend(value: LegendConfig): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLine(value: MarkConfig): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setLineBreak(value: String | SignalRef): Self = this.set("lineBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMark(value: MarkConfig): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setPadding(value: Padding | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPath(value: MarkConfig): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionConfig): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRange(value: RangeConfig): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRect(value: MarkConfig): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    @scala.inline
    def setRule(value: MarkConfig): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setShape(value: MarkConfig): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSignalsVarargs(value: (InitSignal | NewSignal)*): Self = this.set("signals", js.Array(value :_*))
    @scala.inline
    def setSignals(value: js.Array[InitSignal | NewSignal]): Self = this.set("signals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignals: Self = this.set("signals", js.undefined)
    @scala.inline
    def setStyle(value: StringDictionary[MarkConfig]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSymbol(value: MarkConfig): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setText(value: MarkConfig): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: TitleConfig): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrail(value: MarkConfig): Self = this.set("trail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrail: Self = this.set("trail", js.undefined)
  }
  
}

