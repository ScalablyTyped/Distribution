package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait clipbuffer extends js.Object {
  
  def destructor(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def init(): Unit = js.native
  
  def set(text: String): Unit = js.native
}
object clipbuffer {
  
  @scala.inline
  def apply(destructor: () => Unit, focus: () => Unit, init: () => Unit, set: String => Unit): clipbuffer = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[clipbuffer]
  }
  
  @scala.inline
  implicit class clipbufferOps[Self <: clipbuffer] (val x: Self) extends AnyVal {
    
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
    def setDestructor(value: () => Unit): Self = this.set("destructor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
