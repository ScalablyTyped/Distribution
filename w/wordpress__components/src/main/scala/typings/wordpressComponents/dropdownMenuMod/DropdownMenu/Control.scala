package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control extends js.Object {
  /**
    * Dashicon icon slug.
    */
  var icon: Icon
  /**
    * Describes whether or not the control is disabled.
    */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Human-readable title for the control.
    */
  var title: String
  /**
    * Function to invoke when the option is selected.
    */
  def onClick(): Unit
}

object Control {
  @scala.inline
  def apply(icon: Icon, onClick: () => Unit, title: String, isDisabled: js.UndefOr[Boolean] = js.undefined): Control = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
}

