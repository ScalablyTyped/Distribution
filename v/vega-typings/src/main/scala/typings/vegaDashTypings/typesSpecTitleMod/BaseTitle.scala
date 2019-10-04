package typings.vegaDashTypings.typesSpecTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTitle[N, S, C, FW, FS, A, TB, F, AN, O] extends js.Object {
  /**
    * Horizontal text alignment for title text. One of `"left"`, `"center"`, or `"right"`.
    */
  var align: js.UndefOr[A] = js.undefined
  /**
    * The anchor position for placing the title and subtitle text. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    */
  var anchor: js.UndefOr[AN] = js.undefined
  /**
    * Angle in degrees of title and subtitle text.
    */
  var angle: js.UndefOr[N] = js.undefined
  /**
    * Vertical text baseline for title and subtitle text. One of `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    */
  var baseline: js.UndefOr[TB] = js.undefined
  /**
    * Text color for title text.
    */
  var color: js.UndefOr[C] = js.undefined
  /**
    * Delta offset for title and subtitle text x-coordinate.
    */
  var dx: js.UndefOr[N] = js.undefined
  /**
    * Delta offset for title and subtitle text y-coordinate.
    */
  var dy: js.UndefOr[N] = js.undefined
  /**
    * Font name for title text.
    */
  var font: js.UndefOr[S] = js.undefined
  /**
    * Font size in pixels for title text.
    *
    * @minimum 0
    */
  var fontSize: js.UndefOr[N] = js.undefined
  /**
    * Font style for title text.
    */
  var fontStyle: js.UndefOr[FS] = js.undefined
  /**
    * Font weight for title text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FW] = js.undefined
  /**
    * The reference frame for the anchor position, one of `"bounds"` (to anchor relative to the full bounding box) or `"group"` (to anchor relative to the group width or height).
    */
  var frame: js.UndefOr[F] = js.undefined
  /**
    * The maximum allowed length in pixels of title and subtitle text.
    *
    * @minimum 0
    */
  var limit: js.UndefOr[N] = js.undefined
  /**
    * Line height in pixels for multi-line title text.
    */
  var lineHeight: js.UndefOr[N] = js.undefined
  /**
    * The orthogonal offset in pixels by which to displace the title group from its position along the edge of the chart.
    */
  var offset: js.UndefOr[N] = js.undefined
  /**
    * Default title orientation (`"top"`, `"bottom"`, `"left"`, or `"right"`)
    */
  var orient: js.UndefOr[O] = js.undefined
  /**
    * Text color for subtitle text.
    */
  var subtitleColor: js.UndefOr[C] = js.undefined
  /**
    * Font name for subtitle text.
    */
  var subtitleFont: js.UndefOr[S] = js.undefined
  /**
    * Font size in pixels for subtitle text.
    *
    * @minimum 0
    */
  var subtitleFontSize: js.UndefOr[N] = js.undefined
  /**
    * Font style for subtitle text.
    */
  var subtitleFontStyle: js.UndefOr[FS] = js.undefined
  /**
    * Font weight for subtitle text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var subtitleFontWeight: js.UndefOr[FW] = js.undefined
  /**
    * Line height in pixels for multi-line subtitle text.
    */
  var subtitleLineHeight: js.UndefOr[N] = js.undefined
  /**
    * The padding in pixels between title and subtitle text.
    */
  var subtitlePadding: js.UndefOr[N] = js.undefined
}

object BaseTitle {
  @scala.inline
  def apply[N, S, C, FW, FS, A, TB, F, AN, O](
    align: A = null,
    anchor: AN = null,
    angle: N = null,
    baseline: TB = null,
    color: C = null,
    dx: N = null,
    dy: N = null,
    font: S = null,
    fontSize: N = null,
    fontStyle: FS = null,
    fontWeight: FW = null,
    frame: F = null,
    limit: N = null,
    lineHeight: N = null,
    offset: N = null,
    orient: O = null,
    subtitleColor: C = null,
    subtitleFont: S = null,
    subtitleFontSize: N = null,
    subtitleFontStyle: FS = null,
    subtitleFontWeight: FW = null,
    subtitleLineHeight: N = null,
    subtitlePadding: N = null
  ): BaseTitle[N, S, C, FW, FS, A, TB, F, AN, O] = {
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
    __obj.asInstanceOf[BaseTitle[N, S, C, FW, FS, A, TB, F, AN, O]]
  }
}

