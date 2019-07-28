package typings.stylus

import typings.stylus.stylusMod.StylusNs.NodesNs.Block
import typings.stylus.stylusMod.StylusNs.NodesNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumnFilename extends js.Object {
  var __type: String
  var block: Block
  var column: Double
  var filename: String
  var lineno: Double
  var prefix: String
  var segments: js.Array[Node]
}

object Anon_BlockColumnFilename {
  @scala.inline
  def apply(
    __type: String,
    block: Block,
    column: Double,
    filename: String,
    lineno: Double,
    prefix: String,
    segments: js.Array[Node]
  ): Anon_BlockColumnFilename = {
    val __obj = js.Dynamic.literal(__type = __type, block = block, column = column, filename = filename, lineno = lineno, prefix = prefix, segments = segments)
  
    __obj.asInstanceOf[Anon_BlockColumnFilename]
  }
}

