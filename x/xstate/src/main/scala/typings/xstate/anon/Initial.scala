package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StatesConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initial[TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */] extends StObject {
  
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  
  var states: StatesConfig[js.Any, TStateSchema, TEvent]
}
object Initial {
  
  inline def apply[TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[js.Any, TStateSchema, TEvent]
  ): Initial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[TStateSchema, TEvent]]
  }
  
  extension [Self <: Initial[?, ?], TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](x: Self & (Initial[TStateSchema, TEvent])) {
    
    inline def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setStates(value: StatesConfig[js.Any, TStateSchema, TEvent]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
