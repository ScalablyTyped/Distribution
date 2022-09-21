package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteropSubscribable[T] extends StObject {
  
  def subscribe(observer: Observer[T]): Subscription
}
object InteropSubscribable {
  
  inline def apply[T](subscribe: Observer[T] => Subscription): InteropSubscribable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[InteropSubscribable[T]]
  }
  
  extension [Self <: InteropSubscribable[?], T](x: Self & InteropSubscribable[T]) {
    
    inline def setSubscribe(value: Observer[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
