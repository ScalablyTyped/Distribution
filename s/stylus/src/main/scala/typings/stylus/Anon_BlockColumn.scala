package typings.stylus

import typings.stylus.stylusMod.StylusNs.NodesNs.Block
import typings.stylus.stylusMod.StylusNs.NodesNs.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumn extends js.Object {
  var __type: String
  var block: Block
  var column: Double
  var expr: Expression
  var filename: String
  var key: String
  var lineno: Double
  var `val`: String
}

object Anon_BlockColumn {
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
  ): Anon_BlockColumn = {
    val __obj = js.Dynamic.literal(__type = __type, block = block, column = column, expr = expr, filename = filename, key = key, lineno = lineno)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_BlockColumn]
  }
}

