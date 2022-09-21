package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToConnection
  extends StObject
     with IPlayToConnection
object PlayToConnection {
  
  inline def apply(onerror: Any, onstatechanged: Any, ontransferred: Any, state: PlayToConnectionState): PlayToConnection = {
    val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onstatechanged = onstatechanged.asInstanceOf[js.Any], ontransferred = ontransferred.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnection]
  }
}
