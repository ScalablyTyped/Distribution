package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToConnectionStateChangedEventArgs
  extends StObject
     with IPlayToConnectionStateChangedEventArgs
object PlayToConnectionStateChangedEventArgs {
  
  inline def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): PlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionStateChangedEventArgs]
  }
}
