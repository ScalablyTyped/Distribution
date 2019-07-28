package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgTitleConfig extends js.Object {
  /**
    * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    *
    * __Default value:__ `"middle"` for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views.
    * `"start"` for other composite views.
    *
    * __Note:__ [For now](https://github.com/vega/vega-lite/issues/2875), `anchor` is only customizable only for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views.  For other composite views, `anchor` is always `"start"`.
    */
  var anchor: js.UndefOr[Anchor] = js.undefined
  /**
    * Angle in degrees of title text.
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Vertical text baseline for title text.
    */
  var baseline: js.UndefOr[VerticalAlign] = js.undefined
  /**
    * Text color for title text.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Font name for title text.
    */
  var font: js.UndefOr[String] = js.undefined
  /**
    * Font size in pixels for title text.
    *
    * __Default value:__ `10`.
    *
    * @minimum 0
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Font weight for title text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  /**
    * The maximum allowed length in pixels of legend labels.
    *
    * @minimum 0
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Offset in pixels of the title from the chart body and axes.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Default title orientation ("top", "bottom", "left", or "right")
    */
  var orient: js.UndefOr[TitleOrient] = js.undefined
}

object VgTitleConfig {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    angle: Int | Double = null,
    baseline: VerticalAlign = null,
    color: String = null,
    font: String = null,
    fontSize: Int | Double = null,
    fontWeight: FontWeight = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    orient: TitleOrient = null
  ): VgTitleConfig = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    __obj.asInstanceOf[VgTitleConfig]
  }
}

