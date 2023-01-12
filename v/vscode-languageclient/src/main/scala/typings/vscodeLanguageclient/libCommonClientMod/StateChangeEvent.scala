package typings.vscodeLanguageclient.libCommonClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateChangeEvent extends StObject {
  
  var newState: State
  
  var oldState: State
}
object StateChangeEvent {
  
  inline def apply(newState: State, oldState: State): StateChangeEvent = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setNewState(value: State): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: State): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
  }
}
