package typings.vegaDashTypings.typesSpecTitleMod

import typings.vegaDashTypings.typesSpecEncodeMod.Encode
import typings.vegaDashTypings.typesSpecEncodeMod.Text
import typings.vegaDashTypings.typesSpecEncodeMod.TextEncodeEntry
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecValuesMod.AlignValue
import typings.vegaDashTypings.typesSpecValuesMod.AnchorValue
import typings.vegaDashTypings.typesSpecValuesMod.ColorValue
import typings.vegaDashTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaDashTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaDashTypings.typesSpecValuesMod.NumberValue
import typings.vegaDashTypings.typesSpecValuesMod.StringValue
import typings.vegaDashTypings.typesSpecValuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends BaseTitle[
      NumberValue, 
      StringValue, 
      ColorValue, 
      FontWeightValue, 
      FontStyleValue, 
      AlignValue, 
      TextBaselineValue, 
      TitleFrame | StringValue, 
      AnchorValue, 
      TitleOrient | SignalRef
    ] {
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
  /**
    * 	The integer z-index indicating the layering of the title group relative to other axis, mark and legend groups.
    *
    * __Default value:__ `0`.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.undefined
}

object Title {
  @scala.inline
  def apply(
    text: Text | SignalRef,
    align: AlignValue = null,
    anchor: AnchorValue = null,
    angle: NumberValue = null,
    baseline: TextBaselineValue = null,
    color: ColorValue = null,
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
    subtitleColor: ColorValue = null,
    subtitleFont: StringValue = null,
    subtitleFontSize: NumberValue = null,
    subtitleFontStyle: FontStyleValue = null,
    subtitleFontWeight: FontWeightValue = null,
    subtitleLineHeight: NumberValue = null,
    subtitlePadding: NumberValue = null,
    zindex: Int | Double = null
  ): Title = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (subtitleFont != null) __obj.updateDynamic("subtitleFont")(subtitleFont.asInstanceOf[js.Any])
    if (subtitleFontSize != null) __obj.updateDynamic("subtitleFontSize")(subtitleFontSize.asInstanceOf[js.Any])
    if (subtitleFontStyle != null) __obj.updateDynamic("subtitleFontStyle")(subtitleFontStyle.asInstanceOf[js.Any])
    if (subtitleFontWeight != null) __obj.updateDynamic("subtitleFontWeight")(subtitleFontWeight.asInstanceOf[js.Any])
    if (subtitleLineHeight != null) __obj.updateDynamic("subtitleLineHeight")(subtitleLineHeight.asInstanceOf[js.Any])
    if (subtitlePadding != null) __obj.updateDynamic("subtitlePadding")(subtitlePadding.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

