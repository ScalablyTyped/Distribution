package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: estreeLib.estreeMod.Node
  var state: ternLib.libInferMod.Scope
}

object Anon_Node {
  @scala.inline
  def apply(node: estreeLib.estreeMod.Node, state: ternLib.libInferMod.Scope): Anon_Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Node]
  }
}

