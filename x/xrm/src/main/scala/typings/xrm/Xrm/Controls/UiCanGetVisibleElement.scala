package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the visibility value read.
  */
trait UiCanGetVisibleElement extends js.Object {
  /**
    * Gets the visibility state.
    * @returns true if the tab is visible, otherwise false.
    */
  def getVisible(): Boolean
}

object UiCanGetVisibleElement {
  @scala.inline
  def apply(getVisible: () => Boolean): UiCanGetVisibleElement = {
    val __obj = js.Dynamic.literal(getVisible = js.Any.fromFunction0(getVisible))
  
    __obj.asInstanceOf[UiCanGetVisibleElement]
  }
}

