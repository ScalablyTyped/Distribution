package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSpan extends js.Object {
  var length: Double
  var start: Double
}

object TextSpan {
  @scala.inline
  def apply(length: Double, start: Double): TextSpan = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextSpan]
  }
}

