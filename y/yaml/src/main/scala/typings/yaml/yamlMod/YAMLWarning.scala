package typings.yaml.yamlMod

import typings.std.Error
import typings.yaml.yamlMod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLWarning extends Error {
  @JSName("name")
  var name_YAMLWarning: typings.yaml.yamlStrings.YAMLReferenceError
  var source: Node
}

object YAMLWarning {
  @scala.inline
  def apply(
    message: String,
    name: typings.yaml.yamlStrings.YAMLReferenceError,
    source: Node,
    stack: String = null
  ): YAMLWarning = {
    val __obj = js.Dynamic.literal(message = message, name = name, source = source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[YAMLWarning]
  }
}

