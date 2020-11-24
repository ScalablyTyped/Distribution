package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleFocusOutside extends js.Object {
  
  def handleFocusOutside(): Unit = js.native
}
object HandleFocusOutside {
  
  @scala.inline
  def apply(handleFocusOutside: () => Unit): HandleFocusOutside = {
    val __obj = js.Dynamic.literal(handleFocusOutside = js.Any.fromFunction0(handleFocusOutside))
    __obj.asInstanceOf[HandleFocusOutside]
  }
  
  @scala.inline
  implicit class HandleFocusOutsideOps[Self <: HandleFocusOutside] (val x: Self) extends AnyVal {
    
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
    def setHandleFocusOutside(value: () => Unit): Self = this.set("handleFocusOutside", js.Any.fromFunction0(value))
  }
}
