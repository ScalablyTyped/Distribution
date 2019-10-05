package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Block
import typings.stylus.stylusMod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumnCond extends js.Object {
  var __type: String
  var block: Block
  var column: Double
  var cond: Expression
  var elses: js.Array[Expression]
  var filename: String
  var lineno: Double
  var negate: Boolean
}

object Anon_BlockColumnCond {
  @scala.inline
  def apply(
    __type: String,
    block: Block,
    column: Double,
    cond: Expression,
    elses: js.Array[Expression],
    filename: String,
    lineno: Double,
    negate: Boolean
  ): Anon_BlockColumnCond = {
    val __obj = js.Dynamic.literal(__type = __type, block = block, column = column, cond = cond, elses = elses, filename = filename, lineno = lineno, negate = negate)
  
    __obj.asInstanceOf[Anon_BlockColumnCond]
  }
}

