package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var __type: String = js.native
  var block: typings.stylus.mod.Stylus.Nodes.Block = js.native
  var column: Double = js.native
  var expr: Expression = js.native
  var filename: String = js.native
  var key: String = js.native
  var lineno: Double = js.native
  var `val`: String = js.native
}

object Key {
  @scala.inline
  def apply(
    __type: String,
    block: typings.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    expr: Expression,
    filename: String,
    key: String,
    lineno: Double,
    `val`: String
  ): Key = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def setBlock(value: typings.stylus.mod.Stylus.Nodes.Block): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpr(value: Expression): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: String): Self = this.set("val", value.asInstanceOf[js.Any])
  }
  
}

