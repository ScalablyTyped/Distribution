package typings.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sugar.js
trait StrokeData extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dasharray: js.UndefOr[String] = js.undefined
  var dashoffset: js.UndefOr[Double] = js.undefined
  var linecap: js.UndefOr[String] = js.undefined
  var linejoin: js.UndefOr[String] = js.undefined
  var miterlimit: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StrokeData {
  @scala.inline
  def apply(
    color: String = null,
    dasharray: String = null,
    dashoffset: js.UndefOr[Double] = js.undefined,
    linecap: String = null,
    linejoin: String = null,
    miterlimit: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): StrokeData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dasharray != null) __obj.updateDynamic("dasharray")(dasharray.asInstanceOf[js.Any])
    if (!js.isUndefined(dashoffset)) __obj.updateDynamic("dashoffset")(dashoffset.get.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap.asInstanceOf[js.Any])
    if (linejoin != null) __obj.updateDynamic("linejoin")(linejoin.asInstanceOf[js.Any])
    if (!js.isUndefined(miterlimit)) __obj.updateDynamic("miterlimit")(miterlimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeData]
  }
}

