package typings.webcola.gridrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLine extends js.Object {
  var nodes: js.Array[NodeWrapper]
  var pos: Double
}

object GridLine {
  @scala.inline
  def apply(nodes: js.Array[NodeWrapper], pos: Double): GridLine = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLine]
  }
}

