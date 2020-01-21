package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnFalseExpr extends js.Object {
  var __type: String
  var column: Double
  var falseExpr: Expression
  var filename: String
  var lineno: Double
  var op: String
  var trueExpr: Expression
}

object AnonColumnFalseExpr {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    falseExpr: Expression,
    filename: String,
    lineno: Double,
    op: String,
    trueExpr: Expression
  ): AnonColumnFalseExpr = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], falseExpr = falseExpr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], trueExpr = trueExpr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnFalseExpr]
  }
}

