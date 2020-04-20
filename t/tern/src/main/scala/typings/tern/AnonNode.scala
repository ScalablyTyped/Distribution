package typings.tern

import typings.estree.mod.Node
import typings.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var node: Node
  var state: Scope
}

object AnonNode {
  @scala.inline
  def apply(node: Node, state: Scope): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

