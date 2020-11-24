package typings.xstate.scxmlMod

import typings.xstate.anon.ContextAny
import typings.xstate.mod.StateNode
import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/scxml", "toMachine")
@js.native
object toMachine extends js.Object {
  
  def apply(xml: String, options: ScxmlToMachineOptions): StateNode[_, _, EventObject, ContextAny] = js.native
}
