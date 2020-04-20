package typings.useResizeObserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefSize extends js.Object {
  var height: Double
  var width: Double
}

object RefSize {
  @scala.inline
  def apply(height: Double, width: Double): RefSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefSize]
  }
}

