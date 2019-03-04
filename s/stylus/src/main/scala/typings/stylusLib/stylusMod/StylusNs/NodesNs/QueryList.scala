package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryList extends Node {
  var nodes: js.Array[Node]
  /**
    * Merges this query list with the `other`.
    */
  def merge(other: QueryList): QueryList
  /**
    * Push the given `node`.
    */
  def push(node: Node): scala.Unit
}

object QueryList {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: scala.Double,
    merge: js.Function1[QueryList, QueryList],
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: js.Function2[java.lang.String, Node, Node],
    push: js.Function1[Node, scala.Unit],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoNodesType]
  ): QueryList = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hash = hash, lineno = lineno, merge = merge, nodeName = nodeName, nodes = nodes, operate = operate, push = push, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
  
    __obj.asInstanceOf[QueryList]
  }
}

