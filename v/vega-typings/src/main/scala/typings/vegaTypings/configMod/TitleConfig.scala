package typings.vegaTypings.configMod

import typings.std.Exclude
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
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
  var align: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  var anchor: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
  var angle: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var aria: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  var baseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  var color: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var dx: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var dy: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var font: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  var fontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var fontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  var fontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  var frame: (Exclude[
    js.UndefOr[TitleFrame | StringValue], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]])
  var limit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var lineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var offset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var orient: (Exclude[
    js.UndefOr[TitleOrient | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]])
  var subtitleColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var subtitleFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  var subtitleFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var subtitleFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  var subtitleFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  var subtitleLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var subtitlePadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var zindex: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
}

object TitleConfig {
  @scala.inline
  def apply(
    align: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]] = null,
    anchor: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]] = null,
    angle: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    aria: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]] = null,
    baseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]] = null,
    color: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    dx: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    dy: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    font: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]] = null,
    fontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    fontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]] = null,
    fontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]] = null,
    frame: (Exclude[
      js.UndefOr[TitleFrame | StringValue], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]]) = null,
    limit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    lineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    offset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    orient: (Exclude[
      js.UndefOr[TitleOrient | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]]) = null,
    subtitleColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    subtitleFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]] = null,
    subtitleFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    subtitleFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]] = null,
    subtitleFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]] = null,
    subtitleLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    subtitlePadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    zindex: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]] = null
  ): TitleConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
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
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleConfig]
  }
}

