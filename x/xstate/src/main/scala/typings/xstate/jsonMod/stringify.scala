package typings.xstate.jsonMod

import typings.xstate.mod.StateNode
import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/json", "stringify")
@js.native
object stringify extends js.Object {
  def apply(machine: StateNode[_, _, EventObject, _]): String = js.native
}

