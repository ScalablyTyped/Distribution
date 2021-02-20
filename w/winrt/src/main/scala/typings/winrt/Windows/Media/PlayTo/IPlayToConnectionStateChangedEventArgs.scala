package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToConnectionStateChangedEventArgs extends StObject {
  
  var currentState: PlayToConnectionState = js.native
  
  var previousState: PlayToConnectionState = js.native
}
object IPlayToConnectionStateChangedEventArgs {
  
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): IPlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class IPlayToConnectionStateChangedEventArgsMutableBuilder[Self <: IPlayToConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: PlayToConnectionState): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousState(value: PlayToConnectionState): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
  }
}
