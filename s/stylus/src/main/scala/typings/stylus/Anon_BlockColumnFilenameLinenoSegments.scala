package typings.stylus

import typings.stylus.stylusMod.StylusNs.NodesNs.Block
import typings.stylus.stylusMod.StylusNs.NodesNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumnFilenameLinenoSegments extends js.Object {
  var __type: String
  var block: js.UndefOr[Block] = js.undefined
  var column: Double
  var filename: String
  var lineno: Double
  var segments: js.Array[Node]
  var `type`: String
}

object Anon_BlockColumnFilenameLinenoSegments {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    segments: js.Array[Node],
    `type`: String,
    block: Block = null
  ): Anon_BlockColumnFilenameLinenoSegments = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, segments = segments)
    __obj.updateDynamic("type")(`type`)
    if (block != null) __obj.updateDynamic("block")(block)
    __obj.asInstanceOf[Anon_BlockColumnFilenameLinenoSegments]
  }
}

