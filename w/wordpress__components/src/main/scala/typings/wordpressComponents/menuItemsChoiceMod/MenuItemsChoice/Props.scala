package typings.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Array of choices.
    */
  var choices: js.Array[Choice]
  /**
    * Value of currently selected choice (should match a `value` property
    * from a choice in `choices`).
    */
  var value: String
  /**
    * Callback function to be called with the selected choice when user
    * selects a new choice.
    */
  def onSelect(value: String): Unit
}

object Props {
  @scala.inline
  def apply(choices: js.Array[Choice], onSelect: String => Unit, value: String): Props = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

