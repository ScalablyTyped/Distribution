package typings.stylus.stylusMod.StylusNs.NodesNs

import typings.stylus.Anon_BlockColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Each extends Node {
  var block: Block
  var expr: Expression
  var key: java.lang.String
  var `val`: java.lang.String
}

object Each {
  @scala.inline
  def apply(
    block: Block,
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    expr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    key: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_BlockColumn,
    `val`: java.lang.String
  ): Each = {
    val __obj = js.Dynamic.literal(block = block, clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), expr = expr, filename = filename, first = first, hash = hash, key = key, lineno = lineno, nodeName = nodeName, operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Each]
  }
}

