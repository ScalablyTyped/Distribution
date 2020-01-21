package typings.xmlCore.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "SelectSingleNode")
@js.native
object SelectSingleNode extends js.Object {
  /**
    * Returns single Node from given Node
    *
    * @export
    * @param {Node} node
    * @param {string} path
    * @returns
    */
  def apply(node: Node, path: String): Node | Null = js.native
}

