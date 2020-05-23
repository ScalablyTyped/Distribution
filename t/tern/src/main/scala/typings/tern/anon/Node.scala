package typings.tern.anon

import typings.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: typings.estree.mod.Node
  var state: Scope
}

object Node {
  @scala.inline
  def apply(node: typings.estree.mod.Node, state: Scope): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

