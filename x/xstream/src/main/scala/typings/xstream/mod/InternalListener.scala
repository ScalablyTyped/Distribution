package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalListener[T] extends js.Object {
  
  def _c(): Unit = js.native
  
  def _e(err: js.Any): Unit = js.native
  
  def _n(v: T): Unit = js.native
}
object InternalListener {
  
  @scala.inline
  def apply[T](_c: () => Unit, _e: js.Any => Unit, _n: T => Unit): InternalListener[T] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n))
    __obj.asInstanceOf[InternalListener[T]]
  }
  
  @scala.inline
  implicit class InternalListenerOps[Self <: InternalListener[_], T] (val x: Self with InternalListener[T]) extends AnyVal {
    
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
    def set_c(value: () => Unit): Self = this.set("_c", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_e(value: js.Any => Unit): Self = this.set("_e", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_n(value: T => Unit): Self = this.set("_n", js.Any.fromFunction1(value))
  }
}
