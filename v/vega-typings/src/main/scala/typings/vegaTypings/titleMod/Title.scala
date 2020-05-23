package typings.vegaTypings.titleMod

import typings.vegaTypings.encodeMod.Encode
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
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

trait Title extends BaseTitle {
  /**
    * Mark definitions for custom title encoding.
    */
  var encode: js.UndefOr[TitleEncode | Encode[TextEncodeEntry]] = js.undefined
  /**
    * A boolean flag indicating if the title element should respond to input events such as mouse hover. (**Deprecated.**)
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * A mark name property to apply to the title text mark. (**Deprecated.**)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A mark style property to apply to the title text mark. If not specified, a default style of `"group-title"` is applied. (**Deprecated**)
    */
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The subtitle text.
    */
  var subtitle: js.UndefOr[Text | SignalRef] = js.undefined
  /**
    * The title text.
    */
  var text: Text | SignalRef
}

object Title {
  @scala.inline
  def apply(
    text: Text | SignalRef,
    align: AlignValue = null,
    anchor: js.UndefOr[Null | AnchorValue] = js.undefined,
    angle: NumberValue = null,
    aria: js.UndefOr[Boolean] = js.undefined,
    baseline: TextBaselineValue = null,
    color: js.UndefOr[Null | ColorValue] = js.undefined,
    dx: NumberValue = null,
    dy: NumberValue = null,
    encode: TitleEncode | Encode[TextEncodeEntry] = null,
    font: StringValue = null,
    fontSize: NumberValue = null,
    fontStyle: FontStyleValue = null,
    fontWeight: FontWeightValue = null,
    frame: TitleFrame | StringValue = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    limit: NumberValue = null,
    lineHeight: NumberValue = null,
    name: String = null,
    offset: NumberValue = null,
    orient: TitleOrient | SignalRef = null,
    style: String | js.Array[String] = null,
    subtitle: Text | SignalRef = null,
    subtitleColor: js.UndefOr[Null | ColorValue] = js.undefined,
    subtitleFont: StringValue = null,
    subtitleFontSize: NumberValue = null,
    subtitleFontStyle: FontStyleValue = null,
    subtitleFontWeight: FontWeightValue = null,
    subtitleLineHeight: NumberValue = null,
    subtitlePadding: NumberValue = null,
    zindex: js.UndefOr[Double] = js.undefined
  ): Title = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(aria)) __obj.updateDynamic("aria")(aria.get.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitleColor)) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (subtitleFont != null) __obj.updateDynamic("subtitleFont")(subtitleFont.asInstanceOf[js.Any])
    if (subtitleFontSize != null) __obj.updateDynamic("subtitleFontSize")(subtitleFontSize.asInstanceOf[js.Any])
    if (subtitleFontStyle != null) __obj.updateDynamic("subtitleFontStyle")(subtitleFontStyle.asInstanceOf[js.Any])
    if (subtitleFontWeight != null) __obj.updateDynamic("subtitleFontWeight")(subtitleFontWeight.asInstanceOf[js.Any])
    if (subtitleLineHeight != null) __obj.updateDynamic("subtitleLineHeight")(subtitleLineHeight.asInstanceOf[js.Any])
    if (subtitlePadding != null) __obj.updateDynamic("subtitlePadding")(subtitlePadding.asInstanceOf[js.Any])
    if (!js.isUndefined(zindex)) __obj.updateDynamic("zindex")(zindex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

