package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeState extends js.Object {
  var node: estreeLib.estreeMod.Node
  var state: ternLib.libInferMod.Scope | scala.Null
}

object Anon_NodeState {
  @scala.inline
  def apply(node: estreeLib.estreeMod.Node, state: ternLib.libInferMod.Scope = null): Anon_NodeState = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_NodeState]
  }
}

