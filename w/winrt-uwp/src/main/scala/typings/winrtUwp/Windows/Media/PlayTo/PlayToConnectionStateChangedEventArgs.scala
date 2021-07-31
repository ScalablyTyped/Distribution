package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the StateChanged event. */
trait PlayToConnectionStateChangedEventArgs extends StObject {
  
  /** Gets the current state after the Play To connection state has changed. */
  var currentState: PlayToConnectionState
  
  /** Gets the previous state before the Play To connection state was changed. */
  var previousState: PlayToConnectionState
}
object PlayToConnectionStateChangedEventArgs {
  
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): PlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class PlayToConnectionStateChangedEventArgsMutableBuilder[Self <: PlayToConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: PlayToConnectionState): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousState(value: PlayToConnectionState): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
  }
}
