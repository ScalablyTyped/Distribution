package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSyntaxError
  extends stdLib.Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSyntaxError: yamlLib.yamlLibStrings.YAMLSyntaxError
  var source: yamlLib.yamlMod.cstNs.Node
}

object YAMLSyntaxError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: yamlLib.yamlLibStrings.YAMLSyntaxError,
    source: yamlLib.yamlMod.cstNs.Node,
    stack: java.lang.String = null
  ): YAMLSyntaxError = {
    val __obj = js.Dynamic.literal(message = message, name = name, source = source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[YAMLSyntaxError]
  }
}

