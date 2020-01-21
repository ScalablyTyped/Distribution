package typings.webcola

import typings.webcola.powergraphMod.PowerEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroups extends js.Object {
  var groups: js.Array[_]
  var powerEdges: js.Array[PowerEdge]
}

object AnonGroups {
  @scala.inline
  def apply(groups: js.Array[_], powerEdges: js.Array[PowerEdge]): AnonGroups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], powerEdges = powerEdges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroups]
  }
}

