package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Block
import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockColumnFilenameLinenoSegments extends js.Object {
  var __type: String
  var block: js.UndefOr[Block] = js.undefined
  var column: Double
  var filename: String
  var lineno: Double
  var segments: js.Array[Node]
  var `type`: String
}

object AnonBlockColumnFilenameLinenoSegments {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    segments: js.Array[Node],
    `type`: String,
    block: Block = null
  ): AnonBlockColumnFilenameLinenoSegments = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockColumnFilenameLinenoSegments]
  }
}

