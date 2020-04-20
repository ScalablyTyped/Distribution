package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipseProps
  extends _SvgProperties[js.Any] {
  var cx: Double
  var cy: Double
  var rx: Double
  var ry: Double
}

object EllipseProps {
  @scala.inline
  def apply(cx: Double, cy: Double, rx: Double, ry: Double): EllipseProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipseProps]
  }
}

