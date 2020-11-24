package typings.uirouterCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typings.uirouterCore.stateMod.StateQueueManager {
  def this(
    router: typings.uirouterCore.routerMod.UIRouter,
    states: StringDictionary[typings.uirouterCore.stateObjectMod.StateObject],
    builder: typings.uirouterCore.stateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}
