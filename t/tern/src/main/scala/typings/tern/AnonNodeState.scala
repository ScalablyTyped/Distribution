package typings.tern

import typings.estree.mod.Node
import typings.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeState extends js.Object {
  var node: Node
  var state: Scope | Null
}

object AnonNodeState {
  @scala.inline
  def apply(node: Node, state: Scope = null): AnonNodeState = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeState]
  }
}

