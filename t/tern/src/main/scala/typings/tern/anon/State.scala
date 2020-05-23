package typings.tern.anon

import typings.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var node: typings.estree.mod.Node
  var state: Scope | Null
}

object State {
  @scala.inline
  def apply(node: typings.estree.mod.Node, state: Scope = null): State = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

