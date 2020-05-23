package typings.webcola.anon

import typings.webcola.powergraphMod.PowerEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: js.Array[_]
  var powerEdges: js.Array[PowerEdge]
}

object Groups {
  @scala.inline
  def apply(groups: js.Array[_], powerEdges: js.Array[PowerEdge]): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], powerEdges = powerEdges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

