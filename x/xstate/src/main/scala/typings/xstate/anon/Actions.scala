package typings.xstate.anon

import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.ActionTypes.NullEvent
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Guard
import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.Array[ActionObject[TContext, TEvent]]
  
  var cond: js.UndefOr[Guard[TContext, TEvent]] = js.undefined
  
  var eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
  
  var source: String
  
  var target: js.UndefOr[js.Array[String]] = js.undefined
}
object Actions {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk,
    source: String
  ): Actions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions[TContext, TEvent]]
  }
  
  extension [Self <: Actions[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (Actions[TContext, TEvent])) {
    
    inline def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setCond(value: Guard[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
    
    inline def setEventType(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}
