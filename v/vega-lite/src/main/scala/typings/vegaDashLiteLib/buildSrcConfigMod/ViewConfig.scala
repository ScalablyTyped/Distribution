package typings
package vegaDashLiteLib.buildSrcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewConfig extends js.Object {
  /**
    * Whether the view should be clipped.
    */
  var clip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The fill color.
    *
    * __Default value:__ (none)
    *
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fill opacity (value between [0,1]).
    *
    * __Default value:__ (none)
    *
    */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default height of the single plot or each plot in a trellis plot when the visualization has a continuous (non-ordinal) y-scale with `rangeStep` = `null`.
    *
    * __Default value:__ `200`
    *
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke color.
    *
    * __Default value:__ (none)
    *
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of alternating stroke, space lengths for creating dashed or dotted lines.
    *
    * __Default value:__ (none)
    *
    */
  var strokeDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The offset (in pixels) into which to begin drawing with the stroke dash array.
    *
    * __Default value:__ (none)
    *
    */
  var strokeDashOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke line join method. One of miter (default), round or bevel.
    *
    * __Default value:__ 'miter'
    *
    */
  var strokeJoin: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.StrokeJoin] = js.undefined
  /**
    * The stroke line join method. One of miter (default), round or bevel.
    *
    * __Default value:__ 'miter'
    *
    */
  var strokeMiterLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke opacity (value between [0,1]).
    *
    * __Default value:__ (none)
    *
    */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke width, in pixels.
    *
    * __Default value:__ (none)
    *
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default width of the single plot or each plot in a trellis plot when the visualization has a continuous (non-ordinal) x-scale or ordinal x-scale with `rangeStep` = `null`.
    *
    * __Default value:__ `200`
    *
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ViewConfig {
  @scala.inline
  def apply(
    clip: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeDash: js.Array[scala.Double] = null,
    strokeDashOffset: scala.Int | scala.Double = null,
    strokeJoin: vegaDashLiteLib.buildSrcVegaDotSchemaMod.StrokeJoin = null,
    strokeMiterLimit: scala.Int | scala.Double = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ViewConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin)
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewConfig]
  }
}

