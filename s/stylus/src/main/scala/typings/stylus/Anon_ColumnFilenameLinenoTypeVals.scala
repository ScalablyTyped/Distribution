package typings.stylus

import typings.stylus.stylusMod.Stylus.Dictionary
import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoTypeVals extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var vals: Dictionary[Node]
}

object Anon_ColumnFilenameLinenoTypeVals {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, vals: Dictionary[Node]): Anon_ColumnFilenameLinenoTypeVals = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoTypeVals]
  }
}

