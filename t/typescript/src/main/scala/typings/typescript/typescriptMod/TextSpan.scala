package typings.typescript.typescriptMod

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
    val __obj = js.Dynamic.literal(length = length, start = start)
  
    __obj.asInstanceOf[TextSpan]
  }
}

