package typings.wordpressHooks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hook[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  
  var handlers: js.Array[T] = js.native
  
  var runs: Double = js.native
}
object Hook {
  
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](handlers: js.Array[T], runs: Double): Hook[T] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook[T]]
  }
  
  @scala.inline
  implicit class HookOps[Self <: Hook[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with Hook[T]) extends AnyVal {
    
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
    def setHandlersVarargs(value: T*): Self = this.set("handlers", js.Array(value :_*))
    
    @scala.inline
    def setHandlers(value: js.Array[T]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuns(value: Double): Self = this.set("runs", value.asInstanceOf[js.Any])
  }
}
