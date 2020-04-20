package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: Boolean
  var pre: Boolean
  var script: Boolean
  var style: Boolean
  var textarea: Boolean
}

object AnonCode {
  @scala.inline
  def apply(code: Boolean, pre: Boolean, script: Boolean, style: Boolean, textarea: Boolean): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

