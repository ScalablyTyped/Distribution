package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSemanticError
  extends stdLib.Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSemanticError: yamlLib.yamlLibStrings.YAMLSemanticError
  var source: yamlLib.yamlMod.cstNs.Node
}

object YAMLSemanticError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: yamlLib.yamlLibStrings.YAMLSemanticError,
    source: yamlLib.yamlMod.cstNs.Node,
    stack: java.lang.String = null
  ): YAMLSemanticError = {
    val __obj = js.Dynamic.literal(message = message, name = name, source = source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[YAMLSemanticError]
  }
}

