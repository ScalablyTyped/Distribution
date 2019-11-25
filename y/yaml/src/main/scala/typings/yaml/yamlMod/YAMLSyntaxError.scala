package typings.yaml.yamlMod

import typings.std.Error
import typings.yaml.yamlMod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSyntaxError
  extends Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSyntaxError: typings.yaml.yamlStrings.YAMLSyntaxError
  var source: Node
}

object YAMLSyntaxError {
  @scala.inline
  def apply(
    message: String,
    name: typings.yaml.yamlStrings.YAMLSyntaxError,
    source: Node,
    stack: String = null
  ): YAMLSyntaxError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLSyntaxError]
  }
}

