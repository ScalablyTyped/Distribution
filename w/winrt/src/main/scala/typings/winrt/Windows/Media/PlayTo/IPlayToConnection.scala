package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToConnection extends StObject {
  
  var onerror: js.Any
  
  var onstatechanged: js.Any
  
  var ontransferred: js.Any
  
  var state: PlayToConnectionState
}
object IPlayToConnection {
  
  inline def apply(onerror: js.Any, onstatechanged: js.Any, ontransferred: js.Any, state: PlayToConnectionState): IPlayToConnection = {
    val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onstatechanged = onstatechanged.asInstanceOf[js.Any], ontransferred = ontransferred.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnection]
  }
  
  extension [Self <: IPlayToConnection](x: Self) {
    
    inline def setOnerror(value: js.Any): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnstatechanged(value: js.Any): Self = StObject.set(x, "onstatechanged", value.asInstanceOf[js.Any])
    
    inline def setOntransferred(value: js.Any): Self = StObject.set(x, "ontransferred", value.asInstanceOf[js.Any])
    
    inline def setState(value: PlayToConnectionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
