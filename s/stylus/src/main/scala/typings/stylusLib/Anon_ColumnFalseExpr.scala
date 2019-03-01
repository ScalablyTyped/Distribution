package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFalseExpr extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var falseExpr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  var filename: java.lang.String
  var lineno: scala.Double
  var op: java.lang.String
  var trueExpr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
}

object Anon_ColumnFalseExpr {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    falseExpr: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    filename: java.lang.String,
    lineno: scala.Double,
    op: java.lang.String,
    trueExpr: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  ): Anon_ColumnFalseExpr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("falseExpr")(falseExpr)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("trueExpr")(trueExpr)
    __obj.asInstanceOf[Anon_ColumnFalseExpr]
  }
}

