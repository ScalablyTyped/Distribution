package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineOptions[TContext, TEvent /* <: EventObject */] extends StObject {
  
  /**
    * @private
    */
  var _key: js.UndefOr[String] = js.undefined
  
  /**
    * @private
    */
  var _parent: js.UndefOr[StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]] = js.undefined
  
  var actions: ActionFunctionMap[TContext, TEvent]
  
  var activities: Record[String, ActivityConfig[TContext, TEvent]]
  
  var delays: DelayFunctionMap[TContext, TEvent]
  
  var guards: Record[String, ConditionPredicate[TContext, TEvent]]
  
  var services: Record[String, ServiceConfig[TContext, TEvent]]
}
object MachineOptions {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: ActionFunctionMap[TContext, TEvent],
    activities: Record[String, ActivityConfig[TContext, TEvent]],
    delays: DelayFunctionMap[TContext, TEvent],
    guards: Record[String, ConditionPredicate[TContext, TEvent]],
    services: Record[String, ServiceConfig[TContext, TEvent]]
  ): MachineOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activities = activities.asInstanceOf[js.Any], delays = delays.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineOptions[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class MachineOptionsMutableBuilder[Self <: MachineOptions[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (MachineOptions[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionFunctionMap[TContext, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivities(value: Record[String, ActivityConfig[TContext, TEvent]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelays(value: DelayFunctionMap[TContext, TEvent]): Self = StObject.set(x, "delays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuards(value: Record[String, ConditionPredicate[TContext, TEvent]]): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: Record[String, ServiceConfig[TContext, TEvent]]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_key(value: String): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
    
    @scala.inline
    def set_parent(value: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parentUndefined: Self = StObject.set(x, "_parent", js.undefined)
  }
}
