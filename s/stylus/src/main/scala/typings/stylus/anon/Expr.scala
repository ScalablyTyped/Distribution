package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Expression
import typings.stylus.mod.Stylus.Nodes.Literal
import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expr extends js.Object {
  var __type: String = js.native
  var column: Double = js.native
  var expr: js.UndefOr[Expression] = js.native
  var filename: String = js.native
  var lineno: Double = js.native
  var literal: js.UndefOr[Literal] = js.native
  var name: String = js.native
  var segments: js.Array[Node] = js.native
}

object Expr {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    name: String,
    segments: js.Array[Node]
  ): Expr = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
  @scala.inline
  implicit class ExprOps[Self <: Expr] (val x: Self) extends AnyVal {
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
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegmentsVarargs(value: Node*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[Node]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpr(value: Expression): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpr: Self = this.set("expr", js.undefined)
    @scala.inline
    def setLiteral(value: Literal): Self = this.set("literal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiteral: Self = this.set("literal", js.undefined)
  }
  
}

