package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.StatesConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initial[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StObject {
  
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any = js.native
  
  var states: StatesConfig[_, TStateSchema, TEvent] = js.native
}
object Initial {
  
  @scala.inline
  def apply[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[_, TStateSchema, TEvent]
  ): Initial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[TStateSchema, TEvent]]
  }
  
  @scala.inline
  implicit class InitialMutableBuilder[Self <: Initial[_, _], TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] (val x: Self with (Initial[TStateSchema, TEvent])) extends AnyVal {
    
    @scala.inline
    def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: StatesConfig[_, TStateSchema, TEvent]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
