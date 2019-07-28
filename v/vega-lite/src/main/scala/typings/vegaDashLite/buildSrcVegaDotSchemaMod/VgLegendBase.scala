package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLegendBase extends js.Object {
  /**
    * Padding (in pixels) between legend entries in a symbol legend.
    */
  var entryPadding: js.UndefOr[Double] = js.undefined
  /**
    * The offset, in pixels, by which to displace the legend from the edge of the enclosing group or data rectangle.
    *
    * __Default value:__  `0`
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The orientation of the legend, which determines how the legend is positioned within the scene. One of "left", "right", "top-left", "top-right", "bottom-left", "bottom-right", "none".
    *
    * __Default value:__ `"right"`
    */
  var orient: js.UndefOr[LegendOrient] = js.undefined
  /**
    * The padding, in pixels, between the legend and axis.
    */
  var padding: js.UndefOr[Double] = js.undefined
}

object VgLegendBase {
  @scala.inline
  def apply(
    entryPadding: Int | Double = null,
    offset: Int | Double = null,
    orient: LegendOrient = null,
    padding: Int | Double = null
  ): VgLegendBase = {
    val __obj = js.Dynamic.literal()
    if (entryPadding != null) __obj.updateDynamic("entryPadding")(entryPadding.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgLegendBase]
  }
}

