package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Expression
import typings.stylus.stylusMod.Stylus.Nodes.Literal
import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnExpr extends js.Object {
  var __type: String
  var column: Double
  var expr: js.UndefOr[Expression] = js.undefined
  var filename: String
  var lineno: Double
  var literal: js.UndefOr[Literal] = js.undefined
  var name: String
  var segments: js.Array[Node]
}

object Anon_ColumnExpr {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    name: String,
    segments: js.Array[Node],
    expr: Expression = null,
    literal: Literal = null
  ): Anon_ColumnExpr = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, name = name, segments = segments)
    if (expr != null) __obj.updateDynamic("expr")(expr)
    if (literal != null) __obj.updateDynamic("literal")(literal)
    __obj.asInstanceOf[Anon_ColumnExpr]
  }
}

