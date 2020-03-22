package typings.vegaTypings.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.AnonBind
import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.signalMod.InitSignal
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig> ]:? std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>[P]}
- Dropped {[ P in keyof vega-typings.RecordAxisConfigKeysAxisC ]:? vega-typings.RecordAxisConfigKeysAxisC[P]} */ trait Config extends js.Object {
  var autosize: js.UndefOr[AutoSize] = js.undefined
  var background: js.UndefOr[Null | Color | SignalRef] = js.undefined
   // TODO
  var events: js.UndefOr[AnonBind] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
  var legend: js.UndefOr[LegendConfig] = js.undefined
  var projection: js.UndefOr[ProjectionConfig] = js.undefined
  var range: js.UndefOr[RangeConfig] = js.undefined
  var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.undefined
  var style: js.UndefOr[StringDictionary[MarkConfig]] = js.undefined
  var title: js.UndefOr[TitleConfig] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    autosize: AutoSize = null,
    background: Color | SignalRef = null,
    events: AnonBind = null,
    group: js.Any = null,
    legend: LegendConfig = null,
    projection: ProjectionConfig = null,
    range: RangeConfig = null,
    signals: js.Array[InitSignal | NewSignal] = null,
    style: StringDictionary[MarkConfig] = null,
    title: TitleConfig = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

