package typings.stylus

import typings.stylus.stylusMod.StylusNs.NodesNs.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLeft extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var left: Expression
  var lineno: Double
  var op: String
  var right: Expression
}

object Anon_ColumnFilenameLeft {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    left: Expression,
    lineno: Double,
    op: String,
    right: Expression
  ): Anon_ColumnFilenameLeft = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, left = left, lineno = lineno, op = op, right = right)
  
    __obj.asInstanceOf[Anon_ColumnFilenameLeft]
  }
}

