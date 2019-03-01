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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[CheckJsDirective]
  }
}

