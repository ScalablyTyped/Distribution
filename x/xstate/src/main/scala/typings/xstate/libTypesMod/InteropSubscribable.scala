package typings.xstate.libTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteropSubscribable[?], T] (val x: Self & InteropSubscribable[T]) extends AnyVal {
    
    inline def setSubscribe(value: Observer[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
