package typings.victoryCore

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.Partial
import typings.std.Record
import typings.victoryCore.libVictoryUtilAddEventsMod.EventMixinCalculatedValues
import typings.victoryCore.victoryCoreStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilEventsMod {
  
  @JSImport("victory-core/lib/victory-util/events", JSImport.Namespace)
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
  
  trait ComponentEvent extends StObject {
    
    var eventHandlers: ComponentEventHandlers
    
    var eventKey: js.UndefOr[ComponentEventKey | js.Array[ComponentEventKey]] = js.undefined
    
    var target: js.UndefOr[parent | String] = js.undefined
  }
  object ComponentEvent {
    
    inline def apply(eventHandlers: ComponentEventHandlers): ComponentEvent = {
      val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentEvent]
    }
    
    extension [Self <: ComponentEvent](x: Self) {
      
      inline def setEventHandlers(value: ComponentEventHandlers): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventKey(value: ComponentEventKey | js.Array[ComponentEventKey]): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEventKeyVarargs(value: ComponentEventKey*): Self = StObject.set(x, "eventKey", js.Array(value*))
      
      inline def setTarget(value: parent | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type ComponentEventHandler = js.Function4[
    /* evt */ SyntheticEvent[Element, Event], 
    /* childProps */ Any, 
    /* eventKey */ ComponentEventKey, 
    /* eventName */ ComponentEventName, 
    UpdatedProps
  ]
  
  type ComponentEventHandlers = StringDictionary[ComponentEventHandler]
  
  type ComponentEventKey = String | Double
  
  type ComponentEventName = String
  
  trait ComponentWithEvents
    extends StObject
       with EventMixinCalculatedValues {
    
    var setState: Any
    
    var state: Any
  }
  object ComponentWithEvents {
    
    inline def apply(
      baseProps: Record[String, js.Object],
      componentEvents: js.Array[ComponentEvent],
      dataKeys: js.Array[String],
      events: Any,
      getSharedEventState: (String, String) => Any,
      hasEvents: Any,
      setState: Any,
      state: Any
    ): ComponentWithEvents = {
      val __obj = js.Dynamic.literal(baseProps = baseProps.asInstanceOf[js.Any], componentEvents = componentEvents.asInstanceOf[js.Any], dataKeys = dataKeys.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], getSharedEventState = js.Any.fromFunction2(getSharedEventState), hasEvents = hasEvents.asInstanceOf[js.Any], setState = setState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentWithEvents]
    }
    
    extension [Self <: ComponentWithEvents](x: Self) {
      
      inline def setSetState(value: Any): Self = StObject.set(x, "setState", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type PartialEvents = StringDictionary[js.Function1[/* evt */ SyntheticEvent[Element, Event], UpdatedProps]]
  
  type UpdatedProps = Any
}
