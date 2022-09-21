package typings.xstate.typesMod

import typings.xstate.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineSchema[TContext, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */] extends StObject {
  
  var actions: js.UndefOr[Dictkey] = js.undefined
  
  var context: js.UndefOr[TContext] = js.undefined
  
  var events: js.UndefOr[TEvent] = js.undefined
  
  var guards: js.UndefOr[Dictkey] = js.undefined
  
  var services: js.UndefOr[TServiceMap] = js.undefined
}
object MachineSchema {
  
  inline def apply[TContext, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */](): MachineSchema[TContext, TEvent, TServiceMap] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineSchema[TContext, TEvent, TServiceMap]]
  }
  
  extension [Self <: MachineSchema[?, ?, ?], TContext, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */](x: Self & (MachineSchema[TContext, TEvent, TServiceMap])) {
    
    inline def setActions(value: Dictkey): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEvents(value: TEvent): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGuards(value: Dictkey): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    inline def setGuardsUndefined: Self = StObject.set(x, "guards", js.undefined)
    
    inline def setServices(value: TServiceMap): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
  }
}
