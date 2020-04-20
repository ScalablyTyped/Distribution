package typings.stylus.mod.Stylus.Nodes

import typings.stylus.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var column: Double
  var filename: java.lang.String
  var first: Node
  var hash: java.lang.String
  var lineno: Double
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
  def toJSON(): AnonColumn
}

object Node {
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => AnonColumn
  ): Node = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Node]
  }
}

