package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  /**
    * The source location information of the node.
    */
  var loc: SourceLocation
  /**
    * The parent node of the current node
    */
  var parent: js.UndefOr[Node] = js.undefined
  /**
    * An array of two numbers.
    * Both numbers are a 0-based index which is the position in the array of source code characters.
    * The first is the start position of the node, the second is the end position of the node.
    */
  var range: Range
}

object BaseNode {
  @scala.inline
  def apply(loc: SourceLocation, range: Range, parent: Node = null): BaseNode = {
    val __obj = js.Dynamic.literal(loc = loc, range = range)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[BaseNode]
  }
}

