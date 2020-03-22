package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Block
import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var __type: String
  var block: Block
  var column: Double
  var expr: Expression
  var filename: String
  var key: String
  var lineno: Double
  var `val`: String
}

object AnonKey {
  @scala.inline
  def apply(
    __type: String,
    block: Block,
    column: Double,
    expr: Expression,
    filename: String,
    key: String,
    lineno: Double,
    `val`: String
  ): AnonKey = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

