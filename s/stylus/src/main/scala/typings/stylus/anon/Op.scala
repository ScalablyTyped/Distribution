package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Op extends js.Object {
  var __type: String = js.native
  var column: Double = js.native
  var expr: Expression = js.native
  var filename: String = js.native
  var lineno: Double = js.native
  var op: String = js.native
}

object Op {
  @scala.inline
  def apply(__type: String, column: Double, expr: Expression, filename: String, lineno: Double, op: String): Op = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  @scala.inline
  implicit class OpOps[Self <: Op] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__type(value: String): Self = this.set("__type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpr(value: Expression): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
  }
  
}

