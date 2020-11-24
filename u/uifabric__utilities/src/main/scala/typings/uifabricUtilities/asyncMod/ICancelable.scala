package typings.uifabricUtilities.asyncMod

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICancelable[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  
  def cancel(): Unit = js.native
  
  def flush(): ReturnType[T] = js.native
  
  def pending(): Boolean = js.native
}
object ICancelable {
  
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](cancel: () => Unit, flush: () => ReturnType[T], pending: () => Boolean): ICancelable[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), pending = js.Any.fromFunction0(pending))
    __obj.asInstanceOf[ICancelable[T]]
  }
  
  @scala.inline
  implicit class ICancelableOps[Self <: ICancelable[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with ICancelable[T]) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => ReturnType[T]): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPending(value: () => Boolean): Self = this.set("pending", js.Any.fromFunction0(value))
  }
}
