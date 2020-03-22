package typings.vegaTypings.configMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleFrame
import typings.vegaTypings.titleMod.TitleOrient
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/title.BaseTitle> */
trait TitleConfig extends js.Object {
  var align: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]]
  var anchor: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]]
  var angle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var baseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]]
  var color: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]
  var dx: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var dy: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var font: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]
  var fontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var fontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]
  var fontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]
  var frame: ExcludeValueRefKeepSignal[js.UndefOr[TitleFrame | StringValue]]
  var limit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var lineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var offset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var orient: ExcludeValueRefKeepSignal[js.UndefOr[TitleOrient | SignalRef]]
  var subtitleColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]
  var subtitleFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]
  var subtitleFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var subtitleFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]
  var subtitleFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]
  var subtitleLineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var subtitlePadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
}

object TitleConfig {
  @scala.inline
  def apply(
    align: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]] = null,
    anchor: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]] = null,
    angle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    baseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]] = null,
    color: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = null,
    dx: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    dy: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    font: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = null,
    fontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    fontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = null,
    fontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = null,
    frame: ExcludeValueRefKeepSignal[js.UndefOr[TitleFrame | StringValue]] = null,
    limit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    lineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    offset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    orient: ExcludeValueRefKeepSignal[js.UndefOr[TitleOrient | SignalRef]] = null,
    subtitleColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = null,
    subtitleFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = null,
    subtitleFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    subtitleFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = null,
    subtitleFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = null,
    subtitleLineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    subtitlePadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null
  ): TitleConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (subtitleFont != null) __obj.updateDynamic("subtitleFont")(subtitleFont.asInstanceOf[js.Any])
    if (subtitleFontSize != null) __obj.updateDynamic("subtitleFontSize")(subtitleFontSize.asInstanceOf[js.Any])
    if (subtitleFontStyle != null) __obj.updateDynamic("subtitleFontStyle")(subtitleFontStyle.asInstanceOf[js.Any])
    if (subtitleFontWeight != null) __obj.updateDynamic("subtitleFontWeight")(subtitleFontWeight.asInstanceOf[js.Any])
    if (subtitleLineHeight != null) __obj.updateDynamic("subtitleLineHeight")(subtitleLineHeight.asInstanceOf[js.Any])
    if (subtitlePadding != null) __obj.updateDynamic("subtitlePadding")(subtitlePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleConfig]
  }
}

