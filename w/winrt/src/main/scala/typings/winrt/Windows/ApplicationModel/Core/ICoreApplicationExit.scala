package typings.winrt.Windows.ApplicationModel.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreApplicationExit extends js.Object {
  
  def exit(): Unit = js.native
  
  var onexiting: js.Any = js.native
}
object ICoreApplicationExit {
  
  @scala.inline
  def apply(exit: () => Unit, onexiting: js.Any): ICoreApplicationExit = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction0(exit), onexiting = onexiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreApplicationExit]
  }
  
  @scala.inline
  implicit class ICoreApplicationExitOps[Self <: ICoreApplicationExit] (val x: Self) extends AnyVal {
    
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
    def setExit(value: () => Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnexiting(value: js.Any): Self = this.set("onexiting", value.asInstanceOf[js.Any])
  }
}
