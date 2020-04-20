package typings.unistBuilder

import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[T /* <: String */, C /* <: js.Array[Node] */] extends js.Object {
  var children: C
  var `type`: T
}

object AnonChildren {
  @scala.inline
  def apply[T /* <: String */, C /* <: js.Array[Node] */](children: C, `type`: T): AnonChildren[T, C] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren[T, C]]
  }
}

