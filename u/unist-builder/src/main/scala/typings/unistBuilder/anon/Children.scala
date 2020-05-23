package typings.unistBuilder.anon

import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children[T /* <: String */, C /* <: js.Array[Node] */] extends js.Object {
  var children: C
  var `type`: T
}

object Children {
  @scala.inline
  def apply[T, C](children: C, `type`: T): Children[T, C] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children[T, C]]
  }
}

