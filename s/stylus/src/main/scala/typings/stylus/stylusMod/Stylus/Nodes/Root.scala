package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_ColumnFilename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends Node {
  var nodes: js.Array[Node]
  /**
    * Push a `node` to this block.
    */
  def push(node: Node): scala.Unit
  /**
    * Unshift a `node` to this block.
    */
  def unshift(node: Node): scala.Unit
}

object Root {
  @scala.inline
  def apply(
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: (java.lang.String, Node) => Node,
    push: Node => scala.Unit,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_ColumnFilename,
    unshift: Node => scala.Unit
  ): Root = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, nodes = nodes, operate = js.Any.fromFunction2(operate), push = js.Any.fromFunction1(push), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON), unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[Root]
  }
}

