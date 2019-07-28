package typings.tern

import typings.estree.estreeMod.Node
import typings.tern.libInferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: Node
  var state: Scope
}

object Anon_Node {
  @scala.inline
  def apply(node: Node, state: Scope): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node, state = state)
  
    __obj.asInstanceOf[Anon_Node]
  }
}

