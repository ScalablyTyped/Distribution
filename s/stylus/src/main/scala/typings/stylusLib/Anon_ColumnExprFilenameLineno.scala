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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("expr")(expr)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.asInstanceOf[Anon_ColumnExprFilenameLineno]
  }
}

