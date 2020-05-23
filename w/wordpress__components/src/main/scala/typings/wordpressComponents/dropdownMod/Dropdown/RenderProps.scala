package typings.wordpressComponents.dropdownMod.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  /**
    * Whether the dropdown menu is opened or not.
    */
  var isOpen: Boolean
  /**
    * A function that closes the menu if invoked.
    */
  def onClose(): Unit
  /**
    * A function switching the dropdown menu's state from open to closed
    * and vice versa.
    */
  def onToggle(): Unit
}

object RenderProps {
  @scala.inline
  def apply(isOpen: Boolean, onClose: () => Unit, onToggle: () => Unit): RenderProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onToggle = js.Any.fromFunction0(onToggle))
    __obj.asInstanceOf[RenderProps]
  }
}

