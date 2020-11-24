package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitToggleElement extends js.Object {
  
  def toggle(): Unit = js.native
}
object UIkitToggleElement {
  
  @scala.inline
  def apply(toggle: () => Unit): UIkitToggleElement = {
    val __obj = js.Dynamic.literal(toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[UIkitToggleElement]
  }
  
  @scala.inline
  implicit class UIkitToggleElementOps[Self <: UIkitToggleElement] (val x: Self) extends AnyVal {
    
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
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
