package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckJsDirective extends TextRange {
  var enabled: Boolean
}

object CheckJsDirective {
  @scala.inline
  def apply(enabled: Boolean, end: Double, pos: Double): CheckJsDirective = {
    val __obj = js.Dynamic.literal(enabled = enabled, end = end, pos = pos)
  
    __obj.asInstanceOf[CheckJsDirective]
  }
}

