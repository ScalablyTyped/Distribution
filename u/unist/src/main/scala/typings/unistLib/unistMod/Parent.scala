package typings
package unistLib.unistMod

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
  def apply(children: js.Array[Node], `type`: java.lang.String, data: Data = null, position: Position = null): Parent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Parent]
  }
}

