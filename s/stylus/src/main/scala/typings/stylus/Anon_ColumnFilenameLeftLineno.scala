package typings.stylus

import typings.stylus.stylusMod.StylusNs.NodesNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLeftLineno extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var left: Node
  var lineno: Double
  var right: Node
  var `val`: js.UndefOr[String] = js.undefined
}

object Anon_ColumnFilenameLeftLineno {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    left: Node,
    lineno: Double,
    right: Node,
    `val`: String = null
  ): Anon_ColumnFilenameLeftLineno = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, left = left, lineno = lineno, right = right)
    if (`val` != null) __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLeftLineno]
  }
}

