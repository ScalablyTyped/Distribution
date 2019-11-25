package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Expression
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
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnFilenameLeft]
  }
}

