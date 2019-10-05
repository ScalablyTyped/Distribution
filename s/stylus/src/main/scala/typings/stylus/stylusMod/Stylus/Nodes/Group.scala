package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends Node {
  var block: Block
  var hasOnlyPlaceholders: scala.Boolean
  var nodes: js.Array[Node]
  /**
    * Push the given `selector` node.
    */
  def push(node: Node): scala.Unit
}

object Group {
  @scala.inline
  def apply(
    block: Block,
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hasOnlyPlaceholders: scala.Boolean,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: (java.lang.String, Node) => Node,
    push: Node => scala.Unit,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_Block
  ): Group = {
    val __obj = js.Dynamic.literal(block = block, clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hasOnlyPlaceholders = hasOnlyPlaceholders, hash = hash, lineno = lineno, nodeName = nodeName, nodes = nodes, operate = js.Any.fromFunction2(operate), push = js.Any.fromFunction1(push), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Group]
  }
}

