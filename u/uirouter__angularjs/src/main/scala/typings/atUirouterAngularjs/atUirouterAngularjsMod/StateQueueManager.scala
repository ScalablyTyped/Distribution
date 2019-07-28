package typings.atUirouterAngularjs.atUirouterAngularjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libStateStateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typings.atUirouterCore.atUirouterCoreMod.StateQueueManager {
  def this(
    router: typings.atUirouterCore.libRouterMod.UIRouter,
    states: StringDictionary[typings.atUirouterCore.libStateStateObjectMod.StateObject],
    builder: typings.atUirouterCore.libStateStateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}

