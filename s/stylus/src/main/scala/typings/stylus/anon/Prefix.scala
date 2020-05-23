package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var __type: String
  var block: typings.stylus.mod.Stylus.Nodes.Block
  var column: Double
  var filename: String
  var lineno: Double
  var prefix: String
  var segments: js.Array[Node]
}

object Prefix {
  @scala.inline
  def apply(
    __type: String,
    block: typings.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    filename: String,
    lineno: Double,
    prefix: String,
    segments: js.Array[Node]
  ): Prefix = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
}

