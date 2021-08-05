package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionObject[TContext, TEvent /* <: EventObject */]
  extends StObject
     with /* option */ StringDictionary[js.Any] {
  
  /**
    * The implementation for executing the action.
    */
  var exec: js.UndefOr[ActionFunction[TContext, TEvent]] = js.undefined
  
  /**
    * The type of action that is executed.
    */
  var `type`: String
}
object ActionObject {
  
  inline def apply[TContext, TEvent /* <: EventObject */](`type`: String): ActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionObject[TContext, TEvent]]
  }
  
  extension [Self <: ActionObject[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (ActionObject[TContext, TEvent])) {
    
    inline def setExec(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction3(value))
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
