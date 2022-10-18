package typings.uirouterAngularjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.libStateStateRegistryMod.StateRegistryListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "StateQueueManager")
@js.native
open class StateQueueManager protected ()
  extends typings.uirouterCore.mod.StateQueueManager {
  def this(
    router: typings.uirouterCore.libRouterMod.UIRouter,
    states: StringDictionary[typings.uirouterCore.libStateStateObjectMod.StateObject],
    builder: typings.uirouterCore.libStateStateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}
