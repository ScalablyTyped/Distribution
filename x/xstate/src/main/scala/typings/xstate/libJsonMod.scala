package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.xstate.anon.ContextAny
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.ActionObject
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.Guard
import typings.xstate.libTypesMod.InvokeDefinition
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.mod.StateNode
import typings.xstate.xstateStrings.`final`
import typings.xstate.xstateStrings.atomic
import typings.xstate.xstateStrings.compound
import typings.xstate.xstateStrings.history
import typings.xstate.xstateStrings.parallel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonMod {
  
  @JSImport("xstate/lib/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonify[T /* <: Record[String, Any] */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonify")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def machineToJSON(stateNode: StateNode[Any, Any, EventObject, ContextAny, ServiceMap, TypegenDisabled]): StateNodeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("machineToJSON")(stateNode.asInstanceOf[js.Any]).asInstanceOf[StateNodeConfig]
  
  inline def parse(machineString: String): StateNodeConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(machineString.asInstanceOf[js.Any]).asInstanceOf[StateNodeConfig]
  
  inline def stringify(machine: StateNode[Any, Any, EventObject, ContextAny, ServiceMap, TypegenDisabled]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(machine.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyFunction(fn: js.Function): JSONFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[JSONFunction]
  
  trait JSONFunction extends StObject {
    
    @JSName("$function")
    var $function: String
  }
  object JSONFunction {
    
    inline def apply($function: String): JSONFunction = {
      val __obj = js.Dynamic.literal($function = $function.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONFunction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONFunction] (val x: Self) extends AnyVal {
      
      inline def set$function(value: String): Self = StObject.set(x, "$function", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateNodeConfig extends StObject {
    
    var entry: js.Array[ActionObject[Any, Any, Any, BaseActionObject]]
    
    var exit: js.Array[ActionObject[Any, Any, Any, BaseActionObject]]
    
    var id: String
    
    var initial: js.UndefOr[String] = js.undefined
    
    var invoke: js.Array[InvokeDefinition[Any, Any]]
    
    var key: String
    
    var on: StringDictionary[js.Array[TransitionConfig]]
    
    var states: Record[String, StateNodeConfig]
    
    var `type`: atomic | compound | parallel | `final` | history
  }
  object StateNodeConfig {
    
    inline def apply(
      entry: js.Array[ActionObject[Any, Any, Any, BaseActionObject]],
      exit: js.Array[ActionObject[Any, Any, Any, BaseActionObject]],
      id: String,
      invoke: js.Array[InvokeDefinition[Any, Any]],
      key: String,
      on: StringDictionary[js.Array[TransitionConfig]],
      states: Record[String, StateNodeConfig],
      `type`: atomic | compound | parallel | `final` | history
    ): StateNodeConfig = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateNodeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateNodeConfig] (val x: Self) extends AnyVal {
      
      inline def setEntry(value: js.Array[ActionObject[Any, Any, Any, BaseActionObject]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryVarargs(value: (ActionObject[Any, Any, Any, BaseActionObject])*): Self = StObject.set(x, "entry", js.Array(value*))
      
      inline def setExit(value: js.Array[ActionObject[Any, Any, Any, BaseActionObject]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitVarargs(value: (ActionObject[Any, Any, Any, BaseActionObject])*): Self = StObject.set(x, "exit", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setInvoke(value: js.Array[InvokeDefinition[Any, Any]]): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
      
      inline def setInvokeVarargs(value: (InvokeDefinition[Any, Any])*): Self = StObject.set(x, "invoke", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOn(value: StringDictionary[js.Array[TransitionConfig]]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setStates(value: Record[String, StateNodeConfig]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      inline def setType(value: atomic | compound | parallel | `final` | history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitionConfig extends StObject {
    
    var actions: js.Array[ActionObject[Any, Any, Any, BaseActionObject]]
    
    var cond: js.UndefOr[Guard[Any, Any]] = js.undefined
    
    var eventType: String
    
    var source: String
    
    var target: js.Array[String]
  }
  object TransitionConfig {
    
    inline def apply(
      actions: js.Array[ActionObject[Any, Any, Any, BaseActionObject]],
      eventType: String,
      source: String,
      target: js.Array[String]
    ): TransitionConfig = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitionConfig] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[ActionObject[Any, Any, Any, BaseActionObject]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: (ActionObject[Any, Any, Any, BaseActionObject])*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setCond(value: Guard[Any, Any]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
      
      inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
}
