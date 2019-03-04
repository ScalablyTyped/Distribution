package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLReferenceError
  extends stdLib.Error
     with YAMLError {
  @JSName("name")
  var name_YAMLReferenceError: yamlLib.yamlLibStrings.YAMLReferenceError
  var source: yamlLib.yamlMod.cstNs.Node
}

object YAMLReferenceError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: yamlLib.yamlLibStrings.YAMLReferenceError,
    source: yamlLib.yamlMod.cstNs.Node,
    stack: java.lang.String = null
  ): YAMLReferenceError = {
    val __obj = js.Dynamic.literal(message = message, name = name, source = source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[YAMLReferenceError]
  }
}

