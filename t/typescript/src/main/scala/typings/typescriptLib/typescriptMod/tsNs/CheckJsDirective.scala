package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckJsDirective extends TextRange {
  var enabled: scala.Boolean
}

object CheckJsDirective {
  @scala.inline
  def apply(enabled: scala.Boolean, end: scala.Double, pos: scala.Double): CheckJsDirective = {
    val __obj = js.Dynamic.literal(enabled = enabled, end = end, pos = pos)
  
    __obj.asInstanceOf[CheckJsDirective]
  }
}

