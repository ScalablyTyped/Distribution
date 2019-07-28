package typings.tern

import typings.estree.estreeMod.Node
import typings.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeState extends js.Object {
  var node: Node
  var state: Scope | Null
}

object Anon_NodeState {
  @scala.inline
  def apply(node: Node, state: Scope = null): Anon_NodeState = {
    val __obj = js.Dynamic.literal(node = node)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_NodeState]
  }
}

