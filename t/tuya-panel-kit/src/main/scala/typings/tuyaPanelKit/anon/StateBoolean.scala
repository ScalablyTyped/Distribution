package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateBoolean extends StObject {
  
  var state: Boolean
}
object StateBoolean {
  
  inline def apply(state: Boolean): StateBoolean = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateBoolean]
  }
  
  extension [Self <: StateBoolean](x: Self) {
    
    inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
