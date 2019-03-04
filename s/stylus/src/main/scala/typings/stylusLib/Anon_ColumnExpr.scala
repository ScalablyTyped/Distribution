package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnExpr extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var expr: js.UndefOr[stylusLib.stylusMod.StylusNs.NodesNs.Expression] = js.undefined
  var filename: java.lang.String
  var lineno: scala.Double
  var literal: js.UndefOr[stylusLib.stylusMod.StylusNs.NodesNs.Literal] = js.undefined
  var name: java.lang.String
  var segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_ColumnExpr {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    name: java.lang.String,
    segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node],
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression = null,
    literal: stylusLib.stylusMod.StylusNs.NodesNs.Literal = null
  ): Anon_ColumnExpr = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, name = name, segments = segments)
    if (expr != null) __obj.updateDynamic("expr")(expr)
    if (literal != null) __obj.updateDynamic("literal")(literal)
    __obj.asInstanceOf[Anon_ColumnExpr]
  }
}

