package typings.unist.unistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends Node {
  /**
    * List representing the children of a node.
    */
  var children: js.Array[Node]
}

object Parent {
  @scala.inline
  def apply(children: js.Array[Node], `type`: String, data: Data = null, position: Position = null): Parent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

