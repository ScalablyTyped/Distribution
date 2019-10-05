package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnExprFilename extends js.Object {
  var __type: String
  var column: Double
  var expr: Expression
  var filename: String
  var lineno: Double
  var op: String
}

object Anon_ColumnExprFilename {
  @scala.inline
  def apply(__type: String, column: Double, expr: Expression, filename: String, lineno: Double, op: String): Anon_ColumnExprFilename = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, expr = expr, filename = filename, lineno = lineno, op = op)
  
    __obj.asInstanceOf[Anon_ColumnExprFilename]
  }
}

