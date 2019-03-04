package typings
package webcolaLib.distSrcGridrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLine extends js.Object {
  var nodes: js.Array[NodeWrapper]
  var pos: scala.Double
}

object GridLine {
  @scala.inline
  def apply(nodes: js.Array[NodeWrapper], pos: scala.Double): GridLine = {
    val __obj = js.Dynamic.literal(nodes = nodes, pos = pos)
  
    __obj.asInstanceOf[GridLine]
  }
}

