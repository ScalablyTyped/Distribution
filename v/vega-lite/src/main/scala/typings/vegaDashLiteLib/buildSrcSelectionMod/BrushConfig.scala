package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrushConfig extends js.Object {
  /**
    * The fill color of the interval mark.
    *
    * __Default value:__ `#333333`
    *
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fill opacity of the interval mark (a value between 0 and 1).
    *
    * __Default value:__ `0.125`
    */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke color of the interval mark.
    *
    * __Default value:__ `#ffffff`
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of alternating stroke and space lengths,
    * for creating dashed or dotted lines.
    */
  var strokeDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The offset (in pixels) with which to begin drawing the stroke dash array.
    */
  var strokeDashOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke opacity of the interval mark (a value between 0 and 1).
    */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke width of the interval mark.
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object BrushConfig {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeDash: js.Array[scala.Double] = null,
    strokeDashOffset: scala.Int | scala.Double = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null
  ): BrushConfig = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushConfig]
  }
}

