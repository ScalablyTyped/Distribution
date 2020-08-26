package typings.wordpressComponents.dropdownMod.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  /**
    * Whether the dropdown menu is opened or not.
    */
  var isOpen: Boolean = js.native
  /**
    * A function that closes the menu if invoked.
    */
  def onClose(): Unit = js.native
  /**
    * A function switching the dropdown menu's state from open to closed
    * and vice versa.
    */
  def onToggle(): Unit = js.native
}

object RenderProps {
  @scala.inline
  def apply(isOpen: Boolean, onClose: () => Unit, onToggle: () => Unit): RenderProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onToggle = js.Any.fromFunction0(onToggle))
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setOnToggle(value: () => Unit): Self = this.set("onToggle", js.Any.fromFunction0(value))
  }
  
}

