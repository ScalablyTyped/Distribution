package typings
package svgDashPanDashZoomLib.SvgPanZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointModifier extends js.Object {
  var x: scala.Double | scala.Boolean
  var y: scala.Double | scala.Boolean
}

object PointModifier {
  @scala.inline
  def apply(x: scala.Double | scala.Boolean, y: scala.Double | scala.Boolean): PointModifier = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointModifier]
  }
}

