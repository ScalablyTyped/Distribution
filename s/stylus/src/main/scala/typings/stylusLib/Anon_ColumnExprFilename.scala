package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnExprFilename extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  var filename: java.lang.String
  var lineno: scala.Double
  var op: java.lang.String
}

object Anon_ColumnExprFilename {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    filename: java.lang.String,
    lineno: scala.Double,
    op: java.lang.String
  ): Anon_ColumnExprFilename = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, expr = expr, filename = filename, lineno = lineno, op = op)
  
    __obj.asInstanceOf[Anon_ColumnExprFilename]
  }
}

