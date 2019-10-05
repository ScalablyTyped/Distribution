package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_ColumnFilenameLinenoNodes
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
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hasMedia: scala.Boolean,
    hasProperties: scala.Boolean,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: Double,
    node: Node,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: (java.lang.String, Node) => Node,
    parent: Block,
    push: Node => scala.Unit,
    scope: scala.Boolean,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_ColumnFilenameLinenoNodes
  ): Block = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hasMedia = hasMedia, hasProperties = hasProperties, hash = hash, isEmpty = isEmpty, lineno = lineno, node = node, nodeName = nodeName, nodes = nodes, operate = js.Any.fromFunction2(operate), parent = parent, push = js.Any.fromFunction1(push), scope = scope, shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Block]
  }
}

