package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckJsDirective extends TextRange {
  var enabled: Boolean
}

object CheckJsDirective {
  @scala.inline
  def apply(enabled: Boolean, end: Double, pos: Double): CheckJsDirective = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckJsDirective]
  }
}

