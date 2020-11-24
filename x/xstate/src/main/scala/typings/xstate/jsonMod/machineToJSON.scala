package typings.xstate.jsonMod

import typings.xstate.anon.ContextAny
import typings.xstate.mod.StateNode
import typings.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/json", "machineToJSON")
@js.native
object machineToJSON extends js.Object {
  
  def apply(stateNode: StateNode[_, _, EventObject, ContextAny]): StateNodeConfig = js.native
}
