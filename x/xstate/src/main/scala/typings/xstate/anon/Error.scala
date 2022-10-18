package typings.xstate.anon

import typings.xstate.libBehaviorsMod.PromiseEvents
import typings.xstate.xstateStrings.reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with PromiseEvents[Any] {
  
  var error: Any
  
  var `type`: reject
}
object Error {
  
  inline def apply(error: Any): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reject")
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: reject): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
