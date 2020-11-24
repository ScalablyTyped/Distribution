package typings.tstl.idequeMod

import typings.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeque[T] extends IPushFront[T] {
  
  /**
    * Erase the first element.
    */
  def pop_front(): Unit = js.native
}
object IDeque {
  
  @scala.inline
  def apply[T](pop_front: () => Unit, push_front: T => Unit): IDeque[T] = {
    val __obj = js.Dynamic.literal(pop_front = js.Any.fromFunction0(pop_front), push_front = js.Any.fromFunction1(push_front))
    __obj.asInstanceOf[IDeque[T]]
  }
  
  @scala.inline
  implicit class IDequeOps[Self <: IDeque[_], T] (val x: Self with IDeque[T]) extends AnyVal {
    
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
    def setPop_front(value: () => Unit): Self = this.set("pop_front", js.Any.fromFunction0(value))
  }
}
