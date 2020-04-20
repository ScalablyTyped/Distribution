package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathProps
  extends _SvgProperties[js.Any] {
  var d: String
}

object PathProps {
  @scala.inline
  def apply(d: String): PathProps = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProps]
  }
}

