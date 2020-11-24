package typings.wepy.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait event extends js.Object {
  
  @JSName("$destroy")
  def $destroy(): Unit = js.native
  
  @JSName("$transfor")
  def $transfor(wxevent: js.Array[_]): Unit = js.native
  
  var active: Boolean = js.native
}
object event {
  
  @scala.inline
  def apply($destroy: () => Unit, $transfor: js.Array[_] => Unit, active: Boolean): event = {
    val __obj = js.Dynamic.literal($destroy = js.Any.fromFunction0($destroy), $transfor = js.Any.fromFunction1($transfor), active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[event]
  }
  
  @scala.inline
  implicit class eventOps[Self <: event] (val x: Self) extends AnyVal {
    
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
    def set$destroy(value: () => Unit): Self = this.set("$destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def set$transfor(value: js.Array[_] => Unit): Self = this.set("$transfor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
  }
}
