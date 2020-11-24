package typings.toastifyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowToast extends js.Object {
  
  def showToast(): Unit = js.native
}
object ShowToast {
  
  @scala.inline
  def apply(showToast: () => Unit): ShowToast = {
    val __obj = js.Dynamic.literal(showToast = js.Any.fromFunction0(showToast))
    __obj.asInstanceOf[ShowToast]
  }
  
  @scala.inline
  implicit class ShowToastOps[Self <: ShowToast] (val x: Self) extends AnyVal {
    
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
    def setShowToast(value: () => Unit): Self = this.set("showToast", js.Any.fromFunction0(value))
  }
}
