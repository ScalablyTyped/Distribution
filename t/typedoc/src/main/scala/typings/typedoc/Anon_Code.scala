package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Boolean
  var pre: Boolean
  var script: Boolean
  var style: Boolean
  var textarea: Boolean
}

object Anon_Code {
  @scala.inline
  def apply(code: Boolean, pre: Boolean, script: Boolean, style: Boolean, textarea: Boolean): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, pre = pre, script = script, style = style, textarea = textarea)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

