package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSourceStateChangedEventArgs extends StObject {
  
  /** Gets the new current state of the MediaSource . */
  var newState: MediaSourceState
  
  /** Gets the previous state of the MediaSource before the state changed. */
  var oldState: MediaSourceState
}
object MediaSourceStateChangedEventArgs {
  
  inline def apply(newState: MediaSourceState, oldState: MediaSourceState): MediaSourceStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceStateChangedEventArgs]
  }
  
  extension [Self <: MediaSourceStateChangedEventArgs](x: Self) {
    
    inline def setNewState(value: MediaSourceState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: MediaSourceState): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
  }
}
