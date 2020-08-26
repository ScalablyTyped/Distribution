package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Left extends js.Object {
  var __type: String = js.native
  var column: Double = js.native
  var filename: String = js.native
  var left: Expression = js.native
  var lineno: Double = js.native
  var op: String = js.native
  var right: Expression = js.native
}

object Left {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    left: Expression,
    lineno: Double,
    op: String,
    right: Expression
  ): Left = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  @scala.inline
  implicit class LeftOps[Self <: Left] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Expression): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Expression): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

