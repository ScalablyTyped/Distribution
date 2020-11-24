package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwixIter extends js.Object {
  
  def hasNext(): Boolean = js.native
  
  def next(): Twix = js.native
}
object TwixIter {
  
  @scala.inline
  def apply(hasNext: () => Boolean, next: () => Twix): TwixIter = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[TwixIter]
  }
  
  @scala.inline
  implicit class TwixIterOps[Self <: TwixIter] (val x: Self) extends AnyVal {
    
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
    def setHasNext(value: () => Boolean): Self = this.set("hasNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Twix): Self = this.set("next", js.Any.fromFunction0(value))
  }
}
