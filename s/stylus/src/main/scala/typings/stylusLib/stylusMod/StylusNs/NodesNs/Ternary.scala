package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ternary extends Node {
  var falseExpr: Expression
  var op: java.lang.String
  var trueExpr: Expression
}

object Ternary {
  @scala.inline
  def apply(
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    falseExpr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: scala.Double,
    nodeName: java.lang.String,
    op: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFalseExpr],
    trueExpr: Expression
  ): Ternary = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, falseExpr = falseExpr, filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, op = op, operate = operate, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON, trueExpr = trueExpr)
  
    __obj.asInstanceOf[Ternary]
  }
}

