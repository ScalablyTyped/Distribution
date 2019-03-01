package typings
package svgDashPanDashZoomLib.SvgPanZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizes extends js.Object {
  var height: scala.Double
  var realZoom: scala.Double
  var viewBox: svgDashPanDashZoomLib.Anon_Height
  var width: scala.Double
}

object Sizes {
  @scala.inline
  def apply(
    height: scala.Double,
    realZoom: scala.Double,
    viewBox: svgDashPanDashZoomLib.Anon_Height,
    width: scala.Double
  ): Sizes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("realZoom")(realZoom)
    __obj.updateDynamic("viewBox")(viewBox)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Sizes]
  }
}

