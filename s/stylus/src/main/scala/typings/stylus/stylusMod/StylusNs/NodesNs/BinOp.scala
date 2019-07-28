package typings.stylus.stylusMod.StylusNs.NodesNs

import typings.stylus.Anon_ColumnFilenameLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinOp extends Node {
  var left: Expression
  var op: java.lang.String
  var right: Expression
}

object BinOp {
  @scala.inline
  def apply(
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    left: Expression,
    lineno: Double,
    nodeName: java.lang.String,
    op: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    right: Expression,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_ColumnFilenameLeft
  ): BinOp = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, left = left, lineno = lineno, nodeName = nodeName, op = op, operate = js.Any.fromFunction2(operate), right = right, shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BinOp]
  }
}

