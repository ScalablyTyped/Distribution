package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_BlockColumnCond
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
    clone: () => Node,
    coerce: Node => Node,
    column: Double,
    cond: Expression,
    elses: js.Array[Expression],
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    negate: scala.Boolean,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_BlockColumnCond
  ): If = {
    val __obj = js.Dynamic.literal(block = block, clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, cond = cond, elses = elses, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, negate = negate, nodeName = nodeName, operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[If]
  }
}

