package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgTitle extends js.Object {
  /**
    * The anchor position for placing the title. One of `"start"`, `"middle"` (the default), or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    */
  var anchor: js.UndefOr[Anchor] = js.undefined
  /**
    * The orthogonal offset in pixels by which to displace the title from its position along the edge of the chart.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The orientation of the title relative to the chart. One of `"top"` (the default), `"bottom"`, `"left"`, or `"right"`.
    */
  var orient: js.UndefOr[TitleOrient] = js.undefined
  var style: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The title text.
    */
  var text: java.lang.String
}

object VgTitle {
  @scala.inline
  def apply(
    text: java.lang.String,
    anchor: Anchor = null,
    offset: scala.Int | scala.Double = null,
    orient: TitleOrient = null,
    style: java.lang.String | js.Array[java.lang.String] = null
  ): VgTitle = {
    val __obj = js.Dynamic.literal(text = text)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgTitle]
  }
}

