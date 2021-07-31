package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.interfaceMod.Disposable
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateBuilderMod.StateBuilder
import typings.uirouterCore.stateInterfaceMod._StateDeclaration
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.stateRegistryMod.StateRegistryListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateQueueManagerMod {
  
  @JSImport("@uirouter/core/lib/state/stateQueueManager", "StateQueueManager")
  @js.native
  class StateQueueManager protected ()
    extends StObject
       with Disposable {
    def this(
      router: UIRouter,
      states: StringDictionary[StateObject],
      builder: StateBuilder,
      listeners: js.Array[StateRegistryListener]
    ) = this()
    
    def attachRoute(state: StateObject): Unit = js.native
    
    var builder: StateBuilder = js.native
    
    def flush(): StringDictionary[StateObject] = js.native
    
    var listeners: js.Array[StateRegistryListener] = js.native
    
    var queue: js.Array[StateObject] = js.native
    
    def register(stateDecl: _StateDeclaration): StateObject = js.native
    
    var router: js.Any = js.native
    
    var states: StringDictionary[StateObject] = js.native
  }
}
