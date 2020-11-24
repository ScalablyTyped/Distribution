package typings.tstl.iemptyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEmpty extends js.Object {
  
  /**
    * Test whether container is empty.
    */
  def empty(): Boolean = js.native
}
object IEmpty {
  
  @scala.inline
  def apply(empty: () => Boolean): IEmpty = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty))
    __obj.asInstanceOf[IEmpty]
  }
  
  @scala.inline
  implicit class IEmptyOps[Self <: IEmpty] (val x: Self) extends AnyVal {
    
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
    def setEmpty(value: () => Boolean): Self = this.set("empty", js.Any.fromFunction0(value))
  }
}
