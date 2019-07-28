package typings.stylus

import typings.stylus.stylusMod.StylusNs.NodesNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameInherits extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var inherits: Boolean
  var lineno: Double
  var segments: js.Array[Node]
  var `val`: String
}

object Anon_ColumnFilenameInherits {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    inherits: Boolean,
    lineno: Double,
    segments: js.Array[Node],
    `val`: String
  ): Anon_ColumnFilenameInherits = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, inherits = inherits, lineno = lineno, segments = segments)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameInherits]
  }
}

