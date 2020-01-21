package typings.vueTemplateCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameValue extends js.Object {
  var name: String
  var value: String
}

object AnonNameValue {
  @scala.inline
  def apply(name: String, value: String): AnonNameValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameValue]
  }
}

