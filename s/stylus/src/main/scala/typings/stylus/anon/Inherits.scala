package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inherits extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var inherits: Boolean
  var lineno: Double
  var segments: js.Array[Node]
  var `val`: String
}

object Inherits {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    inherits: Boolean,
    lineno: Double,
    segments: js.Array[Node],
    `val`: String
  ): Inherits = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherits]
  }
}

