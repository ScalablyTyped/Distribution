package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOp extends js.Object {
  var __type: String
  var column: Double
  var expr: Expression
  var filename: String
  var lineno: Double
  var op: String
}

object AnonOp {
  @scala.inline
  def apply(__type: String, column: Double, expr: Expression, filename: String, lineno: Double, op: String): AnonOp = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOp]
  }
}

