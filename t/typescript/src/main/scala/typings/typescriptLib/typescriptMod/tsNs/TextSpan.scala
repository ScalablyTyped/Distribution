package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSpan extends js.Object {
  var length: scala.Double
  var start: scala.Double
}

object TextSpan {
  @scala.inline
  def apply(length: scala.Double, start: scala.Double): TextSpan = {
    val __obj = js.Dynamic.literal(length = length, start = start)
  
    __obj.asInstanceOf[TextSpan]
  }
}

