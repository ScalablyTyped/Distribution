package typings.yaml.yamlMod

import typings.std.Error
import typings.yaml.yamlMod.cstNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLReferenceError
  extends Error
     with YAMLError {
  @JSName("name")
  var name_YAMLReferenceError: typings.yaml.yamlStrings.YAMLReferenceError
  var source: Node
}

object YAMLReferenceError {
  @scala.inline
  def apply(
    message: String,
    name: typings.yaml.yamlStrings.YAMLReferenceError,
    source: Node,
    stack: String = null
  ): YAMLReferenceError = {
    val __obj = js.Dynamic.literal(message = message, name = name, source = source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[YAMLReferenceError]
  }
}

