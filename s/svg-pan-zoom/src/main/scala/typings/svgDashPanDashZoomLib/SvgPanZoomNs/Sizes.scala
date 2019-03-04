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
    val __obj = js.Dynamic.literal(height = height, realZoom = realZoom, viewBox = viewBox, width = width)
  
    __obj.asInstanceOf[Sizes]
  }
}

