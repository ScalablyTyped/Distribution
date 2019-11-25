package typings.vueDashTemplateDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: String
  var expression: String
  var value: String
}

object Anon_Callback {
  @scala.inline
  def apply(callback: String, expression: String, value: String): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

