package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements with labels.
  */
@js.native
trait UiLabelElement extends js.Object {
  
  /**
    * Gets the label.
    * @returns The label.
    */
  def getLabel(): String = js.native
  
  /**
    * Sets the label.
    * @param label The label.
    */
  def setLabel(label: String): Unit = js.native
}
object UiLabelElement {
  
  @scala.inline
  def apply(getLabel: () => String, setLabel: String => Unit): UiLabelElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[UiLabelElement]
  }
  
  @scala.inline
  implicit class UiLabelElementOps[Self <: UiLabelElement] (val x: Self) extends AnyVal {
    
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
    def setGetLabel(value: () => String): Self = this.set("getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLabel(value: String => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
  }
}
