package typings.yaml.yamlMod

import typings.std.Error
import typings.yaml.yamlMod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSemanticError
  extends Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSemanticError: typings.yaml.yamlStrings.YAMLSemanticError
  var source: Node
}

object YAMLSemanticError {
  @scala.inline
  def apply(
    message: String,
    name: typings.yaml.yamlStrings.YAMLSemanticError,
    source: Node,
    stack: String = null
  ): YAMLSemanticError = {
    val __obj = js.Dynamic.literal(message = message, name = name, source = source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[YAMLSemanticError]
  }
}

