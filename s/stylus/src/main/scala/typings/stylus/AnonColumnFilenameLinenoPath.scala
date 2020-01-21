package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnFilenameLinenoPath extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var path: Expression
}

object AnonColumnFilenameLinenoPath {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, path: Expression): AnonColumnFilenameLinenoPath = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnFilenameLinenoPath]
  }
}

