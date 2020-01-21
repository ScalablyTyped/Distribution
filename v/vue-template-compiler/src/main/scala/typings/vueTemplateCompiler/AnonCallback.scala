package typings.vueTemplateCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: String
  var expression: String
  var value: String
}

object AnonCallback {
  @scala.inline
  def apply(callback: String, expression: String, value: String): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}

