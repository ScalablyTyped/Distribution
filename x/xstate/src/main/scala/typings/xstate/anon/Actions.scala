package typings.xstate.anon

import typings.xstate.libTypesMod.ActionObject
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]
  
  var `type`: String
}
object Actions {
  
  inline def apply[TContext, TEvent /* <: EventObject */](actions: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]], `type`: String): Actions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (Actions[TContext, TEvent])) extends AnyVal {
    
    inline def setActions(value: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (ActionObject[TContext, TEvent, TEvent, BaseActionObject])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
