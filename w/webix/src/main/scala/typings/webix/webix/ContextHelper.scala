package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextHelper extends js.Object {
  
  def attachTo(view: js.Any): Unit = js.native
  
  def getContext(): js.Any = js.native
  
  def setContext(context: js.Any): Unit = js.native
}
object ContextHelper {
  
  @scala.inline
  def apply(attachTo: js.Any => Unit, getContext: () => js.Any, setContext: js.Any => Unit): ContextHelper = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), getContext = js.Any.fromFunction0(getContext), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[ContextHelper]
  }
  
  @scala.inline
  implicit class ContextHelperOps[Self <: ContextHelper] (val x: Self) extends AnyVal {
    
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
    def setAttachTo(value: js.Any => Unit): Self = this.set("attachTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContext(value: () => js.Any): Self = this.set("getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContext(value: js.Any => Unit): Self = this.set("setContext", js.Any.fromFunction1(value))
  }
}
