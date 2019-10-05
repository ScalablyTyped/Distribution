package typings.svgDashPanDashZoom.SvgPanZoom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointModifier extends js.Object {
  var x: Double | Boolean
  var y: Double | Boolean
}

object PointModifier {
  @scala.inline
  def apply(x: Double | Boolean, y: Double | Boolean): PointModifier = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointModifier]
  }
}

