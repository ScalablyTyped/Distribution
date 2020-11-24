package typings.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait W2Event extends js.Object {
  
  def onComplete(): Unit = js.native
  
  var target: String = js.native
}
object W2Event {
  
  @scala.inline
  def apply(onComplete: () => Unit, target: String): W2Event = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[W2Event]
  }
  
  @scala.inline
  implicit class W2EventOps[Self <: W2Event] (val x: Self) extends AnyVal {
    
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
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
