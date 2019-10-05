package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Block
import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var __type: String
  var block: Block
  var column: Double
  var filename: String
  var lineno: Double
  var nodes: js.Array[Node]
}

object Anon_Block {
  @scala.inline
  def apply(
    __type: String,
    block: Block,
    column: Double,
    filename: String,
    lineno: Double,
    nodes: js.Array[Node]
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(__type = __type, block = block, column = column, filename = filename, lineno = lineno, nodes = nodes)
  
    __obj.asInstanceOf[Anon_Block]
  }
}

