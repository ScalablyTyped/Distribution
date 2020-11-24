package typings.wonka.wonkaObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsObservable[T] extends js.Object {
  
  def subscribe(observer: JsObserver[T]): JsSubscription = js.native
}
object JsObservable {
  
  @scala.inline
  def apply[T](subscribe: JsObserver[T] => JsSubscription): JsObservable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[JsObservable[T]]
  }
  
  @scala.inline
  implicit class JsObservableOps[Self <: JsObservable[_], T] (val x: Self with JsObservable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscribe(value: JsObserver[T] => JsSubscription): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
}
