package typings.atUirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libInterfaceMod.Disposable
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateInterfaceMod._StateDeclaration
import typings.atUirouterCore.libStateStateBuilderMod.StateBuilder
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libStateStateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateQueueManager", JSImport.Namespace)
@js.native
object libStateStateQueueManagerMod extends js.Object {
  @js.native
  class StateQueueManager protected () extends Disposable {
    def this(
      router: UIRouter,
      states: StringDictionary[StateObject],
      builder: StateBuilder,
      listeners: js.Array[StateRegistryListener]
    ) = this()
    var builder: StateBuilder = js.native
    var listeners: js.Array[StateRegistryListener] = js.native
    var queue: js.Array[StateObject] = js.native
    var router: js.Any = js.native
    var states: StringDictionary[StateObject] = js.native
    def attachRoute(state: StateObject): Unit = js.native
    def flush(): StringDictionary[StateObject] = js.native
    def register(stateDecl: _StateDeclaration): StateObject = js.native
  }
  
}

