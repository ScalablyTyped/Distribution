package typings.stylus

import typings.stylus.mod.Stylus.Nodes.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockColumn extends js.Object {
  var __type: String
  var block: Block
  var column: Double
  var filename: String
  var lineno: Double
}

object AnonBlockColumn {
  @scala.inline
  def apply(__type: String, block: Block, column: Double, filename: String, lineno: Double): AnonBlockColumn = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockColumn]
  }
}

