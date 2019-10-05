package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSelectNodes")
@js.native
object nlapiSelectNodes extends js.Object {
  /**
    * Select an array of nodes from an XML node using XPath. Supports custom namespaces (nodes in default namespace can be referenced using "nlapi" as the prefix)
    *
    * @param {node}    node node being queried
    * @param {string}    xpath string containing XPath expression.
    * @return {node[]}
    *
    * @since 2008.1
    * @param node
    * @param xpath
    */
  def apply(node: js.Any, xpath: String): js.Any = js.native
}

