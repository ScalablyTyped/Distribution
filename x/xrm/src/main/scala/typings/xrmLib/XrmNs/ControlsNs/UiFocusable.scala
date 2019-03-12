package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for focusable UI elements.
  */
trait UiFocusable extends js.Object {
  /**
    * Sets focus on the element.
    */
  def setFocus(): scala.Unit
}

object UiFocusable {
  @scala.inline
  def apply(setFocus: () => scala.Unit): UiFocusable = {
    val __obj = js.Dynamic.literal(setFocus = js.Any.fromFunction0(setFocus))
  
    __obj.asInstanceOf[UiFocusable]
  }
}

