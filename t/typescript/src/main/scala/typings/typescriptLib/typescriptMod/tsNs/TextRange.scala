package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRange extends js.Object {
  var end: scala.Double
  var pos: scala.Double
}

object TextRange {
  @scala.inline
  def apply(end: scala.Double, pos: scala.Double): TextRange = {
    val __obj = js.Dynamic.literal(end = end, pos = pos)
  
    __obj.asInstanceOf[TextRange]
  }
}

