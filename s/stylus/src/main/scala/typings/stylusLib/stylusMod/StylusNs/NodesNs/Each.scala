package typings
package stylusLib.stylusMod.StylusNs.NodesNs

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
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    expr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    key: java.lang.String,
    lineno: scala.Double,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_BlockColumn],
    `val`: java.lang.String
  ): Each = {
    val __obj = js.Dynamic.literal(block = block, clone = clone, coerce = coerce, column = column, eval = eval, expr = expr, filename = filename, first = first, hash = hash, key = key, lineno = lineno, nodeName = nodeName, operate = operate, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Each]
  }
}

