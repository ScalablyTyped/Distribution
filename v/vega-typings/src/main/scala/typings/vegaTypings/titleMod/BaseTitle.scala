package typings.vegaTypings.titleMod

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

trait BaseTitle extends js.Object {
  /**
    * Horizontal text alignment for title text. One of `"left"`, `"center"`, or `"right"`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * The anchor position for placing the title and subtitle text. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    */
  var anchor: js.UndefOr[AnchorValue] = js.undefined
  /**
    * Angle in degrees of title and subtitle text.
    */
  var angle: js.UndefOr[NumberValue] = js.undefined
  /**
    * Vertical text baseline for title and subtitle text. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    */
  var baseline: js.UndefOr[TextBaselineValue] = js.undefined
  /**
    * Text color for title text.
    */
  var color: js.UndefOr[ColorValue] = js.undefined
  /**
    * Delta offset for title and subtitle text x-coordinate.
    */
  var dx: js.UndefOr[NumberValue] = js.undefined
  /**
    * Delta offset for title and subtitle text y-coordinate.
    */
  var dy: js.UndefOr[NumberValue] = js.undefined
  /**
    * Font name for title text.
    */
  var font: js.UndefOr[StringValue] = js.undefined
  /**
    * Font size in pixels for title text.
    *
    * @minimum 0
    */
  var fontSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * Font style for title text.
    */
  var fontStyle: js.UndefOr[FontStyleValue] = js.undefined
  /**
    * Font weight for title text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FontWeightValue] = js.undefined
  /**
    * The reference frame for the anchor position, one of `"bounds"` (to anchor relative to the full bounding box) or `"group"` (to anchor relative to the group width or height).
    */
  var frame: js.UndefOr[TitleFrame | StringValue] = js.undefined
  /**
    * The maximum allowed length in pixels of title and subtitle text.
    *
    * @minimum 0
    */
  var limit: js.UndefOr[NumberValue] = js.undefined
  /**
    * Line height in pixels for multi-line title text or title text with `"line-top"` or `"line-bottom"` baseline.
    */
  var lineHeight: js.UndefOr[NumberValue] = js.undefined
  /**
    * The orthogonal offset in pixels by which to displace the title group from its position along the edge of the chart.
    */
  var offset: js.UndefOr[NumberValue] = js.undefined
  /**
    * Default title orientation (`"top"`, `"bottom"`, `"left"`, or `"right"`)
    */
  var orient: js.UndefOr[TitleOrient | SignalRef] = js.undefined
  /**
    * Text color for subtitle text.
    */
  var subtitleColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * Font name for subtitle text.
    */
  var subtitleFont: js.UndefOr[StringValue] = js.undefined
  /**
    * Font size in pixels for subtitle text.
    *
    * @minimum 0
    */
  var subtitleFontSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * Font style for subtitle text.
    */
  var subtitleFontStyle: js.UndefOr[FontStyleValue] = js.undefined
  /**
    * Font weight for subtitle text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var subtitleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  /**
    * Line height in pixels for multi-line subtitle text.
    */
  var subtitleLineHeight: js.UndefOr[NumberValue] = js.undefined
  /**
    * The padding in pixels between title and subtitle text.
    */
  var subtitlePadding: js.UndefOr[NumberValue] = js.undefined
}

object BaseTitle {
  @scala.inline
  def apply(
    align: AlignValue = null,
    anchor: AnchorValue = null,
    angle: NumberValue = null,
    baseline: TextBaselineValue = null,
    color: ColorValue = null,
    dx: NumberValue = null,
    dy: NumberValue = null,
    font: StringValue = null,
    fontSize: NumberValue = null,
    fontStyle: FontStyleValue = null,
    fontWeight: FontWeightValue = null,
    frame: TitleFrame | StringValue = null,
    limit: NumberValue = null,
    lineHeight: NumberValue = null,
    offset: NumberValue = null,
    orient: TitleOrient | SignalRef = null,
    subtitleColor: ColorValue = null,
    subtitleFont: StringValue = null,
    subtitleFontSize: NumberValue = null,
    subtitleFontStyle: FontStyleValue = null,
    subtitleFontWeight: FontWeightValue = null,
    subtitleLineHeight: NumberValue = null,
    subtitlePadding: NumberValue = null
  ): BaseTitle = {
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
    __obj.asInstanceOf[BaseTitle]
  }
}

