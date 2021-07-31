package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateChangeEvent extends StObject {
  
  var newState: State
  
  var oldState: State
}
object StateChangeEvent {
  
  @scala.inline
  def apply(newState: State, oldState: State): StateChangeEvent = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeEvent]
  }
  
  @scala.inline
  implicit class StateChangeEventMutableBuilder[Self <: StateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewState(value: State): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: State): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
  }
}
