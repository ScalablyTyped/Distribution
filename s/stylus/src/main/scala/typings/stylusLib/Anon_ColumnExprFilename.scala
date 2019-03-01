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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("expr")(expr)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("op")(op)
    __obj.asInstanceOf[Anon_ColumnExprFilename]
  }
}

