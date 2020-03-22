package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnExpr extends js.Object {
  var __type: String
  var column: Double
  var expr: Expression
  var filename: String
  var lineno: Double
}

object AnonColumnExpr {
  @scala.inline
  def apply(__type: String, column: Double, expr: Expression, filename: String, lineno: Double): AnonColumnExpr = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnExpr]
  }
}

