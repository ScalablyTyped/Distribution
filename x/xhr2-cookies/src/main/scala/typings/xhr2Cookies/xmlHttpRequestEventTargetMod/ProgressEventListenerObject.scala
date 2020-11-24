package typings.xhr2Cookies.xmlHttpRequestEventTargetMod

import typings.xhr2Cookies.progressEventMod.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressEventListenerObject extends js.Object {
  
  def handleEvent(event: ProgressEvent): Unit = js.native
}
object ProgressEventListenerObject {
  
  @scala.inline
  def apply(handleEvent: ProgressEvent => Unit): ProgressEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[ProgressEventListenerObject]
  }
  
  @scala.inline
  implicit class ProgressEventListenerObjectOps[Self <: ProgressEventListenerObject] (val x: Self) extends AnyVal {
    
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
    def setHandleEvent(value: ProgressEvent => Unit): Self = this.set("handleEvent", js.Any.fromFunction1(value))
  }
}
