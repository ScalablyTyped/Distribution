package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLWarning
  extends stdLib.Error {
  @JSName("name")
  var name_YAMLWarning: yamlLib.yamlLibStrings.YAMLReferenceError
  var source: yamlLib.yamlMod.cstNs.Node
}

object YAMLWarning {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: yamlLib.yamlLibStrings.YAMLReferenceError,
    source: yamlLib.yamlMod.cstNs.Node,
    stack: java.lang.String = null
  ): YAMLWarning = {
    val __obj = js.Dynamic.literal(message = message, name = name, source = source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[YAMLWarning]
  }
}

