package typings.svgDotJs.svgDotJsMod

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
    dashoffset: Int | Double = null,
    linecap: String = null,
    linejoin: String = null,
    miterlimit: Int | Double = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): StrokeData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dasharray != null) __obj.updateDynamic("dasharray")(dasharray.asInstanceOf[js.Any])
    if (dashoffset != null) __obj.updateDynamic("dashoffset")(dashoffset.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap.asInstanceOf[js.Any])
    if (linejoin != null) __obj.updateDynamic("linejoin")(linejoin.asInstanceOf[js.Any])
    if (miterlimit != null) __obj.updateDynamic("miterlimit")(miterlimit.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeData]
  }
}

