package typings.stylus

import typings.stylus.stylusMod.StylusNs.NodesNs.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoPath extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var path: Expression
}

object Anon_ColumnFilenameLinenoPath {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, path: Expression): Anon_ColumnFilenameLinenoPath = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, path = path)
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoPath]
  }
}

