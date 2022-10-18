package typings.xstate.anon

import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.StatesConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initial[TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] extends StObject {
  
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  
  var states: StatesConfig[Any, TStateSchema, TEvent, BaseActionObject]
}
object Initial {
  
  inline def apply[TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[Any, TStateSchema, TEvent, BaseActionObject]
  ): Initial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[TStateSchema, TEvent]]
  }
  
  extension [Self <: Initial[?, ?], TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](x: Self & (Initial[TStateSchema, TEvent])) {
    
    inline def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setStates(value: StatesConfig[Any, TStateSchema, TEvent, BaseActionObject]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
