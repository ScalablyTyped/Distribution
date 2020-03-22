package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRight extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var left: Node
  var lineno: Double
  var right: Node
  var `val`: js.UndefOr[String] = js.undefined
}

object AnonRight {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    left: Node,
    lineno: Double,
    right: Node,
    `val`: String = null
  ): AnonRight = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRight]
  }
}

