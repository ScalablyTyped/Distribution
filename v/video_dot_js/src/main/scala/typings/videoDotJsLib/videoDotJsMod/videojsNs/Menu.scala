package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Menu component is used to build popup menus, including subtitle and
	 * captions selection menus.
	 */
@js.native
trait Menu extends Component {
  var `menuButton_`: MenuButton = js.native
  @JSName("options_")
  var options__Menu: MenuOptions = js.native
  /**
  		 * Add a {@link MenuItem} to the menu.
  		 *
  		 * @param component
  		 *        The name or instance of the `MenuItem` to add.
  		 *
  		 */
  def addItem(component: java.lang.String): scala.Unit = js.native
  def addItem(component: MenuItem): scala.Unit = js.native
  def focus(item: js.Any): scala.Unit = js.native
  /**
  		 * Handle a `keydown` event on this menu. This listener is added in the constructor.
  		 *
  		 * @param event
  		 *        A `keydown` event that happened on the menu.
  		 *
  		 * @listens keydown
  		 */
  def handleKeyPress(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Move to previous (higher) menu item for keyboard users.
  		 */
  def stepBack(): scala.Unit = js.native
  /**
  		 * Move to next (lower) menu item for keyboard users.
  		 */
  def stepForward(): scala.Unit = js.native
}

