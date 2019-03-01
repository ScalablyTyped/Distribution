package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChangeRange extends js.Object {
  var newLength: scala.Double
  var span: TextSpan
}

object TextChangeRange {
  @scala.inline
  def apply(newLength: scala.Double, span: TextSpan): TextChangeRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newLength")(newLength)
    __obj.updateDynamic("span")(span)
    __obj.asInstanceOf[TextChangeRange]
  }
}

