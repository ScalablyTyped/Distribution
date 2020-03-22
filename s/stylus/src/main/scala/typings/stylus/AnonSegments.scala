package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSegments extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var segments: js.Array[Node]
}

object AnonSegments {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, segments: js.Array[Node]): AnonSegments = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSegments]
  }
}

