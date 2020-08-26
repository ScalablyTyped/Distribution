package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends js.Object {
  /**
    * Dashicon icon slug.
    */
  var icon: Icon = js.native
  /**
    * Describes whether or not the control is disabled.
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Human-readable title for the control.
    */
  var title: String = js.native
  /**
    * Function to invoke when the option is selected.
    */
  def onClick(): Unit = js.native
}

object Control {
  @scala.inline
  def apply(icon: Icon, onClick: () => Unit, title: String): Control = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
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
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
  }
  
}

