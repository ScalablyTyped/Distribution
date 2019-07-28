package typings.vegaDashLite.buildSrcTitleMod

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.Anchor
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.TitleOrient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleBase extends js.Object {
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
    * The orthogonal offset in pixels by which to displace the title from its position along the edge of the chart.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The orientation of the title relative to the chart. One of `"top"` (the default), `"bottom"`, `"left"`, or `"right"`.
    */
  var orient: js.UndefOr[TitleOrient] = js.undefined
  /**
    * A [mark style property](https://vega.github.io/vega-lite/docs/config.html#style) to apply to the title text mark.
    *
    * __Default value:__ `"group-title"`.
    */
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
}

object TitleBase {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    offset: Int | Double = null,
    orient: TitleOrient = null,
    style: String | js.Array[String] = null
  ): TitleBase = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleBase]
  }
}

