package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var column: scala.Double
  var filename: java.lang.String
  var first: Node
  var hash: java.lang.String
  var lineno: scala.Double
  var nodeName: java.lang.String
  /**
    *  Default coercion throws.
    */
  def coerce(other: Node): Node
  /**
    * Nodes by default evaluate to themselves.
    */
  def eval(): Node
  /**
    * Operate on `right` with the given `op`.
    */
  def operate(op: java.lang.String, right: Node): Node
  /**
    * Return false if `op` is generally not coerced.
    */
  def shouldCoerce(op: java.lang.String): scala.Boolean
  /**
    * Return true.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def toBoolean(): Boolean
  /**
    * Return the expression, or wrap this node in an expression.
    */
  def toExpression(): Expression
  /**
    * Return a JSON representation of this node.
    */
  def toJSON(): stylusLib.Anon_Column
}

object Node {
  @scala.inline
  def apply(
    clone: () => Node,
    coerce: Node => Node,
    column: scala.Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => stylusLib.Anon_Column
  ): Node = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Node]
  }
}

