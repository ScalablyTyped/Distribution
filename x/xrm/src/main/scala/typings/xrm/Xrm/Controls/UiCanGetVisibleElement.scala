package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the visibility value read.
  */
@js.native
trait UiCanGetVisibleElement extends js.Object {
  /**
    * Gets the visibility state.
    * @returns true if the tab is visible, otherwise false.
    */
  def getVisible(): Boolean = js.native
}

object UiCanGetVisibleElement {
  @scala.inline
  def apply(getVisible: () => Boolean): UiCanGetVisibleElement = {
    val __obj = js.Dynamic.literal(getVisible = js.Any.fromFunction0(getVisible))
    __obj.asInstanceOf[UiCanGetVisibleElement]
  }
  @scala.inline
  implicit class UiCanGetVisibleElementOps[Self <: UiCanGetVisibleElement] (val x: Self) extends AnyVal {
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
    def setGetVisible(value: () => Boolean): Self = this.set("getVisible", js.Any.fromFunction0(value))
  }
  
}

