package typings
package atUirouterCoreLib.libStateStateQueueManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateQueueManager", "StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  def this(router: atUirouterCoreLib.libRouterMod.UIRouter, states: org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libStateStateObjectMod.StateObject], builder: atUirouterCoreLib.libStateStateBuilderMod.StateBuilder, listeners: js.Array[atUirouterCoreLib.libStateStateRegistryMod.StateRegistryListener]) = this()
  var builder: atUirouterCoreLib.libStateStateBuilderMod.StateBuilder = js.native
  var listeners: js.Array[atUirouterCoreLib.libStateStateRegistryMod.StateRegistryListener] = js.native
  var queue: js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  var router: js.Any = js.native
  var states: org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  def attachRoute(state: atUirouterCoreLib.libStateStateObjectMod.StateObject): scala.Unit = js.native
  def flush(): org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  def register(stateDecl: atUirouterCoreLib.libStateInterfaceMod._StateDeclaration): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
}

