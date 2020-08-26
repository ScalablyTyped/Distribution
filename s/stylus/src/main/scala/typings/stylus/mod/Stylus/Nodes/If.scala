package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait If extends Node {
  var block: Block = js.native
  var cond: Expression = js.native
  var elses: js.Array[Expression] = js.native
  var negate: scala.Boolean = js.native
}

object If {
  @scala.inline
  def apply(
    block: Block,
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
    toJSON: () => Column
  ): If = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], elses = elses.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[If]
  }
  @scala.inline
  implicit class IfOps[Self <: If] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setCond(value: Expression): Self = this.set("cond", value.asInstanceOf[js.Any])
    @scala.inline
    def setElsesVarargs(value: Expression*): Self = this.set("elses", js.Array(value :_*))
    @scala.inline
    def setElses(value: js.Array[Expression]): Self = this.set("elses", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegate(value: scala.Boolean): Self = this.set("negate", value.asInstanceOf[js.Any])
  }
  
}

