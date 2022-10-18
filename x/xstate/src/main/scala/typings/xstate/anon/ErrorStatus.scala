package typings.xstate.anon

import typings.xstate.libBehaviorsMod.PromiseState
import typings.xstate.xstateStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorStatus
  extends StObject
     with PromiseState[Any] {
  
  var data: Unit
  
  var error: Any
  
  var status: rejected
}
object ErrorStatus {
  
  inline def apply(data: Unit, error: Any): ErrorStatus = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[ErrorStatus]
  }
  
  extension [Self <: ErrorStatus](x: Self) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
