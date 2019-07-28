package typings.uikit.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalElement extends js.Object {
  /**
    * Hide the modal
    */
  def hide(): Unit
  /**
    * Return if the modal is active on the page
    * @return True if the modal is current active on the page, false otherwise
    */
  def isActive(): Boolean
  /**
    * Show the modal
    */
  def show(): Unit
}

object ModalElement {
  @scala.inline
  def apply(hide: () => Unit, isActive: () => Boolean, show: () => Unit): ModalElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isActive = js.Any.fromFunction0(isActive), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[ModalElement]
  }
}

