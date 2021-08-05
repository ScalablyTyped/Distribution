package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToConnectionStateChangedEventArgs extends StObject {
  
  var currentState: PlayToConnectionState
  
  var previousState: PlayToConnectionState
}
object IPlayToConnectionStateChangedEventArgs {
  
  inline def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): IPlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionStateChangedEventArgs]
  }
  
  extension [Self <: IPlayToConnectionStateChangedEventArgs](x: Self) {
    
    inline def setCurrentState(value: PlayToConnectionState): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setPreviousState(value: PlayToConnectionState): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
  }
}
