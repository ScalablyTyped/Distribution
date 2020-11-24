package typings.wordpressHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  
  var __current: js.Array[T] = js.native
}
object Current {
  
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](__current: js.Array[T]): Current[T] = {
    val __obj = js.Dynamic.literal(__current = __current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current[T]]
  }
  
  @scala.inline
  implicit class CurrentOps[Self <: Current[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with Current[T]) extends AnyVal {
    
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
    def set__currentVarargs(value: T*): Self = this.set("__current", js.Array(value :_*))
    
    @scala.inline
    def set__current(value: js.Array[T]): Self = this.set("__current", value.asInstanceOf[js.Any])
  }
}
