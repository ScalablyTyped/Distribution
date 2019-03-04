package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait If extends Node {
  var block: Block
  var cond: Expression
  var elses: js.Array[Expression]
  var negate: scala.Boolean
}

object If {
  @scala.inline
  def apply(
    block: Block,
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    cond: Expression,
    elses: js.Array[Expression],
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: scala.Double,
    negate: scala.Boolean,
    nodeName: java.lang.String,
    operate: js.Function2[java.lang.String, Node, Node],
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_BlockColumnCond]
  ): If = {
    val __obj = js.Dynamic.literal(block = block, clone = clone, coerce = coerce, column = column, cond = cond, elses = elses, eval = eval, filename = filename, first = first, hash = hash, lineno = lineno, negate = negate, nodeName = nodeName, operate = operate, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
  
    __obj.asInstanceOf[If]
  }
}

