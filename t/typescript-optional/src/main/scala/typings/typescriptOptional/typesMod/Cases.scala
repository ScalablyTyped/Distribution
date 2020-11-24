package typings.typescriptOptional.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cases[T, U] extends js.Object {
  
  def empty(): U = js.native
  
  def present(value: T): U = js.native
}
object Cases {
  
  @scala.inline
  def apply[T, U](empty: () => U, present: T => U): Cases[T, U] = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), present = js.Any.fromFunction1(present))
    __obj.asInstanceOf[Cases[T, U]]
  }
  
  @scala.inline
  implicit class CasesOps[Self <: Cases[_, _], T, U] (val x: Self with (Cases[T, U])) extends AnyVal {
    
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
    def setEmpty(value: () => U): Self = this.set("empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPresent(value: T => U): Self = this.set("present", js.Any.fromFunction1(value))
  }
}
