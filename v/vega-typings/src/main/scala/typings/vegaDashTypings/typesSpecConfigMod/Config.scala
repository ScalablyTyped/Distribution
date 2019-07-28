package typings.vegaDashTypings.typesSpecConfigMod

import typings.vegaDashTypings.Anon_Category
import typings.vegaDashTypings.Anon_Defaults
import typings.vegaDashTypings.typesSpecAutosizeMod.AutoSize
import typings.vegaDashTypings.typesSpecAxisMod.LabelOverlap
import typings.vegaDashTypings.typesSpecLayoutMod.LayoutAlign
import typings.vegaDashTypings.typesSpecLegendMod.LegendOrient
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecValuesMod.AlignValue
import typings.vegaDashTypings.typesSpecValuesMod.AnchorValue
import typings.vegaDashTypings.typesSpecValuesMod.ColorValue
import typings.vegaDashTypings.typesSpecValuesMod.DashArrayValue
import typings.vegaDashTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaDashTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaDashTypings.typesSpecValuesMod.NumberValue
import typings.vegaDashTypings.typesSpecValuesMod.OrientValue
import typings.vegaDashTypings.typesSpecValuesMod.StringValue
import typings.vegaDashTypings.typesSpecValuesMod.SymbolShapeValue
import typings.vegaDashTypings.typesSpecValuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig> ]:? std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>[P]}
- Dropped {[ P in keyof std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig> ]:? std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig>[P]} */ trait Config extends js.Object {
  var autosize: js.UndefOr[AutoSize] = js.undefined
  var background: js.UndefOr[String] = js.undefined
   // TODO
  var events: js.UndefOr[Anon_Defaults] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
   // TODO
  var legend: js.UndefOr[
    LegendConfig[
      NumberValue, 
      Double | SignalRef, 
      StringValue, 
      ColorValue, 
      FontWeightValue, 
      FontStyleValue, 
      AlignValue, 
      TextBaselineValue, 
      LayoutAlign | SignalRef, 
      LabelOverlap | SignalRef, 
      SymbolShapeValue, 
      DashArrayValue, 
      OrientValue, 
      AnchorValue, 
      LegendOrient | SignalRef
    ]
  ] = js.undefined
  var range: js.UndefOr[Anon_Category] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[TitleConfig] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    autosize: AutoSize = null,
    background: String = null,
    events: Anon_Defaults = null,
    group: js.Any = null,
    legend: LegendConfig[
      NumberValue, 
      Double | SignalRef, 
      StringValue, 
      ColorValue, 
      FontWeightValue, 
      FontStyleValue, 
      AlignValue, 
      TextBaselineValue, 
      LayoutAlign | SignalRef, 
      LabelOverlap | SignalRef, 
      SymbolShapeValue, 
      DashArrayValue, 
      OrientValue, 
      AnchorValue, 
      LegendOrient | SignalRef
    ] = null,
    range: Anon_Category = null,
    style: js.Any = null,
    title: TitleConfig = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (autosize != null) __obj.updateDynamic("autosize")(autosize)
    if (background != null) __obj.updateDynamic("background")(background)
    if (events != null) __obj.updateDynamic("events")(events)
    if (group != null) __obj.updateDynamic("group")(group)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (range != null) __obj.updateDynamic("range")(range)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Config]
  }
}

