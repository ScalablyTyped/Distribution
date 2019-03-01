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
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_Column]
  ): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Node]
  }
}

