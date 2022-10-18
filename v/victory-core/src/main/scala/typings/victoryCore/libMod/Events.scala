package typings.victoryCore.libMod

import typings.std.Partial
import typings.victoryCore.libVictoryUtilEventsMod.ComponentEventHandlers
import typings.victoryCore.libVictoryUtilEventsMod.ComponentEventKey
import typings.victoryCore.libVictoryUtilEventsMod.PartialEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  @JSImport("victory-core/lib", "Events")
  @js.native
  val ^ : js.Any = js.native
  
  inline def emulateReactEvent(event: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emulateReactEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getComponentEvents(props: Any, components: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentEvents")(props.asInstanceOf[js.Any], components.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getEventState(eventKey: ComponentEventKey, namespace: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventState")(eventKey.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getEventState(eventKey: ComponentEventKey, namespace: String, childType: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventState")(eventKey.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], childType.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getEvents(props: Any, target: Any, eventKey: Any, getScopedEvents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEvents")(props.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventKey.asInstanceOf[js.Any], getScopedEvents.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getExternalMutation(mutations: Any, baseProps: Any, baseState: Any, identifier: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutation")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getExternalMutations(mutations: Any, baseProps: Any, baseState: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutations")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def getExternalMutations(mutations: Any, baseProps: Any, baseState: Any, childName: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutations")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any], childName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getExternalMutationsWithChildren(mutations: Any, baseProps: Any, baseState: Any, childNames: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutationsWithChildren")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any], childNames.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getGlobalEventNameFromKey(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalEventNameFromKey")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getGlobalEvents(events: Any): Partial[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalEvents")(events.asInstanceOf[js.Any]).asInstanceOf[Partial[Any]]
  
  inline def getPartialEvents(events: ComponentEventHandlers, eventKey: ComponentEventKey, childProps: Any): PartialEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("getPartialEvents")(events.asInstanceOf[js.Any], eventKey.asInstanceOf[js.Any], childProps.asInstanceOf[js.Any])).asInstanceOf[PartialEvents]
  
  inline def getScopedEvents(events: Any, namespace: Any, childType: Any, baseProps: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getScopedEvents")(events.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], childType.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def omitGlobalEvents(events: Any): Partial[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitGlobalEvents")(events.asInstanceOf[js.Any]).asInstanceOf[Partial[Any]]
}
