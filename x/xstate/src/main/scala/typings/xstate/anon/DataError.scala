package typings.xstate.anon

import typings.xstate.behaviorsMod.PromiseState
import typings.xstate.xstateStrings.fulfilled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataError[T]
  extends StObject
     with PromiseState[T] {
  
  var data: T
  
  var error: Unit
  
  var status: fulfilled
}
object DataError {
  
  inline def apply[T](data: T, error: Unit): DataError[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = "fulfilled")
    __obj.asInstanceOf[DataError[T]]
  }
  
  extension [Self <: DataError[?], T](x: Self & DataError[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
