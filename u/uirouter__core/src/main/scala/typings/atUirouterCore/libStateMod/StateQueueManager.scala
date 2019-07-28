package typings.atUirouterCore.libStateMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateStateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state", "StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typings.atUirouterCore.libStateStateQueueManagerMod.StateQueueManager {
  def this(
    router: UIRouter,
    states: StringDictionary[typings.atUirouterCore.libStateStateObjectMod.StateObject],
    builder: typings.atUirouterCore.libStateStateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}

