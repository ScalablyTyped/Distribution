package typings.stylus.stylusMod.StylusNs.NodesNs

import typings.stylus.Anon_ColumnFalseExpr
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
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    falseExpr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    op: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_ColumnFalseExpr,
    trueExpr: Expression
  ): Ternary = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), falseExpr = falseExpr, filename = filename, first = first, hash = hash, lineno = lineno, nodeName = nodeName, op = op, operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON), trueExpr = trueExpr)
  
    __obj.asInstanceOf[Ternary]
  }
}

