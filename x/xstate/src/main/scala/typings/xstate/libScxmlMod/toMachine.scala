package typings.xstate.libScxmlMod

import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/scxml", "toMachine")
@js.native
object toMachine extends js.Object {
  def apply(xml: String, options: ScxmlToMachineOptions): StateNode[_, _, EventObject, _] = js.native
}

