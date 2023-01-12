package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseMockSetBodyMethod_ extends StObject {
  
  def add(res: IncomingMessageLikeInitOptions): Unit
  
  def remove(res: IncomingMessageLikeInitOptions): Unit
}
object ResponseMockSetBodyMethod_ {
  
  inline def apply(add: IncomingMessageLikeInitOptions => Unit, remove: IncomingMessageLikeInitOptions => Unit): ResponseMockSetBodyMethod_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ResponseMockSetBodyMethod_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseMockSetBodyMethod_] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: IncomingMessageLikeInitOptions => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setRemove(value: IncomingMessageLikeInitOptions => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
