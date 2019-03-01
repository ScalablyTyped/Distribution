package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sugar.js
trait StrokeData extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dasharray: js.UndefOr[java.lang.String] = js.undefined
  var dashoffset: js.UndefOr[scala.Double] = js.undefined
  var linecap: js.UndefOr[java.lang.String] = js.undefined
  var linejoin: js.UndefOr[java.lang.String] = js.undefined
  var miterlimit: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object StrokeData {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dasharray: java.lang.String = null,
    dashoffset: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linejoin: java.lang.String = null,
    miterlimit: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): StrokeData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dasharray != null) __obj.updateDynamic("dasharray")(dasharray)
    if (dashoffset != null) __obj.updateDynamic("dashoffset")(dashoffset.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linejoin != null) __obj.updateDynamic("linejoin")(linejoin)
    if (miterlimit != null) __obj.updateDynamic("miterlimit")(miterlimit.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeData]
  }
}

