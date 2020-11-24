package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the visibility value updated.
  */
@js.native
trait UiCanSetVisibleElement extends js.Object {
  
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit = js.native
}
object UiCanSetVisibleElement {
  
  @scala.inline
  def apply(setVisible: Boolean => Unit): UiCanSetVisibleElement = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[UiCanSetVisibleElement]
  }
  
  @scala.inline
  implicit class UiCanSetVisibleElementOps[Self <: UiCanSetVisibleElement] (val x: Self) extends AnyVal {
    
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
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
  }
}
