package typings.svgDashPanDashZoom.SvgPanZoomNs

import typings.svgDashPanDashZoom.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizes extends js.Object {
  var height: Double
  var realZoom: Double
  var viewBox: Anon_Height
  var width: Double
}

object Sizes {
  @scala.inline
  def apply(height: Double, realZoom: Double, viewBox: Anon_Height, width: Double): Sizes = {
    val __obj = js.Dynamic.literal(height = height, realZoom = realZoom, viewBox = viewBox, width = width)
  
    __obj.asInstanceOf[Sizes]
  }
}

