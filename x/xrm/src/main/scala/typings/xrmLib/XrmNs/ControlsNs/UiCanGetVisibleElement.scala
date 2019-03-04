package typings
package xrmLib.XrmNs.ControlsNs

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
  def getVisible(): scala.Boolean
}

object UiCanGetVisibleElement {
  @scala.inline
  def apply(getVisible: js.Function0[scala.Boolean]): UiCanGetVisibleElement = {
    val __obj = js.Dynamic.literal(getVisible = getVisible)
  
    __obj.asInstanceOf[UiCanGetVisibleElement]
  }
}

