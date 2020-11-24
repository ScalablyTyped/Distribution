package typings.tstl.ipushfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPushFront[T] extends js.Object {
  
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  def push_front(`val`: T): Unit = js.native
}
object IPushFront {
  
  @scala.inline
  def apply[T](push_front: T => Unit): IPushFront[T] = {
    val __obj = js.Dynamic.literal(push_front = js.Any.fromFunction1(push_front))
    __obj.asInstanceOf[IPushFront[T]]
  }
  
  @scala.inline
  implicit class IPushFrontOps[Self <: IPushFront[_], T] (val x: Self with IPushFront[T]) extends AnyVal {
    
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
    def setPush_front(value: T => Unit): Self = this.set("push_front", js.Any.fromFunction1(value))
  }
}
