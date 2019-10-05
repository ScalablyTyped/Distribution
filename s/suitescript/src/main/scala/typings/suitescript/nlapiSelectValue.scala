package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSelectValue")
@js.native
object nlapiSelectValue extends js.Object {
  /**
    * select a value from an XML node using XPath. Supports custom namespaces (nodes in default namespace can be referenced using "nlapi" as the prefix)
    *
    * @param {node} node node being queried
    * @param {string} xpath string containing XPath expression.
    * @return {string}
    *
    * @since 2008.2
    * @param node
    * @param xpath
    * @return
    */
  def apply(node: js.Any, xpath: String): String = js.native
}

