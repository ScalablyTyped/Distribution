package typings.vueTemplateCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: String
  var expression: String
  var value: String
}

object Callback {
  @scala.inline
  def apply(callback: String, expression: String, value: String): Callback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

