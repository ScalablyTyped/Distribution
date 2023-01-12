package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToConnection extends StObject {
  
  var onerror: Any
  
  var onstatechanged: Any
  
  var ontransferred: Any
  
  var state: PlayToConnectionState
}
object IPlayToConnection {
  
  inline def apply(onerror: Any, onstatechanged: Any, ontransferred: Any, state: PlayToConnectionState): IPlayToConnection = {
    val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onstatechanged = onstatechanged.asInstanceOf[js.Any], ontransferred = ontransferred.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlayToConnection] (val x: Self) extends AnyVal {
    
    inline def setOnerror(value: Any): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnstatechanged(value: Any): Self = StObject.set(x, "onstatechanged", value.asInstanceOf[js.Any])
    
    inline def setOntransferred(value: Any): Self = StObject.set(x, "ontransferred", value.asInstanceOf[js.Any])
    
    inline def setState(value: PlayToConnectionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
