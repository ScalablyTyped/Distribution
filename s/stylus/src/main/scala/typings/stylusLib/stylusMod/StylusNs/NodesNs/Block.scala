package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends Node {
  var hasMedia: scala.Boolean
  var hasProperties: scala.Boolean
  var isEmpty: scala.Boolean
  var node: Node
  var nodes: js.Array[Node]
  var parent: Block
  var scope: scala.Boolean
  /**
    * Push a `node` to this block.
    */
  def push(node: Node): scala.Unit
}

object Block {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hasMedia: scala.Boolean,
    hasProperties: scala.Boolean,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: scala.Double,
    node: Node,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: js.Function2[java.lang.String, Node, Node],
    parent: Block,
    push: js.Function1[Node, scala.Unit],
    scope: scala.Boolean,
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoNodes]
  ): Block = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hasMedia = hasMedia, hasProperties = hasProperties, hash = hash, isEmpty = isEmpty, lineno = lineno, node = node, nodeName = nodeName, nodes = nodes, operate = operate, parent = parent, push = push, scope = scope, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
  
    __obj.asInstanceOf[Block]
  }
}

