package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The component for a menu item. `<li>`
	 */
@js.native
trait MenuItem extends ClickableComponent {
  @JSName("options_")
  var options__MenuItem: MenuItemOptions = js.native
  /**
  		 * Set the state for this menu item as selected or not.
  		 *
  		 * @param selected
  		 *        if the menu item is selected or not
  		 */
  def selected(selected: scala.Boolean): scala.Unit = js.native
}

