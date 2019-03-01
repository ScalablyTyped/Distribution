package typings
package vegaDashTypingsLib.typesSpecConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig> ]:? std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>[P]}
- Dropped {[ P in keyof std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig> ]:? std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig>[P]} */ trait Config extends js.Object {
  var autosize: js.UndefOr[vegaDashTypingsLib.typesSpecAutosizeMod.AutoSize] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
   // TODO
  var events: js.UndefOr[vegaDashTypingsLib.Anon_Defaults] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
   // TODO
  var legend: js.UndefOr[
    LegendConfig[
      vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
      scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
      vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
      vegaDashTypingsLib.typesSpecLayoutMod.LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecAxisMod.LabelOverlap | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.SymbolShapeValue, 
      vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue, 
      vegaDashTypingsLib.typesSpecValuesMod.OrientValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AnchorValue
    ]
  ] = js.undefined
  var range: js.UndefOr[vegaDashTypingsLib.Anon_Category] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[TitleConfig] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    autosize: vegaDashTypingsLib.typesSpecAutosizeMod.AutoSize = null,
    background: java.lang.String = null,
    events: vegaDashTypingsLib.Anon_Defaults = null,
    group: js.Any = null,
    legend: LegendConfig[
      vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
      scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
      vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
      vegaDashTypingsLib.typesSpecLayoutMod.LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecAxisMod.LabelOverlap | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.SymbolShapeValue, 
      vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue, 
      vegaDashTypingsLib.typesSpecValuesMod.OrientValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AnchorValue
    ] = null,
    range: vegaDashTypingsLib.Anon_Category = null,
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

