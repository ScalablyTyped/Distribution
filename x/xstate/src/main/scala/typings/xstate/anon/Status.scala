package typings.xstate.anon

import typings.xstate.libBehaviorsMod.PromiseState
import typings.xstate.xstateStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status
  extends StObject
     with PromiseState[Any] {
  
  var data: Unit
  
  var error: Unit
  
  var status: pending
}
object Status {
  
  inline def apply(data: Unit, error: Unit): Status = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = "pending")
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
