package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayBox extends js.Object {
  
  def hideOverlay(): Unit = js.native
  
  def showOverlay(): Unit = js.native
}
object OverlayBox {
  
  @scala.inline
  def apply(hideOverlay: () => Unit, showOverlay: () => Unit): OverlayBox = {
    val __obj = js.Dynamic.literal(hideOverlay = js.Any.fromFunction0(hideOverlay), showOverlay = js.Any.fromFunction0(showOverlay))
    __obj.asInstanceOf[OverlayBox]
  }
  
  @scala.inline
  implicit class OverlayBoxOps[Self <: OverlayBox] (val x: Self) extends AnyVal {
    
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
    def setHideOverlay(value: () => Unit): Self = this.set("hideOverlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowOverlay(value: () => Unit): Self = this.set("showOverlay", js.Any.fromFunction0(value))
  }
}
