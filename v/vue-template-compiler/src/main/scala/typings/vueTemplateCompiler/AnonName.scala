package typings.vueTemplateCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var value: js.Any
}

object AnonName {
  @scala.inline
  def apply(name: String, value: js.Any): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

