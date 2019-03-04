package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnExprFilenameLineno extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  var filename: java.lang.String
  var lineno: scala.Double
}

object Anon_ColumnExprFilenameLineno {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    expr: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    filename: java.lang.String,
    lineno: scala.Double
  ): Anon_ColumnExprFilenameLineno = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, expr = expr, filename = filename, lineno = lineno)
  
    __obj.asInstanceOf[Anon_ColumnExprFilenameLineno]
  }
}

