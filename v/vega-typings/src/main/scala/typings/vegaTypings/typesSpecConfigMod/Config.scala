package typings.vegaTypings.typesSpecConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.anon.Bind
import typings.vegaTypings.typesSpecAutosizeMod.AutoSize
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecLocaleMod.Locale
import typings.vegaTypings.typesSpecPaddingMod.Padding
import typings.vegaTypings.typesSpecSignalMod.InitSignal
import typings.vegaTypings.typesSpecSignalMod.NewSignal
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>> */
/* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig>> */
trait Config extends StObject {
  
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
  
  var group: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setArc(value: MarkConfig): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setArea(value: MarkConfig): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setAutosize(value: AutoSize | SignalRef): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
    
    inline def setAxis(value: AxisConfig): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisBand(value: AxisConfig): Self = StObject.set(x, "axisBand", value.asInstanceOf[js.Any])
    
    inline def setAxisBandUndefined: Self = StObject.set(x, "axisBand", js.undefined)
    
    inline def setAxisBottom(value: AxisConfig): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
    
    inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
    
    inline def setAxisLeft(value: AxisConfig): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
    
    inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
    
    inline def setAxisRight(value: AxisConfig): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
    
    inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
    
    inline def setAxisTop(value: AxisConfig): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
    
    inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setAxisX(value: AxisConfig): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    inline def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
    
    inline def setAxisY(value: AxisConfig): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    
    inline def setBackground(value: Color | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setEvents(value: Bind): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setImage(value: MarkConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLegend(value: LegendConfig): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setLine(value: MarkConfig): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineBreak(value: String | SignalRef): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMark(value: MarkConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setPadding(value: Padding | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPath(value: MarkConfig): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProjection(value: ProjectionConfig): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRange(value: RangeConfig): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRect(value: MarkConfig): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setRule(value: MarkConfig): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setShape(value: MarkConfig): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSignals(value: js.Array[InitSignal | NewSignal]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
    
    inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
    
    inline def setSignalsVarargs(value: (InitSignal | NewSignal)*): Self = StObject.set(x, "signals", js.Array(value*))
    
    inline def setStyle(value: StringDictionary[MarkConfig]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbol(value: MarkConfig): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setText(value: MarkConfig): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: TitleConfig): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrail(value: MarkConfig): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
    
    inline def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
  }
}
