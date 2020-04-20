package typings.svgPanZoom.SvgPanZoom_

import typings.svgPanZoom.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizes extends js.Object {
  var height: Double
  var realZoom: Double
  var viewBox: AnonHeight
  var width: Double
}

object Sizes {
  @scala.inline
  def apply(height: Double, realZoom: Double, viewBox: AnonHeight, width: Double): Sizes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], realZoom = realZoom.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizes]
  }
}

