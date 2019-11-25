package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleProps
  extends _SvgProperties[js.Any] {
  var cx: Double
  var cy: Double
  var r: Double
}

object CircleProps {
  @scala.inline
  def apply(cx: Double, cy: Double, r: Double): CircleProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CircleProps]
  }
}

