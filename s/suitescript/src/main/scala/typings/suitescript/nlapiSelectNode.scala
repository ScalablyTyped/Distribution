package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSelectNode")
@js.native
object nlapiSelectNode extends js.Object {
  /**
    * Select a node from an XML node using XPath. Supports custom namespaces (nodes in default namespace can be referenced using "nlapi" as the prefix)
    *
    * @param {node}    node node being queried
    * @param {string}    xpath string containing XPath expression.
    * @return {node}
    *
    * @since 2008.1
    * @param node
    * @param xpath
    * @return
    */
  def apply(node: js.Any, xpath: String): js.Any = js.native
}

