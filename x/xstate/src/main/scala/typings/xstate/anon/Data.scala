package typings.xstate.anon

import typings.xstate.libBehaviorsMod.PromiseEvents
import typings.xstate.xstateStrings.fulfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[T]
  extends StObject
     with PromiseEvents[T] {
  
  var data: T
  
  var `type`: fulfill
}
object Data {
  
  inline def apply[T](data: T): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fulfill")
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], T] (val x: Self & Data[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: fulfill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
