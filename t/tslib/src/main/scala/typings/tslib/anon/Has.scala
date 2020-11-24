package typings.tslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Has[T /* <: js.Object */, V] extends js.Object {
  
  def has(o: T): Boolean = js.native
  
  def set(o: T, value: V): js.Any = js.native
}
object Has {
  
  @scala.inline
  def apply[T /* <: js.Object */, V](has: T => Boolean, set: (T, V) => js.Any): Has[T, V] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Has[T, V]]
  }
  
  @scala.inline
  implicit class HasOps[Self <: Has[_, _], T /* <: js.Object */, V] (val x: Self with (Has[T, V])) extends AnyVal {
    
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
    def setHas(value: T => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (T, V) => js.Any): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
