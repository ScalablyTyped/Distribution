package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for focusable UI elements.
  */
@js.native
trait UiFocusable extends js.Object {
  
  /**
    * Sets focus on the element.
    */
  def setFocus(): Unit = js.native
}
object UiFocusable {
  
  @scala.inline
  def apply(setFocus: () => Unit): UiFocusable = {
    val __obj = js.Dynamic.literal(setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[UiFocusable]
  }
  
  @scala.inline
  implicit class UiFocusableOps[Self <: UiFocusable] (val x: Self) extends AnyVal {
    
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
    def setSetFocus(value: () => Unit): Self = this.set("setFocus", js.Any.fromFunction0(value))
  }
}
